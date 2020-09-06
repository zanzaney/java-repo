import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n =scn.nextInt();
        int a = 0;//we know that the first number in fibonacci sequence is 0
        int b = 1;//we know that the second number in fibonacci sequence is 1
    
        for(int i =1;i<=n;i++){//the outer loop to access all rows
            for(int j=1;j<=i;j++){//the inner loop to define all elements in a row
                
                System.out.print(a+"\t");//print the next fibonacci number
                int c =a+b;//initialize c = a+b
                a=b;//the variable a then moves to the next number
                b=c;//the variable b then moves to the value of c
                
            }
            System.out.println();//enter a new line(after each row)
        }

    }
}
