package menufact.plats.Etat;

import menufact.plats.PlatChoisi;

public interface EtatPlat {
    void setQuantite(PlatChoisi plat, int quantite);
    void setEtat(PlatChoisi plat, EtatsPlatEnum etat);
}
