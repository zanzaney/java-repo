import java.util.*;

public class Any_base_decimal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();//take the input number n
		int b = scn.nextInt();//take the base of the number n
		int d = getValueInDecimal(n,b);//use a function to calculate the value in decimal
		System.out.println(d);
	}
public static int getValueInDecimal(int n,int b) {//define the function
			int rv = 0;//return value is zero initially
			int p =1;//any number to the power of zero is 0
			while(n>0) {
				int dig = n%10;//take the remainder in each step
				n=n/10;//keep reducing the number
				rv+=dig*p;//return value = add all the products of the remainders and the increasing power of bases
				p=p*b;//increase the base power
			}
			return rv;//return the value
		}

	}
