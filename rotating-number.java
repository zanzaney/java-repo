import java.util.*;
   
  class Main {
   
       public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
           int n = scn.nextInt();//take the input number
           int k = scn.nextInt();//take the number of time it has to be rotated
   
           int nod = 0;//number of digits 
           int temp = n;//
           while(temp != 0){//code to check length of number
               temp /= 10;
               nod++;
           }
   
           k = k % nod;//for big number of rotations
           if(k < 0){// for negative numbers
               k += nod;
           }
           int div = 1;//divisor
           int mult = 1;//multiplier
           for(int i = 1; i <= nod; i++){
               if(i <= k)
                   div *= 10;
               else 
                   mult *= 10;
           }
   
           int quo = n / div;
           int rem = n % div;
   
           int r = rem * mult + quo;
           System.out.println(r);
       }
   }
