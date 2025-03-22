package temaTransmitereaMesajelor;

public class Piramida {
	
	int n;
	
	public Piramida(int n) {
		this.n = n;
	}
	
	public void afisare() {
		for(int i = 1; i <= n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Piramida piramida1 = new Piramida(4);
		piramida1.afisare();
		
		Piramida piramida2 = new Piramida(6);
		piramida2.afisare();
		
		Piramida piramida3 = new Piramida(3);
		piramida3.afisare();

	}

}
