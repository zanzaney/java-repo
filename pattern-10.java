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
	    int os = n/2;
	    int is=-1;
	    for(int i =1;i<=n;i++){
	   // System.out.print(os+","+is);
	    for(int j = 1;j<=os;j++){
	        System.out.print("\t");
	    }
	    System.out.print("*\t");
	    for(int k=1;k<=is;k++){
	        System.out.print("\t");
	    }
	    if(i>1&& i<n){
	        System.out.print("*\t");
	    }
	        if(i<=n/2){
	            os--;
	            is+=2;
	        }else{
	            os++;
	            is-=2;
	        }
	        System.out.println();
	        
	    }
	    
	}
}
