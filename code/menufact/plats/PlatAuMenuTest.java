package menufact.plats;

import ingredients.Epice;
import ingredients.Ingredient;
import ingredients.Viande;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlatAuMenuTest {

    @Test
    void ajouterIngredient() {
        PlatAuMenu platAuMenu = new PlatAuMenu(1, "Poutine", 10.0);
        platAuMenu.ajouterIngredient(new Viande(10));
        assertEquals(10, platAuMenu.getLesIngredients().get(0).getQty());
    }

    @Test
    void ajouterIngredientList() {
        PlatAuMenu platAuMenu = new PlatAuMenu(1, "Poutine", 10.0);
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Viande(100));
        ingredients.add(new Epice(10));
        platAuMenu.ajouterIngredientList(ingredients);
        assertEquals(100, platAuMenu.getLesIngredients().get(0).getQty());
        assertEquals(10, platAuMenu.getLesIngredients().get(1).getQty());
    }

    @Test
    void getLesIngredients() {
        PlatAuMenu platAuMenu = new PlatAuMenu(1, "Poutine", 10.0);
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Viande(100));
        ingredients.add(new Epice(10));
        platAuMenu.ajouterIngredientList(ingredients);
        assertEquals(100, platAuMenu.getLesIngredients().get(0).getQty());
        assertEquals(10, platAuMenu.getLesIngredients().get(1).getQty());
    }

    @Test
    void testClone() {
        PlatAuMenu platAuMenu = new PlatAuMenu(1, "Poutine", 10.0);
        PlatAuMenu platAuMenuClone = platAuMenu.clone();
        assertEquals(platAuMenu.getCode(), platAuMenuClone.getCode());
        assertEquals(platAuMenu.getDescription(), platAuMenuClone.getDescription());
        assertEquals(platAuMenu.getPrix(), platAuMenuClone.getPrix());
    }

    @Test
    void testToString() {
        PlatAuMenu platAuMenu = new PlatAuMenu(1, "Poutine", 10.0);
        assertEquals("menufact.plats.PlatAuMenu{" +
                "code=" + platAuMenu.getCode() +
                ", description='" + platAuMenu.getDescription() + '\'' +
                ", prix=" + platAuMenu.getPrix() +
                "}\n", platAuMenu.toString());
    }

    @Test
    void getCode() {
        PlatAuMenu platAuMenu = new PlatAuMenu(1, "Poutine", 10.0);
        assertEquals(1, platAuMenu.getCode());
    }

    @Test
    void setCode() {
        PlatAuMenu platAuMenu = new PlatAuMenu(1, "Poutine", 10.0);
        platAuMenu.setCode(2);
        assertEquals(2, platAuMenu.getCode());
    }

    @Test
    void getDescription() {
        PlatAuMenu platAuMenu = new PlatAuMenu(1, "Poutine", 10.0);
        assertEquals("Poutine", platAuMenu.getDescription());
    }

    @Test
    void setDescription() {
        PlatAuMenu platAuMenu = new PlatAuMenu(1, "Poutine", 10.0);
        platAuMenu.setDescription("Poutine au poulet");
        assertEquals("Poutine au poulet", platAuMenu.getDescription());
    }

    @Test
    void getPrix() {
        PlatAuMenu platAuMenu = new PlatAuMenu(1, "Poutine", 10.0);
        assertEquals(10.0, platAuMenu.getPrix());
    }

    @Test
    void setPrix() {
        PlatAuMenu platAuMenu = new PlatAuMenu(1, "Poutine", 10.0);
        platAuMenu.setPrix(15.0);
        assertEquals(15.0, platAuMenu.getPrix());
    }
}