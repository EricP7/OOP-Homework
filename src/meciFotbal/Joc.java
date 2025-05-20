package meciFotbal;

public class Joc {
    private String echipa1;
    private String echipa2;
    private int goluriEchipa1;
    private int goluriEchipa2;
    private int outuri;
    private int cornere;

    public Joc(String echipa1, String echipa2) {
        this.echipa1 = echipa1;
        this.echipa2 = echipa2;
        this.goluriEchipa1 = 0;
        this.goluriEchipa2 = 0;
        this.outuri = 0;
        this.cornere = 0;
    }

    public void simuleaza() {
        Minge minge = new Minge(50, 25);
        for (int i = 0; i < 1000; i++) {
            try {
                minge.suteaza();
                System.out.println(echipa1 + " - " + echipa2 + " : Mingea se află la coordonatele (" + minge.getX() + "," + minge.getY() + ")");
            } catch (Gol e) {
                System.out.println(e.getMessage());
                if (minge.getX() == 0) {
                    goluriEchipa2++;
                } else {
                    goluriEchipa1++;
                }
                minge = new Minge(50, 25);
            } catch (Out e) {
                System.out.println(e.getMessage());
                outuri++;
                minge = new Minge(minge.getX(), minge.getY());
            } catch (Corner e) {
                System.out.println(e.getMessage());
                cornere++;
                if (minge.getX() == 0) {
                    minge = new Minge(0, minge.getY() < 25 ? 0 : 50);
                } else {
                    minge = new Minge(100, minge.getY() < 25 ? 0 : 50);
                }
            }
        }
    }

    public String toString() {
        return "Scor " + echipa1 + " - " + echipa2 + ": " + goluriEchipa1 + " - " + goluriEchipa2 + "\n" +
                "Out-uri: " + outuri + ", Cornere: " + cornere;
    }
}

