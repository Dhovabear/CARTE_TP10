package TP10;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Paquet {

    /*
    POUR DES RAISONS DE CLARTEE, LE DEBUT DE LA LISTE REPRESENTE LE HAUT DE LA PIOCHE
     */

    private LinkedList<Carte> m_contenu;

    public Paquet(){
        this(new LinkedList<>());
    }

    public Paquet(Paquet p){
        this.m_contenu = (LinkedList<Carte>) p.m_contenu.clone();
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

    public Carte piocher(){
        return m_contenu.pollFirst();
    }

    public Paquet piocherPlusieursCarte(int nbr){
        Paquet pq = new Paquet();
        for (int i = 0 ; i < nbr ; i++){
            pq.ajouterAuDessus(m_contenu.pollFirst());
        }
        return pq;
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

    public Carte getCarteAuDessus(){
        return m_contenu.getFirst();
    }

    public boolean estVide(){
        return m_contenu.isEmpty();
    }

    public void fusionnerAvec(Paquet paquet2){
        while (!paquet2.estVide()){
            this.ajouterAuDessous(paquet2.piocher());
        }
    }

    public int nbrCartes(){
        return m_contenu.size();
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

    public static Paquet genererPaquetDe32Cartes(){
        Paquet p = new Paquet();
        p.ajouterAuDessus(new Carte(Valeur.SEPT, Couleur.TREFLE));
        p.ajouterAuDessus(new Carte(Valeur.HUIT, Couleur.TREFLE));
        p.ajouterAuDessus(new Carte(Valeur.NEUF, Couleur.TREFLE));
        p.ajouterAuDessus(new Carte(Valeur.DIX, Couleur.TREFLE));
        p.ajouterAuDessus(new Carte(Valeur.VALET, Couleur.TREFLE));
        p.ajouterAuDessus(new Carte(Valeur.DAME, Couleur.TREFLE));
        p.ajouterAuDessus(new Carte(Valeur.ROI, Couleur.TREFLE));
        p.ajouterAuDessus(new Carte(Valeur.AS, Couleur.TREFLE));

        p.ajouterAuDessus(new Carte(Valeur.SEPT, Couleur.CARREAU));
        p.ajouterAuDessus(new Carte(Valeur.HUIT, Couleur.CARREAU));
        p.ajouterAuDessus(new Carte(Valeur.NEUF, Couleur.CARREAU));
        p.ajouterAuDessus(new Carte(Valeur.DIX, Couleur.CARREAU));
        p.ajouterAuDessus(new Carte(Valeur.VALET, Couleur.CARREAU));
        p.ajouterAuDessus(new Carte(Valeur.DAME, Couleur.CARREAU));
        p.ajouterAuDessus(new Carte(Valeur.ROI, Couleur.CARREAU));
        p.ajouterAuDessus(new Carte(Valeur.AS, Couleur.CARREAU));

        p.ajouterAuDessus(new Carte(Valeur.SEPT, Couleur.COEUR));
        p.ajouterAuDessus(new Carte(Valeur.HUIT, Couleur.COEUR));
        p.ajouterAuDessus(new Carte(Valeur.NEUF, Couleur.COEUR));
        p.ajouterAuDessus(new Carte(Valeur.DIX, Couleur.COEUR));
        p.ajouterAuDessus(new Carte(Valeur.VALET, Couleur.COEUR));
        p.ajouterAuDessus(new Carte(Valeur.DAME, Couleur.COEUR));
        p.ajouterAuDessus(new Carte(Valeur.ROI, Couleur.COEUR));
        p.ajouterAuDessus(new Carte(Valeur.AS, Couleur.COEUR));

        p.ajouterAuDessus(new Carte(Valeur.SEPT, Couleur.PIQUE));
        p.ajouterAuDessus(new Carte(Valeur.HUIT, Couleur.PIQUE));
        p.ajouterAuDessus(new Carte(Valeur.NEUF, Couleur.PIQUE));
        p.ajouterAuDessus(new Carte(Valeur.DIX, Couleur.PIQUE));
        p.ajouterAuDessus(new Carte(Valeur.VALET, Couleur.PIQUE));
        p.ajouterAuDessus(new Carte(Valeur.DAME, Couleur.PIQUE));
        p.ajouterAuDessus(new Carte(Valeur.ROI, Couleur.PIQUE));
        p.ajouterAuDessus(new Carte(Valeur.AS, Couleur.PIQUE));

        return p;
    }
}
