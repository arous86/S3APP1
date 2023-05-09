package menufact.facture;

import menufact.Client;
import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactureTest {

    @Test
    void associerClient() {
        Facture facture = new Facture("Facture 1");
        Client client = new Client(1, "Domingo", "12345678");
        facture.associerClient(client);
        assertEquals(client, facture.getClient());
    }

    @Test
    void sousTotal() throws FactureException {
        Facture facture = new Facture("Facture 1");
        PlatChoisi platChoisi = new PlatChoisi(new PlatAuMenu(1, "Poutine", 10.0), 1);
        try {
            facture.ajoutePlat(platChoisi);
        } catch (FactureException e) {
            throw new RuntimeException(e);
        }
        assertEquals(10.0, facture.sousTotal());
    }

    @Test
    void total() {
        Facture facture = new Facture("Facture 1");
        PlatChoisi platChoisi = new PlatChoisi(new PlatAuMenu(1, "Poutine", 10.0), 1);
        try {
            facture.ajoutePlat(platChoisi);
        } catch (FactureException e) {
            throw new RuntimeException(e);
        }
        assertEquals(11.4975, facture.total());
    }

    @Test
    void payer() {
        Facture facture = new Facture("Facture 1");
        PlatChoisi platChoisi = new PlatChoisi(new PlatAuMenu(1, "Poutine", 10.0), 1);
        try {
            facture.ajoutePlat(platChoisi);
        } catch (FactureException e) {
            throw new RuntimeException(e);
        }
        facture.payer();
        assertEquals(FactureEtat.PAYEE, facture.getEtat());
    }

    @Test
    void fermer() {
        Facture facture = new Facture("Facture 1");
        PlatChoisi platChoisi = new PlatChoisi(new PlatAuMenu(1, "Poutine", 10.0), 1);
        try {
            facture.ajoutePlat(platChoisi);
        } catch (FactureException e) {
            throw new RuntimeException(e);
        }
        facture.fermer();
        assertEquals(FactureEtat.FERMEE, facture.getEtat());
    }

    @Test
    void ouvrir() {
        Facture facture = new Facture("Facture 1");
        PlatChoisi platChoisi = new PlatChoisi(new PlatAuMenu(1, "Poutine", 10.0), 1);
        try {
            facture.ajoutePlat(platChoisi);
        } catch (FactureException e) {
            throw new RuntimeException(e);
        }
        try {
            facture.ouvrir();
        } catch (FactureException e) {
            throw new RuntimeException(e);
        }
        assertEquals(FactureEtat.OUVERTE, facture.getEtat());
    }

    @Test
    void getEtat() {
        Facture facture = new Facture("Facture 1");
        PlatChoisi platChoisi = new PlatChoisi(new PlatAuMenu(1, "Poutine", 10.0), 1);
        try {
            facture.ajoutePlat(platChoisi);
        } catch (FactureException e) {
            throw new RuntimeException(e);
        }
        assertEquals(FactureEtat.OUVERTE, facture.getEtat());
    }

    @Test
    void ajoutePlat() {
        Facture facture = new Facture("Facture 1");
        PlatChoisi platChoisi = new PlatChoisi(new PlatAuMenu(1, "Poutine", 10.0), 1);
        try {
            facture.ajoutePlat(platChoisi);
        } catch (FactureException e) {
            throw new RuntimeException(e);
        }
        assertEquals(1, facture.getPlats().size());
    }

    @Test
    void testToString() {
        Facture facture = new Facture("Facture 1");
        PlatChoisi platChoisi = new PlatChoisi(new PlatAuMenu(1, "Poutine", 10.0), 1);
        try {
            facture.ajoutePlat(platChoisi);
        } catch (FactureException e) {
            throw new RuntimeException(e);
        }
        assertEquals("Facture{nom='Facture 1', client=null, etat=OUVERTE, plats=[PlatChoisi{plat=PlatAuMenu{code=1, description='Poutine', prix=10.0}, quantite=1}]}", facture.toString());
    }

    @Test
    void genererFacture() {

    }

    @Test
    void afficher() {
        Facture facture = new Facture("Facture 1");
        PlatChoisi platChoisi = new PlatChoisi(new PlatAuMenu(1, "Poutine", 10.0), 1);
        try {
            facture.ajoutePlat(platChoisi);
        } catch (FactureException e) {
            throw new RuntimeException(e);
        }
    }
}