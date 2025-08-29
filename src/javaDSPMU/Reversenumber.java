package javaDSPMU;

import java.util.Scanner;

public class Reversenumber {

	private static long reverse(long num) {
		// TODO Auto-generated method stub
		if(num <= 9) {
			return 0;
		}
		long reversed = 0;
		while(num != 0) {
			long digit = num % 10;//to extract the rightmost number
			reversed = reversed * 10 + digit;
			num = num/10;//removing the rightmost number
		}
		return reversed;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number to reverse: ");
		long num = sc.nextLong();
		long result = reverse(num);
		if(result == 0) {
		System.out.println("Pls enter two digit number");
		}
		else {
			System.out.println("The Reversed number is: " + result);
		}
	}

	

}
