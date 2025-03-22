package temaCurs2;

import java.util.Scanner;

public class Exercitii {

	public static void main(String[] args) {
		//problema1
		System.out.println("Problema 1:\n");

		@SuppressWarnings("resource")
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
		
		//problema2
		System.out.println("Problema2:\n");
		System.out.println("Scrie un numar: ");
		n1 = inputObj.nextInt();
		switch(n1) {
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
		
		//problema3
		System.out.println("Problema3\n");
		System.out.println("scrie primul numar: ");
		n1 = inputObj.nextInt();
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
		

		//problema4
		System.out.println("Problema4:\n");
		System.out.println("scrie 3 numere: ");
		n1 = inputObj.nextInt();
		int n2 = inputObj.nextInt();
		int n3 = inputObj.nextInt();
		if((n1 <= n2) && (n2 <= n3))
			System.out.println(n1);
		else if((n2 <= n1) && (n1 <= n3))
			System.out.println(n2);
		else
			System.out.println(n3);
		
		System.out.println("\n");
		
		
		//problema5
		System.out.println("Problema5:\n");
		System.out.println("n= ");
		int n = inputObj.nextInt();
		int sum = 0;
		int i;
		for(i = 0; i <= n; i+=2)
			sum+=i;
		System.out.println(sum + "\n");
		
		
		//problema6
		System.out.println("Problema6:\n");
		System.out.println("n= ");
		n = inputObj.nextInt();
		sum = 0;
		for(i = 1; i <= n; i+=2)
			sum+=i;
		System.out.println(sum + "\n");
		
		//problema7
		System.out.println("Problema7:\n");
		System.out.println("n= ");
		n = inputObj.nextInt();
		sum = 0;
		for(i = 1; i<=n; i++)
			sum+=i;
		System.out.println(sum/i);
		System.out.println("\n");

		
		
		
		//problema8
		System.out.println("Problema8:\n");
		System.out.println("n= ");
		n = inputObj.nextInt();
		int fact = 1;
		for(i = 1; i<=n; i++)
			fact*=i;
		System.out.println(fact);
		System.out.println("\n");

		
		
		//problema9
		System.out.println("Problema9:\n");
		System.out.println("n= ");
		n = inputObj.nextInt();
		int m = 0;
		if(n!=0 && n!=1)
			for(i = 2; i<=n/2; i++)
				if(n % i == 0)
					m++;
		if(m==0)
			System.out.println("n este prim");
		else
			System.out.println("n nu este prim");
		
		System.out.println("\n");
		
		
		//problema10
		System.out.println("Problema10:\n");
		n = 1000;
		m = 0;
		boolean ok = false;
		
		for(n=1000; ok == false; n++) {
			for(i=2; i*i<=n; i++) {
				if(n%i == 0)
					m++;
			}
			if(m==0)
				ok = true;
			m = 0;
		}
		
		System.out.println(n-1);
		
		System.out.println("\n");
		
		
		//problema11
		System.out.println("Problema11:\n");
		n = inputObj.nextInt();
		
		for(i=1; i<=n; i++)
			if(n%i == 0)
				System.out.println(i);
		System.out.println("\n");

		
		
		
		//problema12
		System.out.println("Problema12:\n");
		n = inputObj.nextInt();
		int j;
		for(i=2; i<=n; i++)
			if(n%i == 0) {
				m = 0;
				for(j=2; j<=i; j++) {
					if(i%j == 0)
						m++;
				}
				if(m<=1)
					System.out.println(i);
			}
		System.out.println("\n");

		
		
		
		//problema13
		System.out.println("Problema13:\n");
		for(i=1; i<1000; i+=17) 
			for(j=1; j<1000; j+=19) 
				if(i+j == 1000)
					System.out.println(i + " + " + j);
		System.out.println("\n");

		
		
		
		//problema14
		System.out.println("Problema14:\n");
		for(i=1; i<1000; i+=17) {
			for(j=1; j<1000; j+=19) {
				if(i+j == 1000)
					System.out.println(i + " + " + j);
			}
			for(j=1; j<1000; j+=7)
				if(i+j == 1000)
					System.out.println(i + " + " + j);
		}
		System.out.println("\n");

		
		
		
		//problema15
		System.out.println("Problema15:\n");
		n=0;
		for(i=1; i<=9; i++) 
			for(j=1; j<=9; j++) {
				n = 3000 + i*100 + 20 + j;
				if(n%9 == 0)
					System.out.println(n);
			}
		System.out.println("\n");

		
		
		//problema16
		System.out.println("Problema16:\n");
		n = inputObj.nextInt();
		while(n > 0) {
			System.out.println(n%10);
			n/=10;
		}
		System.out.println("\n");
		
		
		
		//problema17
		System.out.println("Problema17:\n");
		n = inputObj.nextInt();
		m = 0;
		while(n > 0) {
			if(n%10 > m)
				m = n % 10;
			n/=10;
		}
		System.out.println(m);
		System.out.println("\n");
		
		
		
		//problema18
		System.out.println("Problema18:\n");
		n = inputObj.nextInt();
		m = 9;
		while(n > 0) {
			if(n%10 < m)
				m = n % 10;
			n/=10;
		}
		System.out.println(m);
		System.out.println("\n");
		
		
		
		
		//problema19
		System.out.println("Problema19:\n");
		n = inputObj.nextInt();
		m = n%10;
		n/=10;
		while(n>0) {
			m = m * 10 + n%10;
			n/=10;
		}
		
		System.out.println(m);
		System.out.println("\n");
		
		
		
		//problema20
		System.out.println("Problema20:\n");
		j = n;
		m = n%10;
		n/=10;
		while(n>0) {
			m = m * 10 + n%10;
			n/=10;
		}
		if(j == m)
			System.out.println("este palindrom");
		else {
			System.out.println("nu este palindrom");
		}
		System.out.println("\n");
		

		inputObj.close();
	}

}
