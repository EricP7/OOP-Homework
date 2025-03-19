package temaCurs2.exercitiiSeparate;

import java.util.Scanner;

public class p16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Problema 16:\n");
		Scanner inputObj = new Scanner(System.in);
		int n = inputObj.nextInt();
		while(n > 0) {
			System.out.println(n%10);
			n/=10;
		}
		System.out.println("\n");
		inputObj.close();
	}

}
