package relatieMostenire;

public class AvionLupta extends Avion {

    public void launchMissle(){
        System.out.println(getPlaneID() + " - Initiating missle launch procedure - Acquiring target - Launching missle - Breaking away - Missle launch complete");
    }

    public AvionLupta(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
    }
}
