package main;

public class Exercitiul_1 {

	/* Scrieti un program care stocheaza intr-un vector 3 variabile
	   de tip double declarate de voi si le afiseaza parcurgand vectorul  */
	
	public static void main(String[] args) {
		double[] vector = new double[3];
		vector[0]=230.34;
		vector[1]=32134.1;
		vector[2]=23;
		System.out.print("Elevemntele vectorului sunt: ");
		for(int i=0;i<3;i++)
			System.out.print(vector[i]+", ");
	}

}
