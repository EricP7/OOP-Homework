package temaCurs2.exercitiiSeparate;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Problema 1:\n");

		Scanner inputObj = new Scanner(System.in);
		System.out.println("scrie un numar: ");
		int n1 = inputObj.nextInt();
		if(n1 >= 1 && n1 <= 10)
			if(n1 > 5)
				System.out.println("ADMIS\n");
			else
				System.out.println("RESPINS\n");
		else
			System.out.println("INVALID\n");

		inputObj.close();
	}

}
