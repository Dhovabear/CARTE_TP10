package fr.progObj.tp9;

public class Poulet extends Volaille {
    public static float prix;
    private static float poidsAbattage;


    public Poulet(float poids) {
        this.id = nextIdToTake++;
        this.poids = poids;
    }

    public float getPrix() {
        return prix;
    }

    public static void setPrix(float prix) {
        Poulet.prix = prix;
    }

    public static float getPoidsAbattage() {
        return poidsAbattage;
    }

    public static void setPoidsAbattage(float poidsAbattage) {
        Poulet.poidsAbattage = poidsAbattage;
    }
}
