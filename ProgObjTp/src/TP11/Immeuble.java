package TP11;

public class Immeuble extends Habitation {

    private int m_nbrAppts;
    private int m_nombreEtages;

    public Immeuble() {
    }

    public Immeuble(String m_adresse, int m_nbrAppts, int m_nombreEtages) {
        super(m_adresse);
        this.m_nbrAppts = m_nbrAppts;
        this.m_nombreEtages = m_nombreEtages;
    }

    public void init(){

    }
}
