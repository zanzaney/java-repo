import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
     int sp = 0;//initial space is 0
     int st = n;//number of stars in the first row
     for(int i = 1; i<=n; i++){//for loop to access all rows
         for(int j = 1;j<=sp;j++){//looping for the number of spaces
            System.out.print("\t");//space print
         }
         for(int k = 1;k<=st;k++){//number of stars loop
             if(i>1 && i<=n/2 && k>1 && k<st){//condition to get spaces in the upper half
                 System.out.print("\t");
             }else{
             System.out.print("*\t");
             }
         }
         if(i<=n/2){//logic to get the pattern
             st-=2;
             sp++;
         }else{
             st+=2;
             sp--;
         }
         System.out.println();//enmter new line
     }

 }
}
