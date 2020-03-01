package main;

public class testForma {

	public static void main(String[] args) {
		Forma patrat = new Forma(3,3);
		patrat.afiseazaInformatii();

		Patrat patrat1 = new Patrat(3);
		patrat1.afiseazaInformatii();
		patrat1.afiseazaAria();
		patrat1.afiseazaPerimetru();
		
		Cerc cerc1 = new Cerc(2);
		cerc1.afiseazaInformatii();
		cerc1.afiseazaAria();
		
		Dreptunghi dreptunghi1 = new Dreptunghi(2,5);
		dreptunghi1.afiseazaInformatii();
		dreptunghi1.afiseazaAria();
		dreptunghi1.afiseazaPerimetrul();
	}

}
