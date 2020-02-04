package main;

public class Tema3_Exercitiul_1_Suplimentar {
	
	/* Avand un sir (string) de forma unei propozitii, creati
	   un vector care tine pe fiecare pozitie cate un cuvant pe propozitie.
	   Exemplu: String prop = "Acesta este un exercitiu mai interesant." -> 
	   		    v: "acesta", "este", "un", "exercitiu", "mai", "interesant". 
	   		    Lungimea sirului v este 6 in acest exemplu                     */
	
	public static void main(String[] args) {
		String[] v = new String[10];
		String prop = "Acesta este un exercitiu mai interesant.";
		int a=0, b=-1, nr=0;
		for(int i = 0; i < prop.length(); i++) {
			if(prop.charAt(i)==' ' || prop.charAt(i)=='.') {
				a = b+1;
				b = i;
				v[nr] = prop.substring(a,b);
				nr++;		
			}	
		}
		for(int i = 0; i < nr; i++) 
			System.out.print(v[i]+' ');
		System.out.println("Lungimea sirului v este: " + nr);
		
	}

}
