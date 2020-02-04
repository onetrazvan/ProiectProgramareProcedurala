package main;

public class Tema3_Exercitiul_2_Suplimentar {

	/* Complicati primul exercitiu suplimentar astfel:
	   verificati daca lungimea fiecarui cuvant din sir este aceeasi
	   pentru toate cuintele, iar daca conditia aceasta e adevarata
	   creati un array bidimensional ce contine array-uri de caractere
	   corespunzatoare fiecarui cuvant.
	   Exemplu: "Mara este bine"
	   // matricea are atatea linii cate cuvinte sunt in propozitie
	      si atatea coloane cate litere au cuvintele din propozitie
	      matrix:
	      linia1: m a r a
	      linia2: e s t e 
	      linia3: b i n e                                               */
	
	public static void main(String[] args) {
		String prop = "Mara este bine.";
		int a=0, b=-1, nr=0;
		String[] v = new String[10];
		for(int i = 0; i < prop.length(); i++) {
			if(prop.charAt(i)==' ' || prop.charAt(i)=='.') {
				a = b+1;
				b = i;
				v[nr] = prop.substring(a,b);
				nr++;
				
			}
		}
		
		boolean ok = true;
		for(int i = 0; i < nr-1; i++) {
			if(v[i].length()!=v[i+1].length())
				ok = false;
		}
		
		if(ok) {
			int linii=nr;
			int coloane=v[1].length();		
			String[][] matrice = new String[linii][coloane];
			for(int i = 0; i < linii; i++)
				for(int j = 0; j < coloane; j++) {
					matrice[i][j] = v[i].substring(j,j+1);
				}
					
			for(int i = 0; i < linii; i++) {
				for(int j = 0; j < coloane; j++)
					System.out.print(matrice[i][j]+" ");
				System.out.println();
			}
		}
		else
			System.out.println("Cuvintele nu au dimensiunea egala.");
	}

}
