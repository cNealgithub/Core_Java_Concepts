package OOPS;

public class Student {

	//instance variables/members
	private int studentID;
	private String Name;
	private String City;
	private String Classandsection;
	
	//default Constructor:: if not initialized by you java will provide it automatically.
	//NOTE:for constructor overloading the constructors should have differnt numbers of parameters or different type of parameter
	public Student() {
		
	}
	//constructor overloading
	public Student(int id, String name, String city, String classsection) {
		studentID = id;
		Name = name;
		City = city;
		Classandsection = classsection;
	}
	//instance methods
	public void setData(int id, String n, String c, String cs) {
		studentID = id;
		Name = n;
		City = c;
		Classandsection = cs;
	}
	
	public void showDetails() {
		System.out.println("Student ID: " + studentID);
		System.out.println("Student Nmae: " + Name);
		System.out.println("Student City: " + City);
		System.out.println("Student Class and Section: " + Classandsection);
		System.out.print("\n");
	}
}
