package OOPS;

public class Class_and_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //creating new object "Aman" for Student class 
		Student Aman = new Student();
		//Setting data for object Aman
		Aman.setData(125, "Aman Sharma", "Ranchi", "12A");
		//showing details of Aman
		Aman.showDetails();
		
		//new object Shyam
		Student Shyam = new Student(126, "Shyam Raisinghani", "Ranchi", "10A");//using parametrized constructor to set data for student Shyam
		Shyam.showDetails();
	}

}
