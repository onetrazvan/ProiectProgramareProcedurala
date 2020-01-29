package main;

public class Exercitiul_6 {
	public static void main(String[] args) {
		int a=1, b=5, c=10, minim;
		minim = a;
		if (b < minim) 
			minim = b;
		if (c < minim)
			minim = c;
		System.out.println(minim);
	}
}
