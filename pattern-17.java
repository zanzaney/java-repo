import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();//take input
        int sp = n/2;//sp = n/2
        int st = 1;// one star in the first row
        for(int i = 1;i<=n;i++){//running the for loop to get all rows
            for(int j = 1;j<=sp;j++){//for loop for all spaces
                if(i==((n/2)+1)){//for the third row, stars have to be printed and there are no spaces
                    System.out.print("*\t");//print star
                }else
                System.out.print("\t");//else print spaces
            }
            for(int k = 1;k<=st;k++){//for loop to print the required number of stars
                System.out.print("*\t");//print stars
            }
            if(i<=n/2){//logic to print the required number stars based on the rows
                st++;
                
            }else{
                st--;
            }
            System.out.println();//enter new line
        }

    }
}
