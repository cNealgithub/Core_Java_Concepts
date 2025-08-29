package OOPS;

public class main_overrideimpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent parent = new Parent();
		parent.m1();
		Child child = new Child();
		child.m1();// when child object is created then runtime polymorphism happens
	}

}

class Parent {
	//overriden method
	public void m1() {
		System.out.println("This is m1() from parent class");
	}
}

class Child extends Parent {
	
	//overriding method
	@Override
	public void m1() {
		System.out.println("This is m1() from child class ::overriden m1() of Parent");
	}
}
//Rules 
//1) inheritance must be there.
//2) method name and return type,parameters must be same