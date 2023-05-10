package menufact;

import menufact.exceptions.MenuException;
import menufact.plats.PlatAuMenu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    void ajoute() {
        Menu menu = new Menu("Menu");
        PlatAuMenu plat = new PlatAuMenu(1, "Plat", 10);
        menu.ajoute(plat);
        assertEquals(plat, menu.platCourant());
    }

    @Test
    void position() {
        Menu menu = new Menu("Menu");
        PlatAuMenu plat = new PlatAuMenu(1, "Plat", 10);
        menu.ajoute(plat);
        PlatAuMenu plat2 = new PlatAuMenu(2, "Plat2", 20);
        menu.ajoute(plat2);
        menu.position(0);
        assertEquals(plat, menu.platCourant());
        menu.position(1);
        assertEquals(plat2, menu.platCourant());
    }

    @Test
    void platCourant() {
        Menu menu = new Menu("Menu");
        PlatAuMenu plat = new PlatAuMenu(1, "Plat", 10);
        menu.ajoute(plat);
        menu.position(0);
        assertEquals(plat, menu.platCourant());
    }

    @Test
    void positionSuivante() {
        Menu menu = new Menu("Menu");
        PlatAuMenu plat = new PlatAuMenu(1, "Plat", 10);
        menu.ajoute(plat);
        PlatAuMenu plat2 = new PlatAuMenu(2, "Plat2", 20);
        menu.ajoute(plat2);
        menu.position(0);
        assertEquals(plat, menu.platCourant());
        try {
            menu.positionSuivante();
        } catch (MenuException e) {
            throw new RuntimeException(e);
        }
        assertEquals(plat2, menu.platCourant());
    }

    @Test
    void positionPrecedente() {
        Menu menu = new Menu("Menu");
        PlatAuMenu plat = new PlatAuMenu(1, "Plat", 10);
        menu.ajoute(plat);
        PlatAuMenu plat2 = new PlatAuMenu(2, "Plat2", 20);
        menu.ajoute(plat2);
        menu.position(1);
        assertEquals(plat2, menu.platCourant());
        try {
            menu.positionPrecedente();
        } catch (MenuException e) {
            throw new RuntimeException(e);
        }
        assertEquals(plat, menu.platCourant());
    }

    @Test
    void testToString() {
        Menu menu = new Menu("Menu");
        PlatAuMenu plat = new PlatAuMenu(1, "Plat", 10);
        menu.ajoute(plat);
        PlatAuMenu plat2 = new PlatAuMenu(2, "Plat2", 20);
        menu.ajoute(plat2);
        assertEquals("menufact.Menu{" +
                "description='" + "Menu" + '\'' +
                ", courant=" + 0 +
                ", plat=" + "\n" + "[menufact.plats.PlatAuMenu{code=1, description='Plat', prix=10.0}\n" +
                ", menufact.plats.PlatAuMenu{code=2, description='Plat2', prix=20.0}\n" +
                "]}", menu.toString());
    }

}