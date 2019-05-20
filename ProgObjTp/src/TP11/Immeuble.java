package TP11;

import java.util.Scanner;

public class Immeuble extends Habitation {

    private int m_nbrAppts;
    private int m_nombreEtages;

    public Immeuble() {
        this("nowhere",0.0f,0,0);
    }

    public Immeuble(String m_adresse , float superficie, int m_nbrAppts, int m_nombreEtages) {
        super(m_adresse,superficie);
        this.m_nbrAppts = m_nbrAppts;
        this.m_nombreEtages = m_nombreEtages;
    }

    public void init(){
        super.init();
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez un nombre d'appartements: ");
        this.m_nbrAppts = in.nextInt();
        System.out.print("Entrez un nombre d'etages: ");
        this.m_nombreEtages = in.nextInt();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Immeuble immeuble = (Immeuble) o;

        if (m_nbrAppts != immeuble.m_nbrAppts) return false;
        return m_nombreEtages == immeuble.m_nombreEtages;

    }

    @Override
    public String toString() {
        return super.toString() + " est un immeuble de " +
                m_nombreEtages + " étages pour " +m_nbrAppts +
                " appartements";
    }
}
