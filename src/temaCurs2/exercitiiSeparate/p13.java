package temaCurs2.exercitiiSeparate;


public class p13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Problema 13:\n");
		int i, j;
		for(i=1; i<1000; i+=17) 
			for(j=1; j<1000; j+=19) 
				if(i+j == 1000)
					System.out.println(i + " + " + j);
		System.out.println("\n");
		
	}

}
