public class Solution {
    public static int findInint(int key, int arr[]) {
        // Find the peak element
        int peakIdx = findPeakEle(arr);
    
        // Search to the left
        int leftRes = leftSearch(arr, key, 0, peakIdx);
        if (leftRes != -1) {
            return leftRes;
        }
    
        // Search to the right
        int rightRes = rightSearch(arr, key, peakIdx + 1, arr.length- 1);
        return rightRes;
    }
    public static int findPeakEle(int arr[]) {
        int st = 0;
        int end = arr.length - 1;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] < arr[mid+1]){
                st = mid + 1;
            } else {
                end = mid;
            }
        }
        return st;
    }
    public static int leftSearch(int arr[], int key, int st, int end) {
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == key) {
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                st = mid + 1;
            }
        }
        return ans;
    }
    public static int rightSearch(int arr[], int key, int st, int end) {
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == key) {
                ans = mid;
                st = mid + 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                st = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {0,5,3,1};
        System.out.println(findInint(1, arr));
    }
    
    
}
