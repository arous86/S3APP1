package menufact.plats;

import ingredients.Ingredient;

import java.util.ArrayList;

public class PlatAuMenu implements Cloneable {
    private int code;
    private String description;
    private double prix;
    private ArrayList<Ingredient> lesIngredients = new ArrayList<Ingredient>();

    public void ajouterIngredient(Ingredient ingredient)
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
    public void ajouterIngredientList (ArrayList<Ingredient> ingredients)
    {
        for (Ingredient ingredient : ingredients) {
            ajouterIngredient(ingredient);
        }
    }

    public ArrayList<Ingredient> getLesIngredients() {
        return lesIngredients;
    }


    @Override
    public PlatAuMenu clone() {
        PlatAuMenu p = null;
        try {
            p = (PlatAuMenu) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
    public PlatAuMenu(int code, String description, double prix) {
        this.code = code;
        this.description = description;
        this.prix = prix;
    }

    public PlatAuMenu() {
    }

    @Override
    public String toString() {
        return "menufact.plats.PlatAuMenu{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                "}\n";
    }



    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }


}
