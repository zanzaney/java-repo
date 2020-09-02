import java.util.*;

class Main {
  public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);
   int n = scn.nextInt();//take input
   for (int i = 1;i*i<=n;i++){//perfect squares in that range
     System.out.println(i*i);//print all the perfect squares as they will have odd number of toggles
   }
  }
}
