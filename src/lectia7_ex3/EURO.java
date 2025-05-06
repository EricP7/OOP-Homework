package lectia7_ex3;

public class EURO extends ContBancar implements SumaTotala {


    public EURO(String numarCont, float suma) {
        super(numarCont, suma);
    }

    public float getDobanda(){
        if(getSuma() > 500)
            return (float) 0.3;
        return 0;
    }


    @Override
    public float getSumaTotala() {
        return getSuma() * 36000;
    }
}
