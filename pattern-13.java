import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        //write your code here
       int n = scn.nextInt();//take an input
        
        for (int i =0;i<n;i++){//making the required number of rows
            int icj=1;//initialize value of icj = 1
            for(int j = 0;j<=i;j++){//accessing all the number of required elements in a row
                System.out.print(icj+"\t");//print te value of icj
                int icjp1 = icj*(i-j)/(j+1);//the formula of calculating the value in the next column by using the value in the current column
                
                icj = icjp1;//push the value of icjp1 to icj as that will be printed
                
            }
            System.out.println();//new line after every row
        }

    }
}
