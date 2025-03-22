package temaTransmitereaMesajelor;

public class Patrat {
	
	int latura;
	
	public Patrat() {
		latura = 10;
	}
	
	public Patrat(int latura) {
		this.latura = latura;
	}
	
	/*nu am inteles daca trebuie sa facem o metoda
	 * care se numeste 'potrivita' 
	 * sau sa facem o metoda potrivita pentru o anumita actiune*/
	public void potrivita() {
		
	}
	
	public String toString() {
		return "Patrat " + latura + " aria " + latura*latura;
	}

	public static void main(String[] args) {
		
		Patrat patrat1 = new Patrat();
		Patrat patrat2 = new Patrat(8);
		Patrat patrat3 = new Patrat(12);
		Patrat patrat4 = new Patrat();
		
		System.out.println(patrat1);
		System.out.println(patrat2);
		System.out.println(patrat3);
		System.out.println(patrat4);

	}

}
