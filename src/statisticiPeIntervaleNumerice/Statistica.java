package statisticiPeIntervaleNumerice;

import java.io.BufferedReader;
import java.io.FileReader;

public class Statistica {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("resources/statisticiPeIntervaleNumerice/intervale.dat"));
		} catch (Exception e) {
			System.out.println("Eroare la citirea fisierului ");
		}

	}

}
