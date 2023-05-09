package menufact;

import menufact.exceptions.MenuException;
import menufact.plats.PlatAuMenu;

import java.util.ArrayList;

public class Menu {
    private MenuDonnees donnees;
    private MenuAffichage affichage;

    public Menu(String description) {
        donnees = new MenuDonnees(description);
        affichage = new MenuAffichage();
    }

    void ajoute (PlatAuMenu p)
    {
        donnees.ajoute(p);
    }

    public void position(int i)
    {
        donnees.position(i);
    }

    public PlatAuMenu platCourant()
    {
        return donnees.platCourant();
    }

    public void positionSuivante() throws MenuException
    {
        donnees.positionSuivante();
    }

    public void positionPrecedente() throws MenuException
    {
        donnees.positionPrecedente();
    }


    @Override
    public String toString() {
        return donnees.toString();
    }
    public void afficher(){
        affichage.afficherMenu(donnees);
    }
}
