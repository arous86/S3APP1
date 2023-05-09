package menufact.plats.Etat;

import menufact.plats.PlatChoisi;

public class PlatPreparation implements EtatPlat{
    @Override
    public void setQuantite(PlatChoisi plat, int quantite) {
        // Erreur
        System.out.println("Erreur: Plat en preparation");
    }
    @Override
    public void setEtat(PlatChoisi plat, EtatsPlatEnum etat) {
        if (etat == EtatsPlatEnum.TERMINE){
            plat.changeEtat(new PlatTermine());
        }
        else if(etat == EtatsPlatEnum.INDISPONIBLE)
        {
            plat.changeEtat(new PlatIndisponible());
        }
        else{
            System.out.println("Erreur: Plat en preparation");
        }
    }
}
