package main;

public class TestImobil {

	public static void main(String[] args) {
		Imobil imobil1 = new Imobil();
		imobil1.setTipCasa("apartament");
		imobil1.setPret(40000);
		
		Imobil imobil2 = new Imobil("casa");
		imobil2.setNrEtaje(2);
		imobil2.setPret(300000);
		
		System.out.println("Tip Casa: " + imobil1.getTipCasa() + "\nNumar etaje: " + imobil1.getNrEtaje() + "\nPret: " + imobil1.getPret());
		System.out.println(imobil2);
	}

}
