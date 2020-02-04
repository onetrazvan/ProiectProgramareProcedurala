package main;

public class Tema3_Exercitiul_4 {

	/* Scrieti o clasa ce transforma un String intr-un array de caractere.   */
	
	public static void main(String[] args) {
		String cuvant = "JavaMeentee";
		int len = cuvant.length();
		char[] charArray = new char[len];
		for(int i = 0; i < len; i++) {
			charArray[i]=cuvant.charAt(i);
			System.out.println("charArray["+i+"]= "+charArray[i]);
		}	
	}
}
