package statisticiPeIntervaleNumerice;

import lectia7_ex3.ContBancar;

public class EURO extends ContBancar implements SumaTotala{


    public EURO(String numarCont, float suma) {
        super(numarCont, suma);
    }

    public float getDobanda(){
        if(getSuma() > 500)
            return (float) (getSuma() + 0.3);
        return (float) getSuma();
    }
}
