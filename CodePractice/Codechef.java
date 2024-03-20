import java.util.*;
// class Codechef
// {
// 	// public static void main (String[] args)
// 	// {
// 	// 	Scanner read = new Scanner(System.in);
		
// 	// 	int t = read.nextInt();
// 	// 	for(int i=0; i<t; i++)
// 	// 	{
// 	// 	    ArrayList<Integer> a = new ArrayList<Integer>();
// 	// 	    int n = read.nextInt();
// 	// 	    for(int j=1; j<=n; j++){
//     // 		    a.add(j);
// 	// 	    }
// 	// 	    System.out.println(a);
// 	// 	    Collections.sort(a, Collections.reverseOrder());
// 	// 	    System.out.println(a);
// 	// 	}
// 	// }


    
// }
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int start = sc.nextInt();
            int aim = sc.nextInt();
            int perYear = sc.nextInt();

            int yearsNeeded = (aim - start + perYear - 1) / perYear; // Use ceiling division
            System.out.println(yearsNeeded);

            t--;
        }

        sc.close();
    }
}
