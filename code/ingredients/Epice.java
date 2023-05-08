package ingredients;

public class Epice implements Ingredient{

        private TypeIngredient type = TypeIngredient.EPICE;
        private String nom;
        private String description;
        private double qty;

        @Override
        public Unites getUnite() {
            return Unites.MILLILITRE;
        }
        @Override
        public String getNom() {
            return nom;
        }

        @Override
        public void setNom(String nom) {
            this.nom = nom;
        }

        @Override
        public String getDescription() {
            return description;
        }

        @Override
        public void setDescription(String description) {
            this.description=description;
        }

        @Override
        public TypeIngredient getTypeIngredient() {
            return type;
        }

        @Override
        public double getQty() {
            return qty;
        }
        @Override
        public void setQty(double qty) {
            this.qty = qty;
        }

        public Epice(double _qyt) {
            qty = _qyt;
            nom = "Epice";

        }
}
