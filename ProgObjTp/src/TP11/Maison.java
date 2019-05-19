package TP11;

import java.util.Scanner;

public class Maison extends Habitation{

    private int m_nombrePieces;
    private String m_typeChauffage;

    public Maison() {
        this("nowhere",0,"undefined");
    }

    public Maison(String uneAdresse , int nombrePieces , String typeChauffage){
        super(uneAdresse);
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

}
