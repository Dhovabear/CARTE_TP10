package TP11;

import java.util.Scanner;

public class Terrain {

    protected float m_superficie;
    protected String m_nom;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Terrain terrain = (Terrain) o;

        if (Float.compare(terrain.m_superficie, m_superficie) != 0) return false;
        return m_nom != null ? m_nom.equals(terrain.m_nom) : terrain.m_nom == null;

    }

    @Override
    public String toString() {
        return m_nom + " de superficie " + m_superficie;
    }
}
