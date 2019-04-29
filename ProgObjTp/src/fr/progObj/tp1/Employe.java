package fr.progObj.tp1;

public class Employe {

    private static int m_nextIdToTake = 0;
    protected static int m_valSalaire = 1200;

    private String m_nom;
    private int m_matricule;
    private int m_indiceSalarial;

    public Employe(String nom , int indiceSalarial){
        this.m_matricule = m_nextIdToTake++ ;
        this.m_nom = nom;
        this.m_indiceSalarial = indiceSalarial;
    }

    public String toString(){
        return "N°" + m_matricule + " nom: "+ m_nom + " indiceSalarial: " + m_indiceSalarial;
    }

    public int calculerSalaire(){
        return this.m_indiceSalarial * m_valSalaire;
    }

    public String getM_nom() {
        return m_nom;
    }

    public int getM_matricule() {
        return m_matricule;
    }

    public int getM_indiceSalarial() {
        return m_indiceSalarial;
    }

    public void setM_nom(String m_nom) {
        this.m_nom = m_nom;
    }

    public void setM_indiceSalarial(int m_indiceSalarial) {
        this.m_indiceSalarial = m_indiceSalarial;
    }
}
