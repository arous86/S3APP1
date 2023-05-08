package menufact.plats;

public class PlatEnfant extends PlatAuMenu implements Cloneable{
    private double proportion;

    public PlatEnfant() {
    }

    public PlatEnfant(int code, String description, double prix, double proportion) {
        super(code, description, prix);
        this.proportion = proportion;
    }

    @Override
    public PlatEnfant clone() {
        PlatEnfant p = null;
        try {
            p = (PlatEnfant) super.clone();
        } finally {
            return p;
        }
    }

    public double getProportion() {
        return proportion;
    }

    @Override
    public String toString() {
        return "PlatEnfant{" +
                "proportion=" + proportion +
                "} " + super.toString();
    }
}
