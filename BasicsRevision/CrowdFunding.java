import java.util.HashMap;
import java.util.Map;

public class CrowdFunding {

    private Map<String, Integer> contributors = new HashMap<>();
    private String manager;
    private int minimumContribution;
    private long deadline;
    private int target;
    private int raisedAmount;
    private int noOfContributors;

    private static class Request {
        String description;
        String recipient;
        int value;
        boolean completed;
        int noOfVoters;
        Map<String, Boolean> voters;

        Request(String description, String recipient, int value) {
            this.description = description;
            this.recipient = recipient;
            this.value = value;
            this.completed = false;
            this.noOfVoters = 0;
            this.voters = new HashMap<>();
        }
    }

    private Map<Integer, Request> requests = new HashMap<>();
    private int numRequests;

    public CrowdFunding(int target, int deadline) {
        this.target = target;
        this.deadline = System.currentTimeMillis() / 1000 + deadline;
        this.minimumContribution = 100;
        this.manager = "contract_creator_address"; // Replace with the actual address of the contract creator
    }

    public void sendEth(String contributor, int value) {
        if (System.currentTimeMillis() / 1000 < deadline) {
            if (!contributors.containsKey(contributor)) {
                noOfContributors++;
            }
            contributors.put(contributor, contributors.getOrDefault(contributor, 0) + value);
            raisedAmount += value;
        } else {
            System.out.println("Deadline has passed");
        }
    }

    public int getContractBalance() {
        return raisedAmount;
    }

    public void refund(String contributor) {
        if (System.currentTimeMillis() / 1000 > deadline && raisedAmount < target) {
            if (contributors.containsKey(contributor) && contributors.get(contributor) > 0) {
                int amount = contributors.get(contributor);
                contributors.put(contributor, 0);
                System.out.println("Refunded " + amount + " to " + contributor);
            } else {
                System.out.println("You are not eligible for a refund");
            }
        }
    }

    public void createRequest(String description, String recipient, int value) {
        Request newRequest = new Request(description, recipient, value);
        requests.put(numRequests, newRequest);
        numRequests++;
    }

    public void voteRequest(String contributor, int requestNo) {
        if (contributors.containsKey(contributor) && contributors.get(contributor) > 0) {
            Request thisRequest = requests.get(requestNo);
            if (!thisRequest.voters.containsKey(contributor)) {
                thisRequest.voters.put(contributor, true);
                thisRequest.noOfVoters++;
            } else {
                System.out.println("You have already voted");
            }
        } else {
            System.out.println("You must be a contributor");
        }
    }

    public void makePayment(int requestNo) {
        if (raisedAmount >= target) {
            Request thisRequest = requests.get(requestNo);
            if (!thisRequest.completed && thisRequest.noOfVoters > noOfContributors / 2) {
                System.out.println("Transferring " + thisRequest.value + " to " + thisRequest.recipient);
                thisRequest.completed = true;
            } else {
                System.out.println("The request has been completed or does not have majority support");
            }
        }
    }
//

    public static void main(String[] args) {
        CrowdFunding crowdFunding = new CrowdFunding(1000, 3600);

        // Test 1: Contributor sends 150 ether
        crowdFunding.sendEth("contributor1", 150);
        System.out.println("Contract balance after contribution: " + crowdFunding.getContractBalance());

        // Test 2: Manager creates a request
        crowdFunding.createRequest("Buy equipment", "recipient_address", 200);
        System.out.println("Number of requests after creation: " + crowdFunding.numRequests);

        // Test 3: Contributor votes for the request
        crowdFunding.voteRequest("contributor1", 0);
        System.out.println("Number of voters for request 0: " + crowdFunding.requests.get(0).noOfVoters);

        // Test 4: Manager makes payment for the request
        crowdFunding.makePayment(0);
        System.out.println("Contract balance after payment: " + crowdFunding.getContractBalance());

        // Test 5: Contributor attempts to get a refund after the deadline
        crowdFunding.refund("contributor1");
        System.out.println("Contract balance after refund attempt: " + crowdFunding.getContractBalance());

        // Test 6: Wait until after the deadline
        try {
            Thread.sleep(4000); // Wait for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Test 7: Contributor attempts to get a refund after the deadline
        crowdFunding.refund("contributor1");
        System.out.println("Contract balance after refund attempt: " + crowdFunding.getContractBalance());
    }
}





