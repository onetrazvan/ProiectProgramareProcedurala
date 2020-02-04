package main;

public class Tema_3_Exercitiul_2 {

	/* Scrieti un program care afiseaza minimul,
	   respectiv maximul dintr-un array de lungime 10. */
	
	public static void main(String[] args) {
		
		int[] array = new int[] {15,44,-1,38,79,102,10,9999,4,657};
		int minim=array[0];
		int maxim=array[0];
		for(int i = 0; i < 10; i++) {
			if(array[i]<minim)
				minim=array[i];
			if(array[i]>maxim)
				maxim=array[i];
		}
		System.out.println("Minimul este: "+minim);
		System.out.println("Maximul este: "+maxim);
		
	}

}
