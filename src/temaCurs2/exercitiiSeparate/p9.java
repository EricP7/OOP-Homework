package temaCurs2.exercitiiSeparate;

import java.util.Scanner;

public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner inputObj = new Scanner(System.in);
		System.out.println("Problema9:\n");
		System.out.println("n= ");
		int n = inputObj.nextInt();
		int m = 0;
		int i;
		if(n!=0 && n!=1)
			for(i = 2; i<=n/2; i++)
				if(n % i == 0)
					m++;
		if(m==0)
			System.out.println("n este prim");
		else
			System.out.println("n nu este prim");
		System.out.println("\n");

		inputObj.close();
	}

}
