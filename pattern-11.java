import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int val = 1;//initialize a value called val to 1
        for(int i =1;i<=n;i++){//outer loop to get all rows
            for(int j=1;j<=i;j++){//inner loop to access all numbers to be printed in a row
                System.out.print(val+"\t");//printing the value of val in each row
                val++;//incrementing the value of val
        }
        System.out.println();
        }    
    }
}
