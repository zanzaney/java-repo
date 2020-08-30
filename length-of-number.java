import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();// input
    int dig = 0;// counter 
    while(n>0){//while the number is always greater than 0 
      n=n/10;//for every division by ten, the last digit gets cut from the number
      dig++;//increment the value of counter
    }
    System.out.println(dig);//print the value of the counter
  }
}
