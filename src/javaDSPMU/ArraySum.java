package javaDSPMU;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		//user input for array elements
		System.out.println("Enter the elements");
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("The Array Elements are: ");
		int sum = 0;
		for(int i:arr) {
			System.out.print(i+" ");
			sum = sum + i;
		}
		System.out.println("The Sum Of Array Elements is : " + sum);
	}

}
