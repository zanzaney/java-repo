import java.util.*;

class Main {
  public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();//take input
  while(n>0){
    int t=n%10;//divide by 10 and get remainder
    System.out.println(t);//print your remainder
    n=n/10;//update your number and set quotient to number
  }

 
  }
}
