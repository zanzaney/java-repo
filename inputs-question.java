import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    for(int i=1; i<=t;i++){//t number of inputs
      int n = scn.nextInt();
      int div = 2;
      while(div*div<=n){
        if(n%div==0){          
          break;
        }
        div++;
      }
        if (div*div>n){
          System.out.println("prime");
        }
        else{
          System.out.println("not prime");
        }
      
      //if ((n%n == 0) && (n%1 == 0))// this condition won't work as we are considering only two conditions which is satisfied by not prime numbers also. But, we only want it to be divisible by 1 and itself
        
      
      
    }
  }
}
 
