package menufact.plats;

import ingredients.Ingredient;

import java.util.ArrayList;

public class PlatAuMenu implements Cloneable {
    private int code;
    private String description;
    private double prix;
    private double qty_epice;
    private double qty_fruit;
    private double qty_viande;
    private double qty_laitier;
    private double qty_legume;

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
        qty_epice = 0;
        qty_fruit = 0;
        qty_viande = 0;
        qty_laitier = 0;
        qty_legume = 0;
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

    public double getQty_epice() {
        return qty_epice;
    }
    public void setQty_epice(double qty_epice) {
        this.qty_epice = qty_epice;
    }
    public double getQty_fruit() {
        return qty_fruit;
    }
    public void setQty_fruit(double qty_fruit) {
        this.qty_fruit = qty_fruit;
    }
    public double getQty_viande() {
        return qty_viande;
    }
    public void setQty_viande(double qty_viande) {
        this.qty_viande = qty_viande;
    }
    public double getQty_laitier() {
        return qty_laitier;
    }
    public void setQty_laitier(double qty_laitier) {
        this.qty_laitier = qty_laitier;
    }
    public double getQty_legume() {
        return qty_legume;
    }
    public void setQty_legume(double qty_legume) {
        this.qty_legume = qty_legume;
    }

}
