package relatieMostenire;

public class Boeing extends AvionCalatori{

    public Boeing(String planeID, int totalEnginePower, int maxPassengers) {
        super(planeID, totalEnginePower, maxPassengers);
    }

    public String toString(){
        return "\nBoeing: \n" + "PlaneID: " + getPlaneID() + "\nTotalEnginePower: " + getTotalEnginePower() + " kN\n" + "Max Passengers: " + getMaxPassengers();
    }
}
