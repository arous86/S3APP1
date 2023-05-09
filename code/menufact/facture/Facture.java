package menufact.facture;

import menufact.Chef;
import menufact.Client;
import menufact.facture.exceptions.FactureException;
import menufact.plats.Etat.EtatPlat;
import menufact.plats.Etat.EtatsPlatEnum;
import menufact.plats.Etat.PlatServi;
import menufact.plats.PlatChoisi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Une facture du systeme Menufact
 * @author Domingo Palao Munoz
 * @version 1.0
 */
public class Facture {
    FactureDonnees donnees;
    FactureAffichage affichage;
    /**
     *
     * @param client le client de la facture
     */
    public void associerClient (Client client)
    {
        donnees.associerClient(client);
    }

    /**
     * Calcul du sous total de la facture
     * @return le sous total
     */
    public double sousTotal()
    {
        return donnees.sousTotal();
    }

    /**
     *
     * @return le total de la facture
     */
    public double total(){
        return donnees.total();
    }

    /**
     * Permet de chager l'état de la facture à PAYEE
     */
    public void payer()
    {
        donnees.payer();
    }
    /**
     * Permet de chager l'état de la facture à FERMEE
     */
    public void fermer()
    {
       donnees.fermer();
    }

    /**
     * Permet de changer l'état de la facture à OUVERTE
     * @throws FactureException en cas que la facture soit PAYEE
     */
    public void ouvrir() throws FactureException
    {
        donnees.ouvrir();
    }

    /**
     *
     * @return l'état de la facture
     */
    public FactureEtat getEtat()
    {
        return donnees.getEtat();
    }

    /**
     *
     * @param description la description de la Facture
     */
    public Facture(String description) {
        donnees = new FactureDonnees(description);
        affichage = new FactureAffichage();
    }

    /**
     *
     * @param p un plat choisi
     * @throws FactureException Seulement si la facture est OUVERTE
     */
    public void ajoutePlat(PlatChoisi p) throws FactureException
    {
        donnees.ajoutePlat(p);
    }

    /**
     *
     * @return le contenu de la facture en chaîne de caracteres
     */
    @Override
    public String toString() {
        return donnees.toString();
    }

    /**
     *
     * @return une chaîne de caractères avec la facture à imprimer
     */
    public String genererFacture()
    {
        return donnees.genererFacture();
    }
    public void afficher()
    {
        affichage.afficherFacture(donnees);
    }

    public Client getClient() {
        return donnees.getClient();
    }

    public ArrayList<PlatChoisi> getPlats() {
        return donnees.getPlats();
    }
}
