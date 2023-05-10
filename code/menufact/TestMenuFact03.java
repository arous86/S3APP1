package menufact;

import ingredients.*;
import inventaire.Inventaire;
import menufact.facture.exceptions.FactureException;
import menufact.exceptions.MenuException;
import menufact.facture.Facture;
import menufact.plats.Etat.EtatPlat;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatEnfant;
import menufact.plats.PlatSante;

import java.util.ArrayList;

public class TestMenuFact03 {
    public static void main(String[] args) {
        boolean trace = true;
        try {
        System.out.println("Scenario de test------------------------------------");
        TestMenuFact03 t = new TestMenuFact03();

        System.out.println("Test creation d'un plat au menu--------------------");
        ArrayList ingredients = new ArrayList<Ingredient>();
        ingredients.add(new Epice(1));
        ingredients.add(new Fruit(2));
        ingredients.add(new Laitier(3));
        ingredients.add(new Legume(4));
        ingredients.add(new Viande(5));
        PlatAuMenu p1 = new PlatAuMenu(0, "PlatAuMenu0", 10);
        p1.ajouterIngredientList(ingredients);

        System.out.println("Clone d'un plat au menu");
        PlatAuMenu pcpy = p1.clone();
        System.out.println("Plat original" + p1);
        System.out.println("Plat copie" + pcpy);

        System.out.println("Test creation d'un plat sante");
        PlatSante ps1 = new PlatSante(10, "PlatSante0", 10, 11, 11, 11);
        PlatSante pscpy = ps1.clone();
        System.out.println(ps1);

        System.out.println("Test creation d'un plat enfant");
        PlatEnfant pe1 = new PlatEnfant(20, "PlatEnfant0", 10, 0.5);
        PlatEnfant pecpy = pe1.clone();
        System.out.println(pe1);

        System.out.println("Test de l'Inventaire--------------------");
        Inventaire inventaire = Inventaire.getInstance();
        ArrayList<Ingredient> ingredients1 = new ArrayList<Ingredient>();
        ingredients1.add(new Epice(30));
        ingredients1.add(new Fruit(40));
        ingredients1.add(new Laitier(50));
        ingredients1.add(new Legume(60));
        ingredients1.add(new Viande(70));
        inventaire.ajouterList(ingredients1);

        System.out.println("Test reussite");
        inventaire.retirer(new Epice(10));
        System.out.println("Test echec");
        inventaire.retirer(new Viande(100));

        System.out.println("Test de la Facture--------------------");
        Facture f1 = new Facture("Ma Facture");
        f1.associerClient(new Client(1, "Domingo", "1234567890"));
        PlatAuMenu p2 = new PlatAuMenu(1, "PlatAuMenu1", 10);
        p2.ajouterIngredient(new Epice(15));
        p2.ajouterIngredient(new Fruit(30));
        p2.ajouterIngredient(new Laitier(30));
        p2.ajouterIngredient(new Legume(40));
        p2.ajouterIngredient(new Viande(40));

        Inventaire inventaire1 = Inventaire.getInstance();
        inventaire1.ajouter(new Epice(100));
        inventaire1.ajouter(new Fruit(100));
        inventaire1.ajouter(new Laitier(100));
        inventaire1.ajouter(new Legume(100));
        inventaire1.ajouter(new Viande(100));
        PlatChoisi pc1 = new PlatChoisi(p2, 2);

        System.out.println("Test reussite");
        f1.ajoutePlat(pc1);



        System.out.println("Test payment de la Facture--------------------");
        f1.payer();
        System.out.println(pc1.getEtat());


        Menu menu = new Menu("Menu 1");
        menu.ajoute(p1);
        menu.ajoute(ps1);
        menu.ajoute(pe1);
        menu.position(0);
        menu.afficher();

        f1.afficher();
        //System.out.println(f1.genererFacture());



} catch (FactureException e) {
            System.out.println(e.getMessage());
        }

    }
}
