import java.util.*;

public class Main {

    public static void main(String[] args) {
        	Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int sp =0;//space is zero initially in the first row
        int st = n;//the number of stars are equal to the value of n in the first row
        for(int i =1;i<=n;i++){//running the for loop n times(n rows)
            for(int j=1;j<=sp;j++){//to give that many spaces
                System.out.print("\t");
            }
            for(int k =1;k<=st;k++){//to give that many stars per row
                System.out.print("*\t");
            }
            sp++;//number of spaces get increased row by row
            st--;//number of stars get decreased row by row
            System.out.println();//print a new line
        }

    }
}
