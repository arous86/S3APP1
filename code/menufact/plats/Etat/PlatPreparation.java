package menufact.plats.Etat;

import menufact.plats.PlatChoisi;

public class PlatPreparation implements EtatPlat{
    @Override
    public void setQuantite(PlatChoisi plat, int quantite) {
        // Erreur
        System.out.println("Erreur: Plat en preparation");
    }
    @Override
    public void setEtat(PlatChoisi plat, EtatPlat etat) {
        if (etat instanceof PlatTermine){
            plat.changeEtat(new PlatTermine());
        }
        else if(etat instanceof PlatIndisponible)
        {
            plat.changeEtat(new PlatIndisponible());
        }
        else{
            System.out.println("Erreur: Plat en preparation");
        }
    }
}
