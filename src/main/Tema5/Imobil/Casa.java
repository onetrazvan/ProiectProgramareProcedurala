package main;

public class Casa extends Imobil {

	public Casa() {
		super();
	}

	public Casa(String tipCasa) {
		super(tipCasa);
	}

	public Casa(String tipCasa, int nrEtaje) {
		super(tipCasa, nrEtaje);
	}

	public Casa(String tipCasa, int nrEtaje, double pret) {
		super(tipCasa, nrEtaje, pret);
	}
	
	public void afiseazaInformatii() {
		System.out.println("Casa are "+this.getNrEtaje()+" etaje, si costa "+this.getPret()+" de euro");
	}
	
	public void afiseazaInformatii(String oras) {
		System.out.println("Casa are "+this.getNrEtaje()+" etaje, costa "+this.getPret()+" euro, si se afla in orasul "+oras);
	}

}
