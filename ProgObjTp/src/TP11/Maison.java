package TP11;

import java.util.Scanner;

public class Maison extends Habitation{

    private int m_nombrePieces;
    private String m_typeChauffage;

    public Maison() {
        this("nowhere",0.0f,0,"undefined");
    }

    public Maison(String uneAdresse, float superficie , int nombrePieces , String typeChauffage){
        super(uneAdresse,superficie);
        this.m_nombrePieces = nombrePieces;
        this.m_typeChauffage = typeChauffage;
    }

    public void init(){
        super.init();
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un nombre de pièces: ");
        this.m_nombrePieces = scan.nextInt();
        System.out.print("Entrez le type de chauffage: ");
        this.m_typeChauffage = scan.next();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Maison maison = (Maison) o;

        if (m_nombrePieces != maison.m_nombrePieces) return false;
        return m_typeChauffage != null ? m_typeChauffage.equals(maison.m_typeChauffage) : maison.m_typeChauffage == null;

    }

    @Override
    public String toString() {
        return super.toString() + " est une maison de " + m_nombrePieces +
                " pièces et a un chauffage " + m_typeChauffage;
    }
}
