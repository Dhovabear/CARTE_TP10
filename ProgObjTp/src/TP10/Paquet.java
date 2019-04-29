package TP10;

import com.sun.org.apache.regexp.internal.RE;

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
        return m_contenu.pollFirst();
    }

    public void melanger(){
        Random rng = new Random(System.currentTimeMillis());
        LinkedList<Carte> tmp = new LinkedList<Carte>(m_contenu);
        ArrayList<Carte> tasMelanger = new ArrayList<Carte>();

        while (!tmp.isEmpty()){
            int endroitOuPlacer = 0;
            if(tasMelanger.size() != 0){
                endroitOuPlacer = rng.nextInt(tasMelanger.size());
            }
            tasMelanger.add(endroitOuPlacer, tmp.pollFirst());

        }

        this.m_contenu = new LinkedList<Carte>(tasMelanger);

    }

    @Override
    public String toString() {
        String result = "{";
        for (Carte c: m_contenu){
            result += c.toString();
            if(c != m_contenu.getLast()){
                result += ",";
            }
        }
        result += "}";
        return result;
    }
}
