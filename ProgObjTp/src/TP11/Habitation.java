package TP11;

import java.util.Scanner;

public abstract class Habitation {

    private String m_adresse;

    public Habitation() {
        this("nowhere");
    }

    public Habitation(String m_adresse) {
        this.m_adresse = m_adresse;
    }

    public void init(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEntrez un nom pour l'habitation: ");
        this.m_adresse = scan.next();
    }
}
