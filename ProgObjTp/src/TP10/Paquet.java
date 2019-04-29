package TP10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Paquet {

    /*
    POUR DES RAISONS DE CLARTEE, LE DEBUT DE LA LISTE REPRESENTE LE HAUT DE LA PIOCHE
     */

    private LinkedList<Carte> m_contenu;

    public Paquet(){
        this(new LinkedList<>());
    }

    public Paquet(LinkedList<Carte> contenu) {
        this.m_contenu = contenu;
    }

    public void ajouterAuDessus(Carte c){
        m_contenu.addFirst(c);
    }

    public void ajouterAuDessous(Carte c){
        m_contenu.addLast(c);
    }

    public Carte tirerCarteAuDessus(){

    }

    public void melanger(){
        Random rng = new Random(System.currentTimeMillis());
        LinkedList<Carte> tmp = new LinkedList<Carte>(m_contenu);
        ArrayList<Carte> tasMelanger = new ArrayList<Carte>();

        while (!tmp.isEmpty()){
            int endroitOuPlacer = rng.nextInt(tasMelanger.size());
            Carte debog = tmp.pollFirst();
            System.out.println(debog);
            tasMelanger.add(endroitOuPlacer, debog);

        }

        this.m_contenu = new LinkedList<Carte>(tasMelanger);

    }


}
