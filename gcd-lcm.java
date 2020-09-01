import java.util.*;

class Main {
  public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);
   int n1 = scn.nextInt();//take input 1
   int n2 = scn.nextInt();//take input 2
   int on1 = n1;//original number 1
   int on2 = n2;//original number 2(used for the formula of LCM)
   while(n1%n2 !=0){//while the remainder is not obtained as 0
     int rem = n1%n2;//store the remainder value
     n1 = rem;//next step
     n2 = n1;//next step
   }
   int gcd = n1;//the final divisor will be the GCD
   
   int lcm = (on1*on2)/gcd;//formula for calculating LCM
   System.out.println("The GCD is "+gcd+" and the LCM is "+lcm);//print the values of LCM and GCD
  }
}
