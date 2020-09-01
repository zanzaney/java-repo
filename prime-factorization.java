import java.util.*;

class Main {
  public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);

   
   int n = scn.nextInt();//take input 
   for(int i = 2; i * i <= n; i++){
            while(n % i == 0){//keep on dividing until remainder with that divisor is zero
                n = n / i;
                System.out.print(i + " ");//print the prime factors
                
            }
        }
        
        if(n != 1)//if that number is not getting divided by any number, then that number itself is also a prime factor
            System.out.print(n);
  }
}
