package lectia7_ex3;

public class Client {

    private String nume;
    private String adresa;
    ContBancar[] conturi = new ContBancar[5];


    public Client(String nume, String adresa, ContBancar[] conturi) {
        this.nume = nume;
        this.adresa = adresa;
        this.conturi = conturi;
    }
}
