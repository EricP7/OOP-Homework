package temaCurs2.exercitiiSeparate;

import java.util.Scanner;

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputObj = new Scanner(System.in);
		System.out.println("Problema5:\n");
		System.out.println("n= ");
		int n = inputObj.nextInt();
		int sum = 0;
		int i;
		for(i = 0; i <= n; i+=2)
			sum+=i;
		System.out.println(sum + "\n");

		inputObj.close();
	}

}
