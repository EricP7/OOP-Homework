package statisticiPeIntervaleNumerice;

import lectia7_ex3.ContBancar;

public class LEI extends ContBancar implements SumaTotala {

    public LEI(String numarCont, float suma) {
        super(numarCont, suma);
    }

    public void transfer(ContBancar contDestinatie, float suma){
        contDestinatie.setSuma((float) (contDestinatie.getSuma()+suma));
        setSuma(getSuma() - suma);
    }


    @Override
    public float getSumaTotala() {
        return getSuma();
    }

}
