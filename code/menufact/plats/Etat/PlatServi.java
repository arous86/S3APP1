package menufact.plats.Etat;

import menufact.plats.PlatChoisi;

public class PlatServi implements EtatPlat{
    @Override
    public void setQuantite(PlatChoisi plat, int quantite) {
        System.out.println("Erreur: Plat servi");
    }
    @Override
    public void setEtat(PlatChoisi plat, EtatsPlatEnum etat) {
        System.out.println("Erreur: Plat servi");
    }
}
