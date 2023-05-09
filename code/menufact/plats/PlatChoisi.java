package menufact.plats;

import inventaire.Inventaire;
import menufact.plats.Etat.EtatPlat;
import menufact.plats.Etat.EtatsPlatEnum;
import menufact.plats.Etat.PlatCommande;
import menufact.plats.Etat.PlatPreparation;
import menufact.plats.PlatAuMenu;

public class PlatChoisi {
    private PlatAuMenu plat;
    private EtatPlat etatPlat = new PlatCommande();
    private int quantite;
    private Inventaire inventaire = Inventaire.getInstance();

    public PlatChoisi(PlatAuMenu plat, int quantite) {
        this.plat = plat;
        this.quantite = quantite;
        for (int i = 0; i < quantite; i++) {
            verifierInventaire(quantite);
        }
    }
    public boolean verifierInventaire(int qty){
        return inventaire.retirerList(plat.getLesIngredients(), qty);
    }
    public void setEtat(EtatsPlatEnum etat) {
        etatPlat.setEtat(this, etat);
    }
    public void changeEtat(EtatPlat etat){
        etatPlat = etat;
    }
    public EtatPlat getEtat() {
        return etatPlat;
    }

    @Override
    public String toString() {
        return "menufact.plats.PlatChoisi{" +
                "quantite=" + quantite +
                ", plat=" + plat +
                '}';
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public PlatAuMenu getPlat() {
        return plat;
    }
}
