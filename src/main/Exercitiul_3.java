package main;

public class Exercitiul_3{
	public static void main(String[] args) {
		int a = 2;
		if(++a < 4) // mai intai verifica daca a < 4 apoi il creste pe a cu o unitate
			if(a++ < 4) // mai intai il creste pe a iar apoi verifica daca a < 4
				System.out.println(a); // ajunge aici pentru ca conditia este indeplinita 
			else
				System.out.println(a); 
	}
}
