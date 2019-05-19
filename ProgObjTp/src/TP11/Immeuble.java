package TP11;

import java.util.Scanner;

public class Immeuble extends Habitation {

    private int m_nbrAppts;
    private int m_nombreEtages;

    public Immeuble() {
        this("nowhere",0,0);
    }

    public Immeuble(String m_adresse, int m_nbrAppts, int m_nombreEtages) {
        super(m_adresse);
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
}
