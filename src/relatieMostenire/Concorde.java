package relatieMostenire;

public class Concorde extends AvionCalatori{

    public void goSuperSonic(){
        System.out.println(getPlaneID() + " - Supersonic mode activated");
    }
    public void goSubSonic(){
        System.out.println(getPlaneID() + " - Supersonic mode deactivated");
    }
}
