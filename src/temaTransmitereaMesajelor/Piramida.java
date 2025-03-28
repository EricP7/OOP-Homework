package temaTransmitereaMesajelor;

public class Piramida {
	
	int n;
	
	public Piramida(int n) {
		this.n = n;
	}
	
	public String toString() {
		String piramidaStr = "";
		for(int i = 1; i <= n; i++) {
			for(int j=n; j>=i; j--) {
				piramidaStr += i + " ";
			}
			piramidaStr += "\n";
		}
		return piramidaStr;
	}

	public static void main(String[] args) {
		
		Piramida piramida1 = new Piramida(4);
		System.out.println(piramida1);
		
		Piramida piramida2 = new Piramida(6);
		System.out.println(piramida2);
		
		Piramida piramida3 = new Piramida(3);
		System.out.println(piramida3);

	}

}
