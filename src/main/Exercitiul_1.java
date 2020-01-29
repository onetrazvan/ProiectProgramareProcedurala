package main;

public class Exercitiul_1 {
	 
	public static void main(String[] args) {
		int a = 3; // se declara variabila a si ii este atribuita valoarea 3
		int b = (a=2)*a; // lui a i se schimba valoarea in 3 iar b primeste patratul lui a nou
		int c = b * (b=5); // c primeste ca valoare produsul dintre b si b modificat
		System.out.println("a=" + a + ", b=" + b + ", c=" +c); // dupa executarea programului se afiseaza "a=2, b=5, c=20"
	}
}
