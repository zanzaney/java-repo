import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
		int st = 1;
		int sp = 2*n-3;//number of spaces
		
		for(int i =1;i<=n;i++){//accessing all the rows
		    int val = 1;
		    for(int j = 1;j<=st;j++){
		        System.out.print(val+"\t");
		        val++;//the numbers go in increasing order
		    }
		    for(int k = 1;k<=sp;k++){
		        System.out.print("\t");
		    }
		    if(i==n){//this is for the last row
		        st--;//reduce the value of stars in the last row exclusively by 1
		        val--;//decrease the value 
		    }
		    for(int l = 1;l<=st;l++){
		        val--;//reduce the value before printing
		        System.out.print(val+"\t");
		        
		    }
		    
		    
		    st++;
		    sp-=2;
		    System.out.println();
		}

 }
}
