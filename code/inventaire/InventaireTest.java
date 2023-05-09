package inventaire;

import ingredients.Fruit;
import ingredients.Ingredient;
import ingredients.Viande;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InventaireTest {

    @Test
    void getInstance() {
        Inventaire inventaireTest = Inventaire.getInstance();
        assertNotNull(inventaireTest);
    }

    @Test
    void ajouter() {
        Inventaire inventaireTest = Inventaire.getInstance();
        inventaireTest.ajouter(new Viande(10));
        assertEquals(10, inventaireTest.get().get(0).getQty());

    }

    @Test
    void retirer() {
        Inventaire inventaireTest = Inventaire.getInstance();
        inventaireTest.ajouter(new Viande(10));
        inventaireTest.retirer(new Viande(4));
        assertEquals(6, inventaireTest.get().get(0).getQty());
    }

    @Test
    void retirerList() {
        Inventaire inventaireTest = Inventaire.getInstance();
        ArrayList<Ingredient> ingredients1 = new ArrayList<>();
        ingredients1.add(new Viande(100));
        ingredients1.add(new Fruit(10));
        inventaireTest.ajouterList(ingredients1);

        ArrayList<Ingredient> ingredients2 = new ArrayList<>();
        ingredients2.add(new Viande(4));
        ingredients2.add(new Fruit(1));
        inventaireTest.retirerList(ingredients2, 1);

        assertEquals(96, inventaireTest.get().get(0).getQty());
        assertEquals(9, inventaireTest.get().get(1).getQty());
    }

    @Test
    void ajouterList() {
        Inventaire inventaireTest = Inventaire.getInstance();
        ArrayList<Ingredient> ingredients1 = new ArrayList<>();
        ingredients1.add(new Viande(100));
        ingredients1.add(new Fruit(10));
        inventaireTest.ajouterList(ingredients1);

        assertEquals(100, inventaireTest.get().get(0).getQty());
        assertEquals(10, inventaireTest.get().get(1).getQty());
    }

    @Test
    void show() {
    }
}