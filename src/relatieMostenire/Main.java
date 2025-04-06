package relatieMostenire;

public class Main {
    public static void main(String[] args) {

        String planeID_Boeing = "b722-i30";
        String planeID_Concorde = "co300-2";
        String planeID_Mig = "200m13";
        String planeID_TomCat = "f16-t214";

        int totalEnginePower_Boeing = 64;
        int totalEnginePower_Concorde = 180;
        int totalEnginePower_Mig = 100;
        int totalEnginePower_TomCat = 251;

        AvionCalatori Boeing737 = new Boeing(planeID_Boeing, totalEnginePower_Boeing, 150);
        AvionCalatori Concorde = new Concorde(planeID_Concorde, totalEnginePower_Concorde, 110);
        AvionLupta MiG25 = new Mig(planeID_Mig, totalEnginePower_Mig);
        TomCat F14TomCat = new TomCat(planeID_TomCat, totalEnginePower_TomCat);

        System.out.println(Boeing737);
        Boeing737.takeOff();
        Boeing737.fly();
        Boeing737.land();

        System.out.println(Concorde);
        Concorde.takeOff();
        Concorde.fly();
        Concorde.land();

        System.out.println(MiG25);
        MiG25.launchMissle();
        MiG25.takeOff();
        MiG25.fly();
        MiG25.land();

        System.out.println(F14TomCat);
        F14TomCat.refuel();
        F14TomCat.launchMissle();
        F14TomCat.takeOff();
        F14TomCat.fly();
        F14TomCat.land();
    }
}
