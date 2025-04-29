package lectia6_ex3;

public class Cladire extends Proprietate{

    public Cladire(String strada, int numar, int suprafata, int cost) {
        super(strada, numar, suprafata, cost);
    }

    @Override
    public int calculCost() {
        return 500 * getSuprafata();
    }

}
