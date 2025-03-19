package temaCurs2.exercitiiSeparate;

import java.util.Scanner;

public class p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Problema12:\n");
		Scanner inputObj = new Scanner(System.in);
		int n = inputObj.nextInt();
		int i, j, m;
		for(i=2; i<=n; i++)
			if(n%i == 0) {
				m = 0;
				for(j=2; j<=i; j++) {
					if(i%j == 0)
						m++;
				}
				if(m<=1)
					System.out.println(i);
			}
		System.out.println("\n");

	}

}
