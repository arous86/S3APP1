package menufact.plats.Etat;

import menufact.plats.PlatChoisi;

public class PlatTermine implements EtatPlat{
    @Override
    public void setQuantite(PlatChoisi plat, int quantite) {
        System.out.println("Erreur: Plat termine");
    }
    @Override
    public void setEtat(PlatChoisi plat, EtatsPlatEnum etat) {
        if (etat == EtatsPlatEnum.SERVI){
            plat.changeEtat(new PlatServi());
        }
        else{
            System.out.println("Erreur: Plat termine");
        }
    }
}
