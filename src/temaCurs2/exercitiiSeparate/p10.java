package temaCurs2.exercitiiSeparate;

import java.util.Scanner;

public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputObj = new Scanner(System.in);
		System.out.println("Problema10:\n");
		int n = 1000;
		int m = 0;
		int i;
		boolean ok = false;
		
		for(n=1000; ok == false; n++) {
			for(i=2; i*i<=n; i++) {
				if(n%i == 0)
					m++;
			}
			if(m==0)
				ok = true;
			m = 0;
		}
		
		System.out.println(n-1);
		
		System.out.println("\n");

		inputObj.close();
	}

}
