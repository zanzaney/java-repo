import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();// take an input number whose multiplication table is to be printed
        for (int i = 1;i<=10;i++){//looping from numbers 1 to 10
            System.out.println(n+" * "+ i +" = "+n*i);//print the product in new line
        }
        
    }
}
