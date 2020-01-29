package main;

public class Exercitiul_optional_2 {

	public static void main(String[] args) {
		double baniDepusi = 100; //suma initiala depusa
		double rataDobanzii = 0.25; //dobanda de 25%
		int n = 3; //numarul de ani 
		
		// Dobanda = Suma depusa x Rata dobanzii (%) x Durata depozitului (nr. zile)/360
		
		for(int i=0;i<n;i++)
			baniDepusi+= baniDepusi * rataDobanzii;
		
		System.out.println("Dupa " + n + " ani, suma finala este de: " +baniDepusi+ ".");
		}

}
