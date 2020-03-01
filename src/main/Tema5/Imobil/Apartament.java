package main;

public class Apartament extends Imobil {

	public Apartament() {
		super();
	}

	public Apartament(String tipCasa) {
		super(tipCasa);
	}

	public Apartament(String tipCasa, int nrEtaje) {
		super(tipCasa, nrEtaje);
	}

	public Apartament(String tipCasa, int nrEtaje, double pret) {
		super(tipCasa, nrEtaje, pret);
	}
	
	public void afiseazaInformatii() {
		System.out.println("Apartamentul are "+this.getNrEtaje()+" etaje, si costa "+this.getPret()+" de euro");
	}
	
	public void afiseazaInformatii(String oras) {
		System.out.println("Apartamentul are "+this.getNrEtaje()+" etaje, costa "+this.getPret()+" de euro, si se afla in orasul "+oras+ ".");
	}

}
