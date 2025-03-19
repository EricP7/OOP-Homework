package temaCurs2.exercitiiSeparate;

import java.util.Scanner;

public class p18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Problema 18:\n");
		Scanner inputObj = new Scanner(System.in);
		int n = inputObj.nextInt();
		int m = 9;
		while(n > 0) {
			if(n%10 < m)
				m = n % 10;
			n/=10;
		}
		System.out.println(m);
		System.out.println("\n");
		inputObj.close();
	}

}
