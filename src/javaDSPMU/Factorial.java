package javaDSPMU;
import java.util.Scanner;

public class Factorial {

	public static long factorial(long n) {
		long fact0 = 1;
		while(n != 0) {
			fact0 = fact0 * n;
			n--;
		}
		return fact0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to find factorial: ");
		int num = sc.nextInt();
		/*
		 * int fact = 1; while(num != 0) { fact = fact*num; num--; }
		 */
		long result = factorial(num);
		System.out.println("The Factorial is: " + result);
	}

}
