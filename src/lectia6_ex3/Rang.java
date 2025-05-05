package lectia6_ex3;

public enum Rang {

    ONE(1), TWO(2), THREE(3), FOUR(4);

    private final int cod;

    Rang(int cod) {
        this.cod = cod;
    }

    public int getCod() {
        return cod;
    }
}