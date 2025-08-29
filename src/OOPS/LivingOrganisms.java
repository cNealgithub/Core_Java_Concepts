package OOPS;

public class LivingOrganisms {
	
   public static void main(String[] args) { 
	Dog sheru = new Dog("Yes");
	//sheru.setEating("Yea");
	sheru.setCanrun("Yes");
	sheru.setLimbs(4);
	System.out.println("Can sheru eat: " + sheru.getCanrun());
	System.out.println("Can sheru run: " + sheru.getCanrun());
	System.out.println("Sheru has " + sheru.getLimbs() + " limbs");
	System.out.println("sheru " + sheru.sound());
	
	Cat ratose = new Cat(); //cat class has both default as well as a pa
	ratose.setEating("Home Food");
	ratose.setCanrun("Yes");
	ratose.setLimbs(3);
	System.out.print("\n");
	System.out.println("Can ratose eat: " + ratose.getEating());
	System.out.println("Can ratose run: " + ratose.getCanrun());
	System.out.println("ratose has " + ratose.getLimbs() + " limbs");
	System.out.println("ratose " + ratose.sound());
	
	Wild_Dog dogo = new Wild_Dog("Flesh");
	//dogo.setEating("Only Flesh");
	dogo.setCanrun("Yes");
	dogo.setLimbs(4);
	System.out.print("\n");
	System.out.println("what dogo eats: " + dogo.getEating());
	System.out.println("Can ratose run: " + dogo.getCanrun());
	System.out.println("ratose has " + dogo.getLimbs() + " limbs");
	System.out.println("ratose " + dogo.sound());
	System.out.println("Dogo lives in " + dogo.livesIn());
    }
}
