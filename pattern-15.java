import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
         int n = scn.nextInt();
        int sp =n/2;//number of spaces in the first row from left side
        int st=1;//number of stars in the first row
        int val = 1;
        for (int i =1;i<=n;i++){//looping through all rows
            for (int j=1;j<=sp;j++){//to get the required spaces
                System.out.print("\t");
                
            }
            int cval =val;
            for(int k = 1;k<=st;k++){//to get the required numbers
                System.out.print(cval+"\t");
                if (k<=st/2){
                    cval++;
                }else{
                    cval--;
                }
               
            }
            if(i<=n/2){//till the number of rows is less than or equal to value n
                sp--;//number of spaces keeps reducing
                st+=2;//number of stars keep adding by 2
                val++;
            }else{
                sp++;//number of spaces get increased by one 
                st-=2;//number of stars get reduces by 2
                val--;
                
            }
            //val++;
            System.out.println();//moving to the next line
        }
    }
}
