package main;

public class TestImobil {

	public static void main(String[] args) {
		Imobil imobil1 = new Imobil();
		imobil1.setTipCasa("casa");
		imobil1.setNrEtaje(2);
		imobil1.setPret(40000);
		
		imobil1.afiseazaInformatii();
		
		Apartament imobil2 = new Apartament("apartament",0,55000);
		imobil2.afiseazaInformatii();
		imobil2.afiseazaInformatii("Bucuresti");
		
		Casa casa1 = new Casa("casa",3,100000);
		casa1.afiseazaInformatii();
		casa1.afiseazaInformatii("Bacau");
	}

}
