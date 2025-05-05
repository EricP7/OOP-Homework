package lectia6_ex3;

public class Main {
    public static void main(String[] args) {

        Contribuabil contribuabil1 = new Contribuabil("Ion Popescu");
        Proprietate proprietate1 = new Cladire("V Parvan", 2, 20, 10000);
        //Proprietate proprietate2 = new Teren("V Parvan", 2, 10, Rang.ONE, 3500);
        Proprietate proprietate3 = new Cladire("Lugoj", 4, 25, 12500);

        System.out.println(contribuabil1);
        System.out.println(proprietate1);
        //System.out.println(proprietate2);
        System.out.println(proprietate3);

    }
}
