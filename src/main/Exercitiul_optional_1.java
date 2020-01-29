package main;

public class Exercitiul_optional_1 {
	public static void main(String[] args) {
		int numar=28, i, suma=1;
		for(i=2;i<=numar/2;i++)
			if(numar%i==0)
				suma+=i;
		System.out.println("Suma divizorilor lui " + numar + " este: " + suma);
	}
}
