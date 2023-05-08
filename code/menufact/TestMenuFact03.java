package menufact;

import ingredients.*;
import inventaire.Inventaire;
import menufact.facture.exceptions.FactureException;
import menufact.exceptions.MenuException;
import menufact.facture.Facture;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatEnfant;
import menufact.plats.PlatSante;

import java.util.ArrayList;

public class TestMenuFact03 {
    public static void main(String[] args) {
        boolean trace = true;
try {


        TestMenuFact03 t = new TestMenuFact03();

        PlatAuMenu p1 = new PlatAuMenu(0, "PlatAuMenu0", 10);
        p1.setQty_epice(1);
        p1.setQty_fruit(2);
        p1.setQty_viande(3);
        p1.setQty_laitier(4);
        p1.setQty_legume(5);
        PlatAuMenu pcpy = p1.clone();
        System.out.println("Clone de PlatAuMenu");
        System.out.println(p1);
        System.out.println(pcpy);

        PlatSante ps1 = new PlatSante(10, "PlatSante0", 10, 11, 11, 11);
        PlatSante pscpy = ps1.clone();
        System.out.println("Clone de PlatSante");
        System.out.println(ps1);
        System.out.println(pscpy);

        PlatEnfant pe1 = new PlatEnfant(20, "PlatEnfant0", 10, 0.5);
        PlatEnfant pecpy = pe1.clone();
        System.out.println("Clone de PlatEnfant");
        System.out.println(pe1);
        System.out.println(pecpy);

        System.out.println("Test de l'Inventaire");
        Inventaire inventaire = new Inventaire();
        Epice epice = new Epice(30);
        Fruit fruit = new Fruit(40);
        Laitier laitier = new Laitier(50);
        Legume legume = new Legume(60);
        Viande viande = new Viande(70);
        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
        ingredients.add(epice);
        ingredients.add(fruit);
        ingredients.add(laitier);
        ingredients.add(legume);
        //ingredients.add(viande);
        inventaire.ajouterList(ingredients);
        Epice ep1 = new Epice(31);
        inventaire.retirer(ep1);
        inventaire.retirer(viande);
        inventaire.show();

        Facture f1 = new Facture("Ma Facture");
        f1.associerClient(new Client(1, "Domingo", "1234567890"));
        PlatChoisi pc1 = new PlatChoisi(p1, 1);

        f1.ajoutePlat(pc1);


} catch (FactureException e) {
            System.out.println(e.getMessage());
        }

    }
}
