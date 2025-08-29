package OOPS;

public class Animal {

	private String eating;
	private String canrun;
	private int limbs;
	
	public Animal() {
		
	}
	public Animal(String e) {
		eating = e;
	}
	
	public String getEating() {
		return eating;
	}
	public void setEating(String eating) {
		this.eating = eating;
	}
	public String getCanrun() {
		return canrun;
	}
	public void setCanrun(String canrun) {
		this.canrun = canrun;
	}
	public int getLimbs() {
		return limbs;
	}
	public void setLimbs(int limbs) {
		this.limbs = limbs;
	}
	
}
