package lectia6_ex3;

public class Contribuabil {

    private String nume;
    private int sumaTotala;

    public Contribuabil(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getSumaTotala() {
        return sumaTotala;
    }

    public void setSumaTotala(int sumaTotala) {
        this.sumaTotala = sumaTotala;
    }

    @Override
    public String toString() {
        return "Contribuabil{" +
                "nume='" + nume + '\'' +
                ", sumaTotala=" + sumaTotala +
                '}';
    }
}
