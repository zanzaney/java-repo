import java.util.*;

class Main {
  public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);
   int n1=scn.nextInt();
   int n2=scn.nextInt();
   int n3=scn.nextInt();
   if ((n1>n2) && (n1>n3)){
     if (n1*n1==n2*n2+n3*n3){
       System.out.println("It is a pythagorean triplet");
     }
   }else if ((n2>n1) && (n2>n3)){
     if (n2*n2==n1*n1+n3*n3){
       System.out.println("It is a pythagorean triplet");
     }
   }else{
     if (n3*n3==n2*n2+n1*n1){
       System.out.println("It is a pythagorean triplet");
     }
   }
  }
}
