package ingredients;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EpiceTest {

    @Test
    void getUnite() {
        Epice epice = new Epice(25.0);
        assertEquals(Unites.MILLILITRE, epice.getUnite());
    }

    @Test
    void getNom() {
        Epice epice = new Epice(25.0);
        assertEquals("Epice", epice.getNom());
    }

    @Test
    void setNom() {
        Epice epice = new Epice(25.0);
        epice.setNom("Paprika");
        assertEquals("Paprika", epice.getNom());
    }

    @Test
    void getDescription() {
        Epice epice = new Epice(25.0);
        epice.setDescription("Epice de l'Inde");
        assertEquals("Epice de l'Inde", epice.getDescription());

    }

    @Test
    void setDescription() {
        Epice epice = new Epice(25.0);
        epice.setDescription("Epice du Maroc");
        assertEquals("Epice du Maroc", epice.getDescription());

    }

    @Test
    void getTypeIngredient() {
        Epice epice = new Epice(25.0);
        assertEquals(TypeIngredient.EPICE, epice.getTypeIngredient());
    }

    @Test
    void getQty() {
        Epice epice = new Epice(25.0);
        assertEquals(25.0, epice.getQty());
    }

    @Test
    void setQty() {
        Epice epice = new Epice(25.0);
        epice.setQty(50.0);
        assertEquals(50.0, epice.getQty());
    }
}