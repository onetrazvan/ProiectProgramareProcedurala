package main;

public class Cerc extends Forma {
	
	private double raza;
	
	public Cerc() {
		this.raza = 0;
	}

	public Cerc(double raza) {
		this.raza = raza;	
	}
	public void setRaza(double raza) {
		this.raza = raza;
	}
	
	public double getRaza() {
		return this.raza;
	}
	
	public void afiseazaInformatii() {
		System.out.println("Cercul are raza de " +this.raza+ " cm.");
	}
	
	public void afiseazaAria() {
		System.out.println("Aria cercului este: "+(Math.PI*raza*raza));
	}

}
