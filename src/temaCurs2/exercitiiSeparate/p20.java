package temaCurs2.exercitiiSeparate;

import java.util.Scanner;

public class p20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Problema 20:\n");
		Scanner inputObj = new Scanner(System.in);
		int n = inputObj.nextInt();
		int j = n;
		int m = n%10;
		n/=10;
		while(n>0) {
			m = m * 10 + n%10;
			n/=10;
		}
		if(j == m)
			System.out.println("este palindrom");
		else {
			System.out.println("nu este palindrom");
		}
		System.out.println("\n");
		inputObj.close();
	}

}
