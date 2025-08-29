package javaplayground;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int i = 0;
		int n1, n2;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Press 1 to Add two numbers");
			System.out.println("Press 2 to substract two numbers");
			System.out.println("Press 3 to multiply two numbers");
			System.out.println("Press 4 to divide two numbers");
			System.out.println("Press 5 to terminate");
			System.out.println("Enter your choie:");
				i = s.nextInt();
		
		Operationsimpl op = new Operationsimpl();
		switch (i) {
		case 1:
			System.out.println("Enter First number");
			n1 = s.nextInt();
			System.out.println("Enter second number");
			n2 = s.nextInt();
			int res = op.sum(n1, n2);
			System.out.println("The sum is :" + res);
			break;
		case 2:
			System.out.println("Enter First number");
			n1 = s.nextInt();
			System.out.println("Enter second number");
			n2 = s.nextInt();
			int res2 = op.substract(n1, n2);
			System.out.println("The result after substraction is :" + res2);
			break;
		case 3:
			System.out.println("Enter First number");
			n1 = s.nextInt();
			System.out.println("Enter second number");
			n2 = s.nextInt();
			int res3 = op.multiply(n1, n2);
			System.out.println("The product is :" + res3);
			break;
		case 4:
			System.out.println("Enter First number");
			n1 = s.nextInt();
			System.out.println("Enter second number");
			n2 = s.nextInt();
			int res4 = op.divide(n1, n2);
			System.out.println("The quotent is :" + res4);
			break;
		case 5:
			System.out.println("Terminating the program");
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		} while (i != 5);
	}

}
