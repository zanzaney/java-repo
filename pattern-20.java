import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();//take input
        for (int i = 1;i<=n;i++){//access all rows
            for(int j =1;j<=n;j++){//access all columns
                if(j==1 || j==n){//first and last columns have stars
                    System.out.print("*\t");
                }else if(i>n/2 && (i==j || i+j == n+1)){//the two diagonals after the middle row have stars
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");//print space otherwise
                }
            }
            System.out.println();//enter new line
        }
       
    
    }
}
