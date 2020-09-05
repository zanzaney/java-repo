/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	  
	    for(int i =1;i<=n;i++){
	        for (int j=1;j<=n;j++){
	            if((i==j)||(i+j==n+1)){
	                System.out.print("*\t");
	            }else{
	                System.out.print("\t");
	            }
	            
	        }
	        System.out.println();
	    }
	}
}
