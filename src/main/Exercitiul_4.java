package main;

public class Exercitiul_4{
	public static void main(String[] args) {
		int suma = 0;
		for(int i = 1; i < 10; i++) {
			suma += suma + i; // aceasta scriere este de fapt "suma = suma * 2 + i"
		}
		System.out.print("Suma este: " + suma); 
	}
}
