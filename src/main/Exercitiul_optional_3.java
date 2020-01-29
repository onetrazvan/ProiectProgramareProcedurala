package main;

public class Exercitiul_optional_3 {

	public static void main(String[] args) {
		int nrSec= 7384;
		int ore=nrSec/3600;
		int minute=(nrSec-(ore*3600))/60;
		int secunde=(nrSec-(ore*3600)-(minute*60));
		System.out.println(nrSec+" secunde este echivalent cu: "+ore+" ore, "+minute+" minute si "+secunde+" secunde.");
	}

}
