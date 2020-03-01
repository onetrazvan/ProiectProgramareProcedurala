package main;

public class Imobil {

	private String tipCasa;
	private int nrEtaje;
	private double pret;
	
	public Imobil() {
		tipCasa = "";
		nrEtaje = 0;
		pret = 0.0;
	}
	
	public Imobil(String tipCasa) {
		this.tipCasa = tipCasa;
		this.nrEtaje = 0;
		this.pret = 0.0;
	}
	
	public Imobil(String tipCasa, int nrEtaje) {
		this.tipCasa = tipCasa;
		this.nrEtaje = nrEtaje;
		this.pret = 0.0;
	}
	
	public Imobil(String tipCasa, int nrEtaje, double pret) {
		this.tipCasa = tipCasa;
		this.nrEtaje = nrEtaje;
		this.pret = pret;
	}
	
	public void setTipCasa(String tipCasa) {
		this.tipCasa = tipCasa;
	}
	
	public void setNrEtaje(int nrEtaje) {
		this.nrEtaje = nrEtaje;
	}
	
	public void setPret(double pret) {
		this.pret = pret;
	}
	
	public String getTipCasa() {
		return this.tipCasa;
	}
	
	public int getNrEtaje() {
		return this.nrEtaje;
	}
	
	public double getPret() {
		return this.pret;
	}
	
	public void afiseazaInformatii() {
		System.out.println("Imobilul este "+this.tipCasa + ", are "+ this.nrEtaje+" etaje, si costa " + this.pret + " de euro");
	}
	
	//Suplimentar
	
	public String toString() {
		return "Imobilul este " + this.tipCasa + ", are " + this.nrEtaje + " etaje, si costa " + this.pret + " de euro";
	}
}
