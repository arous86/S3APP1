package menufact;

// Singleton
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
        System.out.println("BITCOIN");
    }
}
