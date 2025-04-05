package relatieMostenire;

public class TomCat extends AvionLupta{

    public void refuel(){
        System.out.println(getPlaneID() + " - Initiating refueling procedure - Locating refueller - Catching up - Refueling - Refueling complete");
    }

    public TomCat(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
    }
}
