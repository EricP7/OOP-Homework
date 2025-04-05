package relatieMostenire;

public class Mig extends AvionLupta{

    public void highSpeedGeometry(){
        System.out.println(getPlaneID() + " - High speed geometry selected");
    }
    public void normalGeometry(){
        System.out.println(getPlaneID() + " - Normal geometry selected");
    }

    public Mig(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
    }

    public void launchMissle() {
        super.launchMissle();
    }

    public String toString(){
        return "\nMig: \n" + "PlaneID: " + getPlaneID() + "\nTotalEnginePower: " + getTotalEnginePower() + " kN\n";
    }
}
