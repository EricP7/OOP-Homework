package temaTransmitereaMesajelor;

public class Carte {
	
	int nrPagini;
	
	public Carte(int nrPagini) {
		this.nrPagini = nrPagini;
	}
	
	public void potrivita(Carte carte1, Carte carte2) {
		if(carte1.nrPagini == carte2.nrPagini)
			System.out.println("da");
	}
	
	public String toString() {
		return "hello world " + nrPagini;
	}

	public static void main(String[] args) {
		
		Carte carte1 = new Carte(200);
		Carte carte2 = new Carte(200);

		carte1.potrivita(carte1, carte2);
	}

}
