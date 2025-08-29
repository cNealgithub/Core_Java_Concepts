package javaDSPMU;

import java.util.Scanner;

public class isPrime {

	public static Boolean isPrime(long n) {
	    if (n < 2) return false; // Prime numbers start from 2
	    if (n == 2) return true; // 2 is the only even prime number
	    if (n % 2 == 0) return false; // Even numbers (except 2) aren't prime
	    
	    for (long i = 3; i * i <= n; i += 2) { // Check divisibility up to √n
	        if (n % i == 0) return false;
	    }
	    return true;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The number: ");
		long num = sc.nextLong();
		Boolean result = isPrime(num);
		if (result == true) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}

}
