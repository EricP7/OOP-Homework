package statisticiPeIntervaleNumerice;

import lectia7_ex3.Client;

import java.util.ArrayList;
import java.util.List;

public class Banca {

    private List<Client> clienti = new ArrayList<>();
    private String codBanca;

    public Banca(List<Client> clienti, String codBanca) {
        this.clienti = clienti;
        this.codBanca = codBanca;
    }

    public void add(Client c){
        for (Client client : clienti) {
            if (client.getNume().equals(c.getNume())) {
                System.out.println("Clientul cu acest nume exista deja!");
                return;
            }
        }
        clienti.add(c);
    }


    public void afisareClient(String nume) {
        for (Client client : clienti) {
            if (client.getNume().equals(nume)) {
                System.out.println(client);
                return;
            }
        }
        System.out.println("Clientul nu a fost gasit!");
    }
}
