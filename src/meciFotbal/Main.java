package meciFotbal;

public class Main {
    public static void main(String[] args) {
        Joc joc1 = new Joc("Barcelona", "Real Madrid");
        Joc joc2 = new Joc("Steaua", "UTA");

        System.out.println("Joc 1");
        joc1.simuleaza();
        System.out.println(joc1);

        System.out.println("\nJoc 2");
        joc2.simuleaza();
        System.out.println(joc2);
    }
}
