package main;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal cat = new Animal();
		cat.setTipAnimal("Pisica");
		cat.setCuloare("Roz");
		cat.setVarsta(2);
		
		cat.afiseazaInformatii();
		
		Pisica kitty = new Pisica("Pisica","Alba",1);
		kitty.afiseazaInformatii(3);
		kitty.afiseazaInformatii();
		
		Caine dog = new Caine("Caine","Negru",3);
		dog.afiseazaInformatii();
		dog.afiseazaInformatii(2);
		
		
	}

}
