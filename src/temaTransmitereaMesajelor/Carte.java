package temaTransmitereaMesajelor;

public class Carte {
	
	int nrPagini;
	
	public Carte(int nrPagini) {
		this.nrPagini = nrPagini;
	}
	
	
	public boolean equals(Carte carte1) {
		if(this.nrPagini == carte1.nrPagini)
			return true;
		return false;
	}
	

	public static void main(String[] args) {
		
		Carte carte1 = new Carte(200);
		Carte carte2 = new Carte(100);

		System.out.println(carte1.equals(carte2));
		
	}

}
