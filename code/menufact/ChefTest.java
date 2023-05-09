package menufact;
import inventaire.Inventaire;
import menufact.plats.Etat.EtatPlat;
import menufact.plats.Etat.EtatsPlatEnum;
import menufact.plats.Etat.PlatIndisponible;
import menufact.plats.Etat.PlatTermine;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatSante;

import static org.junit.jupiter.api.Assertions.*;

class ChefTest {

    @org.junit.jupiter.api.Test
    void getInstance() {
        Chef chef = Chef.getInstance();
        assertNotNull(chef);
    }

    @org.junit.jupiter.api.Test
    void commanderPlat() {
        Chef chef = Chef.getInstance();
        PlatChoisi platChoisi = new PlatChoisi(new PlatAuMenu(1, "Poutine", 10.0), 1);
        chef.commanderPlat(platChoisi);
        assertInstanceOf(PlatTermine.class, platChoisi.getEtat());
    }
}