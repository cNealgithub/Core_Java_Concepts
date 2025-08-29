package javaplayground;

class Box{
	/*
	 * int l; int b; int h;
	 */
	int volume(int l, int b, int h) {
		return l*b*h;
	}
}

public class Volume {

	public static void main(String[]args) {
		Box x = new Box();
		/*
		 * x.l = 5; x.b = 2; x.h = 2;
		 */
		int result = x.volume(5 ,2 ,2);
		System.out.println("The volume is " + result);
	}
}
