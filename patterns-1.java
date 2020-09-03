import java.util.*;

public class Main {
//abstraction is discussed in this program. We should not worry about what the inner loop is doing when we think about the outer loop. Similarly, we need not think about what the outer loop is doing when we discuss about the inner loop.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                
            
            System.out.print("*\t");
           
        }
         System.out.println();
        }

    }
}
