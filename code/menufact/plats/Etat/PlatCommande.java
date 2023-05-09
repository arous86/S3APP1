package menufact.plats.Etat;

import menufact.plats.PlatChoisi;

public class PlatCommande implements EtatPlat{
    @Override
    public void setQuantite(PlatChoisi plat, int quantite) {
        plat.setQuantite(quantite);
    }
    @Override
    public void setEtat(PlatChoisi plat, EtatsPlatEnum etat) {

        if (etat == EtatsPlatEnum.PREPARATION){
            plat.changeEtat(new PlatPreparation());
        }
        else if(etat == EtatsPlatEnum.INDISPONIBLE)
        {
            plat.changeEtat(new PlatIndisponible());
        }
        else{
            System.out.println("Erreur: Plat commande");
        }
    }
}
