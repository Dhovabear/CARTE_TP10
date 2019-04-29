package fr.progObj.tp9;

public class Canard extends Volaille {
    private static float prix;
    private static float poidsAbattage;


    public Canard(float poids){
        this.id = nextIdToTake++;
        this.poids = poids;
    }


    public float getPrix() {
        return prix;
    }

    public static void setPrix(float prix) {
        Canard.prix = prix;
    }

    public static float getPoidsAbattage() {
        return poidsAbattage;
    }

    public static void setPoidsAbattage(float poidsAbattage) {
        Canard.poidsAbattage = poidsAbattage;
    }
}
