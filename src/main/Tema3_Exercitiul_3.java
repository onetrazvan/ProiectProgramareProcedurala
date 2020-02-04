package main;

public class Tema3_Exercitiul_3 {

	/* Scrieti o clasa ce declara un array de tip
	   int cu o singura valoare negtiva si restul 
	   pozitive. Afisati  pozitia valorii negative
	   din array.                                   */
	
	public static void main(String[] args) {
		int[] array = new int[] {4,1,6,2,-1,9,0,3,7};
		for(int i = 0; i < array.length; i++) {
			if(array[i]<0)
				System.out.print("Valoarea negativa se afla pe pozitia "+(i+1)+" in array.");
		}

	}

}
