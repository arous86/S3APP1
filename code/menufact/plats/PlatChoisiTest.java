package menufact.plats;

import ingredients.Viande;
import inventaire.Inventaire;
import menufact.plats.Etat.EtatPlat;
import menufact.plats.Etat.PlatPreparation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlatChoisiTest {

    @Test
    void verifierInventaire() {
        PlatAuMenu platAuMenu = new PlatAuMenu(1, "Poutine", 10.0);
        platAuMenu.ajouterIngredient(new Viande(10));
        PlatChoisi platChoisi = new PlatChoisi(platAuMenu, 1);
        Inventaire inventaire = Inventaire.getInstance();
        inventaire.ajouter(new Viande(20));
        assertTrue(platChoisi.verifierInventaire(2));
    }
    @Test
    void setEtat() {
        PlatAuMenu platAuMenu = new PlatAuMenu(1, "Poutine", 10.0);
        PlatChoisi platChoisi = new PlatChoisi(platAuMenu, 1);
        platChoisi.setEtat(new PlatPreparation());
        assertInstanceOf(PlatPreparation.class, platChoisi.getEtat());
    }
        @Test
        void changeEtat() {
        PlatAuMenu platAuMenu = new PlatAuMenu(1, "Poutine", 10.0);
        PlatChoisi platChoisi = new PlatChoisi(platAuMenu, 1);
        platChoisi.changeEtat(new PlatPreparation());
        assertInstanceOf(PlatPreparation.class, platChoisi.getEtat());
        }

        @Test
        void getEtat() {
        PlatAuMenu platAuMenu = new PlatAuMenu(1, "Poutine", 10.0);
        PlatChoisi platChoisi = new PlatChoisi(platAuMenu, 1);
        platChoisi.setEtat(new PlatPreparation());
        EtatPlat etatPlat = platChoisi.getEtat();
        assertInstanceOf(PlatPreparation.class, etatPlat);
        }

        @Test
        void testToString() {
        PlatAuMenu platAuMenu = new PlatAuMenu(1, "Poutine", 10.0);
        PlatChoisi platChoisi = new PlatChoisi(platAuMenu, 1);
        assertEquals("menufact.plats.PlatChoisi{quantite=1, plat=menufact.plats.PlatAuMenu{code=1, description='Poutine', prix=10.0}\n}", platChoisi.toString());
        }

        @Test
        void getQuantite() {
        PlatAuMenu platAuMenu = new PlatAuMenu(1, "Poutine", 10.0);
        PlatChoisi platChoisi = new PlatChoisi(platAuMenu, 1);
        assertEquals(1, platChoisi.getQuantite());
        }

        @Test
        void setQuantite() {
        PlatAuMenu platAuMenu = new PlatAuMenu(1, "Poutine", 10.0);
        PlatChoisi platChoisi = new PlatChoisi(platAuMenu, 1);
        platChoisi.setQuantite(2);
        assertEquals(2, platChoisi.getQuantite());
        }

        @Test
        void getPlat() {
        PlatAuMenu platAuMenu = new PlatAuMenu(1, "Poutine", 10.0);
        PlatChoisi platChoisi = new PlatChoisi(platAuMenu, 1);
        assertEquals(platAuMenu, platChoisi.getPlat());
        }

}