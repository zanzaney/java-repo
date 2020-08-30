import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int od= 0;//original digit
    int op=1;//original position
    int inv = 0;//initializing inv variable
    while(n>0){
    
      od = n%10;//after taking remainder, we get the last digit. Set that to original digit
      int ip=od;//set original digit to inverse position
      int id=op;//set inverse digit to original position

      //calculation of inverse number(adding all digits)
      
    inv = inv + id * (int)Math.pow(10,ip-1);//formula for adding all digits in inverse
    n=n/10;//reducing the number
    op++;//increasing the original position(going to the next one)
    }
    System.out.println(inv);
  }
}
