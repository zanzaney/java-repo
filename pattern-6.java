import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int st = n/2+1;
        int sp = 1;
        for (int i =1;i<=n;i++){
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            for(int k=1;k<=sp;k++){
                System.out.print("\t");
            }
            for(int l=1;l<=st;l++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                sp+=2;
                st--;
            }else{
                sp-=2;
                st++;
            }
            System.out.println();
        }

    }
}
