import java.util.*;

public class Any_base_any_base {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();//take the input number
		int b = scn.nextInt();//take the base of the input number
		int base = scn.nextInt();//enter the required base to be converted to
		int d = getValueAnyBase(n,b, base);//function to convert the number to the required base
		System.out.println(d);//print the result
	}
	
public static int getValueAnyBase(int n, int b, int base) {//defining the function
	int rv =0;//return value is 0 initially
	int p=1;//any number to the power of 0 is 1
	while(n>0) {
		int dig = n%base;//remainder after dividing with the required base
		n=n/base;//reducing the number after dividing with the required base
		rv+=dig*p;//take the sum of all the products of the remainders and the power
		p=p*b;//this is the power of the number
	}
	return rv;//return the value
}
}
