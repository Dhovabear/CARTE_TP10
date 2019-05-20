package TP11;

import java.util.Scanner;

public abstract class Habitation {

    private String m_adresse;
    private float m_superficie;

    public Habitation() {
        this("nowhere",0.0f);
    }

    public Habitation(String m_adresse , float superficie) {
        this.m_adresse = m_adresse;
        this.m_superficie = superficie;
    }

    public void init(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEntrez une adresse pour l'habitation: ");
        this.m_adresse = scan.next();
        System.out.print("Entrez une superficie: ");
        this.m_superficie = scan.nextFloat();
    }

    public float getSuperficie(){
        return m_superficie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Habitation that = (Habitation) o;

        if (Float.compare(that.m_superficie, m_superficie) != 0) return false;
        return m_adresse != null ? m_adresse.equals(that.m_adresse) : that.m_adresse == null;

    }

    public String getAdresse(){
        return m_adresse;
    }

    @Override
    public String toString() {
        return "Habitation: " + m_adresse + ", de superficie:  " + m_superficie +"m2 ";
    }
}
