package temaCurs2.exercitiiSeparate;

public class p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Problema 15:\n");
		int i, j;
		int n=0;
		for(i=1; i<=9; i++) 
			for(j=1; j<=9; j++) {
				n = 3000 + i*100 + 20 + j;
				if(n%9 == 0)
					System.out.println(n);
			}
		System.out.println("\n");
	}

}
