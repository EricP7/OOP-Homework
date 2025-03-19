package temaCurs2.exercitiiSeparate;

import java.util.Scanner;

public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputObj = new Scanner(System.in);
		System.out.println("Problema11:\n");
		int n = inputObj.nextInt();
		int i;
		for(i=1; i<=n; i++)
			if(n%i == 0)
				System.out.println(i);
		
		inputObj.close();
	}

}
