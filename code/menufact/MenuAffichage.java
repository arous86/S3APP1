package menufact;
import java.io.*;

public class MenuAffichage {
    public void afficherMenu(MenuDonnees donnees) {
        try {
            PrintWriter writer = new PrintWriter("Menu.txt", "UTF-8");
            writer.println(donnees.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
