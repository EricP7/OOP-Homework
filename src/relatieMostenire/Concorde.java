package relatieMostenire;

public class Concorde extends AvionCalatori{

    public void goSuperSonic(){
        System.out.println(getPlaneID() + " - Supersonic mode activated");
    }
    public void goSubSonic(){
        System.out.println(getPlaneID() + " - Supersonic mode deactivated");
    }

    public Concorde(String planeID, int totalEnginePower, int maxPassengers) {
        super(planeID, totalEnginePower, maxPassengers);
    }
}
