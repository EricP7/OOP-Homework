package temaCurs2.exercitiiSeparate;

import java.util.Scanner;

public class p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Problema 17:\n");
		Scanner inputObj = new Scanner(System.in);
		int n = inputObj.nextInt();
		int m = 0;
		while(n > 0) {
			if(n%10 > m)
				m = n % 10;
			n/=10;
		}
		System.out.println(m);
		System.out.println("\n");
		inputObj.close();
	}

}
