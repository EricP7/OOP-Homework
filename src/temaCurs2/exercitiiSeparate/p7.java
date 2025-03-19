package temaCurs2.exercitiiSeparate;

import java.util.Scanner;

public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputObj = new Scanner(System.in);
		System.out.println("Problema7:\n");
		System.out.println("n= ");
		int n = inputObj.nextInt();
		int sum = 0;
		int i;
		for(i = 1; i<=n; i++)
			sum+=i;
		System.out.println(sum/i);
		
		inputObj.close();
	}

}
