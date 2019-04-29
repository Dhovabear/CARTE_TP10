package fr.progObj.tp9;

public abstract class Volaille {
    protected int id;
    protected static int nextIdToTake;
    protected float poids;

    private static float prix;

    public abstract float getPrix();

    public int getId() {
        return id;
    }

    public float getPoids() {
        return poids;
    }

}
