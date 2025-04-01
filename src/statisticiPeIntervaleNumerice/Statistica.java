package statisticiPeIntervaleNumerice;

import java.io.BufferedReader;
import java.io.FileReader;

public class Statistica {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader nrIntervaleInput = new BufferedReader(new FileReader("resources/statisticiPeIntervaleNumerice/intervale.dat"));
			
			String linie;
			int nrIntervale = 0;
			
			while((linie = nrIntervaleInput.readLine()) != null)
				nrIntervale++;
			
			nrIntervaleInput.close();
			
			
			BufferedReader intervaleInput = new BufferedReader(new FileReader("resources/statisticiPeIntervaleNumerice/intervale.dat"));
			
			linie = "";
			
			Interval[] intervale = new Interval[nrIntervale];
			int i = 0;
			
			while((linie = intervaleInput.readLine()) != null) {
				linie = linie.replace("[", "").replace("]", "");
				String[] valori = linie.split(",");
				
				
				Double min = Double.valueOf(valori[0]);
				Double max = Double.valueOf(valori[1]);
				
				
				intervale[i] = new Interval(min, max);
				
				System.out.println(intervale[i]);
				
				i++;
			}
			
			
			
		} catch (Exception e) {
			System.out.println("Eroare la citirea fisierului " + e.getMessage());
		}

	}

}
