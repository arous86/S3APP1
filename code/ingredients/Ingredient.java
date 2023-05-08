package ingredients;

public interface Ingredient {
    Unites getUnite();
    String getNom();
    void setNom(String nom);
    String getDescription();
    void setDescription(String description);
    TypeIngredient getTypeIngredient();
    double getQty();
    void setQty(double qty);
    //void setTypeIngredient(TypeIngredient typeIngredient);
}
