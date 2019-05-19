package TP11;

import java.util.ArrayList;
import java.util.Scanner;

public class TerrainConstructible extends Terrain{

    private ArrayList<Habitation> m_habitations;

    public TerrainConstructible() {
        this.m_habitations = new ArrayList<Habitation>();
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
                    break;
                case "immeuble":
                    h = new Immeuble();
                    break;
                default:
                    System.out.print("Veuillez entrer un choix valide !");
                    continue;
            }

            h.init();

        }while(!choix.equals(""));
    }

    public void construireHabitation(){

    }
}
