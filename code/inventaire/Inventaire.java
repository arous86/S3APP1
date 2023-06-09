package inventaire;

import ingredients.Ingredient;

import java.util.ArrayList;

public class Inventaire {
    private static Inventaire instance = null;
    private ArrayList<Ingredient> lesIngredients = new ArrayList<Ingredient>();
    private Inventaire() {
    }
    public static Inventaire getInstance() {
        if (instance == null) {
            instance = new Inventaire();
        }
        return instance;
    }


    public void ajouter(Ingredient ingredient)
    {
        for (Ingredient i : lesIngredients)
        {
            if (i.getTypeIngredient().equals(ingredient.getTypeIngredient()))
            {
                i.setQty(i.getQty()+ingredient.getQty());
                return;
            }
        }
        lesIngredients.add(ingredient);
    }
    public boolean retirer(Ingredient ingredient)
    {
        boolean found = false;
        for (Ingredient i : lesIngredients)
        {
            if (i.getTypeIngredient().equals(ingredient.getTypeIngredient()))
            {
                found = true;
                if (i.getQty()-ingredient.getQty() < 0)
                {
                    System.out.println("Pas assez d'ingredient");
                    return false;
                }
                else {
                    i.setQty(i.getQty() - ingredient.getQty());
                }
            }
        }
        if (!found)
        {
            System.out.println("Ingredient non trouvé");
            return false;
        }
        return true;
    }
    public boolean retirerList(ArrayList<Ingredient> ingredients, int quantitePlat)
    {
        for (Ingredient ingredient : ingredients) {
            boolean found = false;
            for (Ingredient i : lesIngredients) {
                if (i.getTypeIngredient().equals(ingredient.getTypeIngredient())) {
                    found = true;
                    if (i.getQty() - ingredient.getQty()*quantitePlat < 0) {
                        System.out.println("Pas assez d'ingredient");
                        return false;
                    }
                }
            }
            if (!found)
            {
                System.out.println("Ingredient non trouvé");
                return false;
            }
        }
        for (Ingredient ingredient : ingredients)
        {
            if (!retirer(ingredient))
            {
                return false;
            }
        }
        return true;
    }
    public void ajouterList(ArrayList<Ingredient> ingredients)
    {
        for (Ingredient ingredient : ingredients)
        {
            ajouter(ingredient);
        }
    }

    public ArrayList<Ingredient> get()
    {
        return lesIngredients;
    }

}
