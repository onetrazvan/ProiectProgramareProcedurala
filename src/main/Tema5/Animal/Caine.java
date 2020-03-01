package main;

public class Caine extends Animal {

	public Caine() {
		super();
	}

	public Caine(String tipAnimal) {
		super(tipAnimal);
	}

	public Caine(String tipAnimal, String culoare) {
		super(tipAnimal, culoare);
	}

	public Caine(String tipAnimal, String culoare, int varsta) {
		super(tipAnimal, culoare, varsta);
	}
	
	public void afiseazaInformatii() {
		System.out.println("Cainele are culoarea "+this.getCuloare()+", are varsta de "+this.getVarsta()+" ani.");;
	}
	
	public void afiseazaInformatii(int oaseMancate) {
		System.out.println("Cainele are culoarea "+this.getCuloare()+", are varsta de "+this.getVarsta()+" ani, si a mancat " + oaseMancate +" oase.");
	}

}
