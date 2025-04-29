package lectia6_ex3;

public abstract class Proprietate {

    private String strada;
    private int numar;
    private int suprafata;
    public Proprietate(String strada, int numar, int suprafata, int cost) {
        this.strada = strada;
        this.numar = numar;
        this.suprafata = suprafata;
    }

    public abstract int calculCost();

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public int getSuprafata() {
        return suprafata;
    }

    public void setSuprafata(int suprafata) {
        this.suprafata = suprafata;
    }

}
