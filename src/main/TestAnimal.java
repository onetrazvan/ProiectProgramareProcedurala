package main;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal cat = new Animal();
		cat.setTipAnimal("Pisica");
		cat.setCuloare("Roz");
		cat.setVarsta(2);
		
		Animal dog = new Animal("Caine");
		dog.setCuloare("Negru");
		dog.setVarsta(3);
		
		Animal rabbit = new Animal("Iepure","Alb",1);
		
		System.out.println("Tip animal: " + cat.getTipAnimal() + "\nCuloare: " + cat.getCuloare() + "\nVarsta: " + cat.getVarsta());
		
	}

}
