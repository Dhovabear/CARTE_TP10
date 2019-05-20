package TP11;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TerrainConstructible extends Terrain{

    private ArrayList<Habitation> m_habitations;

    public TerrainConstructible() {
        this("unnamedLand",0.0f,new ArrayList<Habitation>());
    }

    public TerrainConstructible(String nom, float superficie){
        this(nom,superficie,new ArrayList<Habitation>());
    }

    public TerrainConstructible(String nom , float superficie, ArrayList<Habitation> habitations){
        super(nom,superficie);
        this.m_habitations = habitations;
    }

    public void init(){
        super.init();
        Scanner in = new Scanner(System.in);
        String choix = "";
        do{
            System.out.print("\nAjouter une habitation? (entrez pour ne rien ajouter): ");
            choix = in.next();
            choix = choix.toLowerCase();

            Habitation h;


            switch (choix) {
                case "":
                    continue;
                case "maison":
                    h = new Maison();
                    construireHabitation(h);
                    break;
                case "immeuble":
                    h = new Immeuble();
                    construireHabitation(h);
                    break;
                default:
                    System.out.print("Veuillez entrer un choix valide !");
                    continue;
            }

            h.init();

        }while(!choix.equals(""));
    }

    public void construireHabitation(Habitation hab){
        float supTotal = 0.0f;
        for (Habitation h : m_habitations ) {
            supTotal += h.getSuperficie();
        }

        if(supTotal + hab.getSuperficie() <= super.m_superficie){
            m_habitations.add(hab);
        }else{
            System.out.println("\nErreur ! plus de place sur le terrain !");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        TerrainConstructible that = (TerrainConstructible) o;

        return m_habitations != null ? m_habitations.equals(that.m_habitations) : that.m_habitations == null;

    }

    public Habitation detruireHabitation(String adresse){
        for ( Habitation h: m_habitations) {
            if(h.getAdresse().equals(adresse)){
                m_habitations.remove(h);
                return h;
            }
        }
        System.out.print("Erreur l'habitation n'a pas été trouvée !");
        return null;
    }

    @Override
    public String toString() {
        String tmp = super.toString() + "\n";
        for (Habitation h: m_habitations) {
            tmp += "\t " + h.toString() + "\n";
        }
        return tmp;
    }

    public ArrayList<Habitation> getHabitations() {
        return m_habitations;
    }
}
