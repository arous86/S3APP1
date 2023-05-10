package menufact.plats.Etat;

import menufact.plats.PlatChoisi;

public class PlatTermine implements EtatPlat{
    @Override
    public void setQuantite(PlatChoisi plat, int quantite) {
        System.out.println("Erreur: Plat termine");
    }
    @Override
    public void setEtat(PlatChoisi plat, EtatPlat etat) {
        if (etat instanceof PlatServi){
            plat.changeEtat(new PlatServi());
        }
        else{
            System.out.println("Erreur: Plat termine");
        }
    }
}
