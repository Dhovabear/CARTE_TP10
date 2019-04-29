package fr.progObj.tp1;

public class Commerciaux extends Employe {

    private int m_nbrVentes;
    private static int m_valVente = 5;

    public Commerciaux(String nom, int indiceSalarial) {
        super(nom, indiceSalarial);
    }

    public int getM_nbrVentes() {
        return m_nbrVentes;
    }

    public void vend(){
        m_nbrVentes ++;
    }

    @Override
    public int calculerSalaire() {
        return Employe.m_valSalaire + (m_nbrVentes*m_valVente);
    }
}
