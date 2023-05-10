package menufact.facture;

import menufact.MenuDonnees;

import java.io.IOException;
import java.io.PrintWriter;

public class FactureAffichage {
    public void afficherFacture(FactureDonnees donnees) {
        try {
            PrintWriter writer = new PrintWriter("Facture.txt", "UTF-8");
            writer.println(donnees.genererFacture());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
