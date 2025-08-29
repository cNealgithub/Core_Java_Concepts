package javaplayground;

import java.util.Scanner;

public class PercentageCalculator {

	public static void main(String[]args) {
		System.out.print("Enter the full aggregated marks of the exam :");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		double fm = s.nextDouble();
		//Inputs for all subjects
		System.out.print("Enter English marks: ");
		float Eng = s.nextFloat();
		System.out.print("Enter Physics marks: ");
		float Phy = s.nextFloat();
		System.out.print("Enter Hindi marks: ");
		float Hin = s.nextFloat();
		System.out.print("Enter Computer marks: ");
		float Comp = s.nextFloat();
		System.out.print("Enter Maths marks: ");
		float Maths = s.nextFloat();
		//Sum calculation
		double Ssum = Eng+Phy+Hin+Comp+Maths;
		System.out.println("Your achieved total out of " + (int)fm + " is " + Ssum);
		double percentage = (Ssum / fm)*100;//casting Ssum into double so java performs floating point division to get exact percentage (or i could have declared fm and Ssum as double type variables)
		System.out.println("Your Percentage:" + percentage);
	}
}
