import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();//take the multi-digit number
        int d = scn.nextInt();//the digit whose frequency is to be found
        int f = getDigitFrequency(n, d);//function to get the frequency
        System.out.println(f);//print frequency
    }

    public static int getDigitFrequency(int n, int d) {//input parameters as n and d
        // write code here
        int count = 0;//the counter value is zero initially
        while(n>0){//when n is greater than 0
            int dig = n%10;//the remainders should be compared one by one
            n=n/10;//keep reducing the value of the number
            if(dig==d){//if the value of the digit in remainder is equal to the required digit
                count++;//increase the count
            }
        }
    
        return count;//return count
    }
    
}
