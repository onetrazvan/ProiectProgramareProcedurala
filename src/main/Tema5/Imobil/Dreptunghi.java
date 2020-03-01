package main;

public class Dreptunghi extends Forma {

	public Dreptunghi() {
		super();
	}

	public Dreptunghi(int lungime, int latime) {
		super(lungime, latime);
	}
	
	public void afiseazaInformatii() {
		System.out.println("Lungimea dreptungiului: "+this.getLungime()+"\nLatimea dreptunghiului: " +this.getLatime());
	}
	
	public void afiseazaAria() {
		System.out.println("Aria dreptunghiului este de "+(this.getLatime()*this.getLungime())+" cm patrati.");
	}
	
	public void afiseazaPerimetrul() {
		System.out.println("Perimetrul dreptunghiului este de "+(this.getLatime()*2+this.getLungime()*2));
	}
}
