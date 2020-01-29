package main;

public class Exercitiul_5 {
	public static void main(String[] args) {
		int n = 9; 
		int factorial = 1; 
		for(int i = 1; i < n; i++)
			factorial*=i;
		System.out.println(n+"!= "+factorial); 
	}
}
