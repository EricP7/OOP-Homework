package lectia6_ex3;

public class Teren extends Proprietate{

    private Rang rang;

    public Teren(String strada, int numar, int suprafata, Rang rang, int cost) {
        super(strada, numar, suprafata, cost);
        this.rang = rang;
    }

    public Rang getRang() {
        return rang;
    }

    @Override
    public int calculCost() {
        return (350 * getSuprafata()) / rang.getCod();
    }

    @Override
    public String toString() {
        return "Strada " + getStrada() + " Nr. " + getNumar() + "\n" +
                "Suprafata: " + getSuprafata() + "\n" +
                "Cost: " + calculCost();
    }
}
