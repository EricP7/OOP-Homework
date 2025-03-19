package temaCurs2.exercitiiSeparate;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Problema2:\n");
		System.out.println("Scrie un numar: ");
		Scanner inputObj = new Scanner(System.in);
		int n = inputObj.nextInt();
		switch(n) {
		case 1:
			System.out.println("UNU");
			break;
		case 2:
			System.out.println("DOI");
			break;
		case 3:
			System.out.println("TREI");
			break;
		case 4:
			System.out.println("PATRU");
			break;
		case 5:
			System.out.println("CINCI");
			break;
		default:
			System.out.println("INVALID");	
		}
		System.out.println("\n");
		inputObj.close();
	}

}
