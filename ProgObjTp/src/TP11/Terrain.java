package TP11;

import java.util.Scanner;

public class Terrain {

    private float m_superficie;
    private String m_nom;

    public Terrain(){
        this("unnamedLand",0.0f);
    }

    public Terrain(String unNom,float uneSuperficie){
        this.m_nom = unNom;
        this.m_superficie = uneSuperficie;
    }

    public void init(){
        Scanner in = new Scanner(System.in);
        System.out.print("\n Entrez le nom du terrain: ");
        this.m_nom = in.next();
        System.out.print("Entrez la superficie du terrain: ");
        this.m_superficie = in.nextFloat();
    }

}
