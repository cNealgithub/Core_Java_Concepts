package javaDSPMU;

public class Demo {

	public static void main(String[] args) {
		
		Factorial fact = new Factorial();
		
		// TODO Auto-generated method stub
		float a = 45f;
		float b = 7f;
		if(a > b) {
			float result = a-b; 
			System.out.println("result: "+ result);
		}
		else
			System.out.println("Operation is not possible");
		System.out.println("Lets Use factorial class");
		long factori =  fact.factorial(5);
		System.out.println("Factorial = " + factori);
	}
}
