import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();//take input
     for(int i = 1;i<=n;i++){//looping for all rows
         for(int j = 1;j<=n;j++){//looping for all columns
             if (i==1){//row-wise operation -> first row
                 if(j==n || j<=n/2+1){
                     System.out.print("*\t");
                 }else{
                     System.out.print("\t");
                 }
                 
             }else if(i<=n/2){//row-wise operation -> second set of rows
                 if(j==n || j==n/2+1){
                     System.out.print("*\t");
                     
                 }else{
                     System.out.print("\t");
                 }
                 
             }else if (i==n/2+1){//row-wise operation -> middle row
                 System.out.print("*\t");
                 
             }else if(i<n){//row-wise operation -> third set of rows
                 if(j==1 || j==n/2+1){
                     System.out.print("*\t");
                 }else{
                     System.out.print("\t");
                 }
             }else{//row-wise operation -> last row
                 if(j==1 || j>=n/2+1){
                     System.out.print("*\t");
                 }else{
                     System.out.print("\t");
                 }
                 
             }
         }
         System.out.println();//enter new line
     }

 }
}
