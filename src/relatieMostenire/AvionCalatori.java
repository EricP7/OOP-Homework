package relatieMostenire;

public class AvionCalatori extends Avion {

    private int maxPassengers;

    public int getMaxPassengers(){
        return maxPassengers;
    }

    public AvionCalatori(String planeID, int totalEnginePower, int maxPassengers) {
        super(planeID, totalEnginePower);
        this.maxPassengers = maxPassengers;
    }
}
