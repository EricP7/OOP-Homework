package lectia6_ex3;

public enum Rang {

    ONE(1), TWO(2), THREE(3), FOUR(4);

    private int cod;

    private Rang(int c){
        this.cod = c;
    }

    public int getCod(){
        return cod;
    }

}
