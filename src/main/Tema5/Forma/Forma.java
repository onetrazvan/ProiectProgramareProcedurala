package main;

public class Forma {
	
	private int lungime;
	private int latime;
	
	public Forma() {
		lungime = 0;
		latime = 0;
	}
	
	public Forma(int lungime, int latime) {
		this.lungime = lungime;
		this.latime =latime;
	}
	
	public void setLungime(int lungime) {
		this.lungime = lungime;
	}
	
	public void setLatime(int latime) {
		this.latime = latime;
	}
	
	public int getLungime() {
		return this.lungime;
	}
	
	public int getLatime() {
		return this.latime;
	}
	
	public void afiseazaInformatii() {
		System.out.println("Lungime: "+this.lungime+"\nLatime: "+ latime);
	}
	
}
