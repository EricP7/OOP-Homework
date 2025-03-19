package temaCurs2.exercitiiSeparate;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputObj = new Scanner(System.in);
		System.out.println("Problema3\n");
		System.out.println("scrie primul numar: ");
		int n1 = inputObj.nextInt();
		System.out.println("scrie al doilea numar: ");
		int nr2P3 = inputObj.nextInt();
		
		if((n1 + nr2P3) % 2 == 0)
			if(n1 % 2 == 0)
				System.out.println((n1 + nr2P3) / 2);
			else
				System.out.println(n1 * nr2P3);
		else
			System.out.println(n1 + nr2P3);
		
		System.out.println("\n");
		inputObj.close();
	}

}
