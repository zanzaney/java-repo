import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();// input
    int nod = 0;//number of digits
    int temp = n;//storing the input in variable temp
    while(temp>0){//block of code to calculate the number of digits
        temp=temp/10;
        nod++;
       
    }
    int div = (int)Math.pow(10,nod-1);//the formula for getting the divisor to start with
    while(div>0){
      int q = n/div;//the last digit gets cut
      System.out.println(q);
      n=n%div;//the remaining digits come into picture
      div=div/10;//reducing the divisor by dividing by 10
    }
  }
}
