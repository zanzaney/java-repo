import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int rv =0;//return value
       int p = 1;//power(10^0=1)
       while(n>0){
           int dig = n%b;//we take the remainders into consideration
           n=n/b;//keep reducing the number
           
           rv+=dig*p;//the logic of conversion(written in notebook)
           p=p*10;//multiply by 10
       }
       return rv;//return the value
   }
  }
