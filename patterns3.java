import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int sp =n-1;//the number of spaces in the first row and every row is n-1
        int st = 1;//starting with 1 star in the first row
        for (int i =1;i<=n;i++){
            for(int j=1;j<=sp;j++){//run the loop for giving spaces
                System.out.print("\t");
            }
            for(int k=1;k<=st;k++){//run the loop for number of stars
                System.out.print("*\t");
            }
            sp--;//decrementing the number of spaces after every row
            st++;//incrementing the number of stars after every row
            System.out.println();//enter next line
        }

    }
}
