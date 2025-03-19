package temaCurs2.exercitiiSeparate;

import java.util.Scanner;

public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputObj = new Scanner(System.in);
		System.out.println("Problema8:\n");
		System.out.println("n= ");
		int n = inputObj.nextInt();
		int fact = 1;
		int i;
		for(i = 1; i<=n; i++)
			fact*=i;
		System.out.println(fact);

		inputObj.close();
	}

}
