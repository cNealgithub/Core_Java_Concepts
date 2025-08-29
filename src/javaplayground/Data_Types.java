package javaplayground;

public class Data_Types {
	public static void main(String[] args) {
		//<-----------------PRIMITIVE DATA TYPES-------------->
		
		//the various types for storing integer values:-
		//1) short- for small integer values.
		short s = 45;
		//2) int-holds integer values from -2,147,483,648 to 2,147,483,647.
		int integer = 485554794;
		//3) long-holds integers beyond the range of 'int' datatype.
		long l = 1245897856;
		System.out.println("The value for Short = " + s);
		System.out.println("The value for int = " + integer);
		System.out.println("The value for long = " + l);
		//float data type can be of two types:-
		//1) float-floating point numbers
		//Note: by defalut floating point numbers in java are of type double , so we need to add 'f' behind a floating no. to specify javac that it is a float data-type
		float flo = 2.538f;
		//2) double-for floating point numbers beyond the range of 'float' data-type
		double db = 25.4789879457888;
		System.out.println("The value of float = " + flo);
		System.out.println("The value of double = " + db);
		//char datatype or character datatype for storing characters
		//NOTE: should be written in single quottes
		char c = 'a';
		System.out.println("The value of char = " + c);
		//String- string is used to store array/list of characters
		//NOTE: should be written in double quottes
		String str = "Hey this is a string";
		System.out.println("The value of string = " + str);
	}

}
