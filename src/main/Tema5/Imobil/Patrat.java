package main;

public class Patrat extends Forma {

	public Patrat() {
		super();
	}

	public Patrat(int latura) {
		this.setLungime(latura);
		this.setLatime(latura);
	}
	
	public void afiseazaInformatii() {
		System.out.println("Latura patratului este de "+ this.getLungime() +" cm.");
	}		
	
	public void afiseazaAria() {
		System.out.println("Aria patratului este: "+this.getLatime()*this.getLungime()+" cm patrati.");
	}
	public void afiseazaPerimetru() {
		System.out.println("Perimentrul patratului este: "+(this.getLatime()+this.getLungime()));
	}

}
