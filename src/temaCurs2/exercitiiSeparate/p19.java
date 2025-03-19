package temaCurs2.exercitiiSeparate;

import java.util.Scanner;

public class p19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Problema 19:\n");
		Scanner inputObj = new Scanner(System.in);
		int n = inputObj.nextInt();
		int m = n%10;
		n/=10;
		while(n>0) {
			m = m * 10 + n%10;
			n/=10;
		}
		
		System.out.println(m);
		System.out.println("\n");
		inputObj.close();
	}

}
