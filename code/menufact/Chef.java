package menufact;

import menufact.plats.Etat.PlatIndisponible;
import menufact.plats.Etat.PlatPreparation;
import menufact.plats.Etat.PlatTermine;

public class Chef {
    private static Chef instance = null;
    private Chef() {
    }
    public static Chef getInstance() {
        if (instance == null) {
            instance = new Chef();
        }
        return instance;
    }
    public void commanderPlat(menufact.plats.PlatChoisi platChoisi) {
        System.out.println("Chef: Commander le plat " + platChoisi.getPlat().getDescription());

        boolean result = platChoisi.verifierInventaire(platChoisi.getQuantite());
        if (result)
        {
            System.out.println("Chef: Le plat " + platChoisi.getPlat().getDescription() + " est disponible");
            System.out.println("Chef: Le plat " + platChoisi.getPlat().getDescription() + " est en preparation");
            platChoisi.setEtat(new PlatPreparation());

            System.out.println("Chef: Le plat " + platChoisi.getPlat().getDescription() + " est termine");
            platChoisi.setEtat(new PlatTermine());
        }
        else
        {
            System.out.println("Chef: Le plat " + platChoisi.getPlat().getDescription() + " est indisponible");
            platChoisi.setEtat(new PlatIndisponible());
        }
    }
}
