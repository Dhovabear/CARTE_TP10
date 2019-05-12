package Other;

import java.util.Collections;
import java.util.LinkedList;

public class Paquet {
    private LinkedList<Carte> m_contenu;


    public Paquet(){
        this(new LinkedList<Carte>());
    }

    public Paquet(LinkedList<Carte> cartes){
        this.m_contenu = cartes;
    }

    public Paquet(Paquet p){
        this.m_contenu = (LinkedList<Carte>) p.m_contenu.clone();
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

    public Paquet piocherPlusieursCartes(int nbr){
        Paquet p = new Paquet();
        for (int i = 0; i < nbr ; i++){
            p.ajouterAuDessus(piocher());
        }
        return p;
    }

    public void melanger(){
        Collections.shuffle(this.m_contenu);
    }

}
