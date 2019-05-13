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


    public static Paquet genererPaquetDe32Cartes(){
        Paquet p = new Paquet();
        p.ajouterAuDessus(new Carte(Couleur.TREFLE,Valeur.SEPT,0));
        p.ajouterAuDessus(new Carte(Couleur.TREFLE,Valeur.HUIT,1));
        p.ajouterAuDessus(new Carte(Couleur.TREFLE,Valeur.NEUF,2));
        p.ajouterAuDessus(new Carte(Couleur.TREFLE,Valeur.DIX,3));
        p.ajouterAuDessus(new Carte(Couleur.TREFLE,Valeur.VALET,4));
        p.ajouterAuDessus(new Carte(Couleur.TREFLE,Valeur.DAME,5));
        p.ajouterAuDessus(new Carte(Couleur.TREFLE,Valeur.ROI,6));
        p.ajouterAuDessus(new Carte(Couleur.TREFLE,Valeur.AS,7));

        p.ajouterAuDessus(new Carte(Couleur.CARREAU,Valeur.SEPT,8));
        p.ajouterAuDessus(new Carte(Couleur.CARREAU,Valeur.HUIT,9));
        p.ajouterAuDessus(new Carte(Couleur.CARREAU,Valeur.NEUF,10));
        p.ajouterAuDessus(new Carte(Couleur.CARREAU,Valeur.DIX,11));
        p.ajouterAuDessus(new Carte(Couleur.CARREAU,Valeur.VALET,12));
        p.ajouterAuDessus(new Carte(Couleur.CARREAU,Valeur.DAME,13));
        p.ajouterAuDessus(new Carte(Couleur.CARREAU,Valeur.ROI,14));
        p.ajouterAuDessus(new Carte(Couleur.CARREAU,Valeur.AS,15));

        p.ajouterAuDessus(new Carte(Couleur.COEUR,Valeur.SEPT,16));
        p.ajouterAuDessus(new Carte(Couleur.COEUR,Valeur.HUIT,17));
        p.ajouterAuDessus(new Carte(Couleur.COEUR,Valeur.NEUF,18));
        p.ajouterAuDessus(new Carte(Couleur.COEUR,Valeur.DIX,19));
        p.ajouterAuDessus(new Carte(Couleur.COEUR,Valeur.VALET,20));
        p.ajouterAuDessus(new Carte(Couleur.COEUR,Valeur.DAME,21));
        p.ajouterAuDessus(new Carte(Couleur.COEUR,Valeur.ROI,22));
        p.ajouterAuDessus(new Carte(Couleur.COEUR,Valeur.AS,23));

        p.ajouterAuDessus(new Carte(Couleur.PIQUE,Valeur.SEPT,24));
        p.ajouterAuDessus(new Carte(Couleur.PIQUE,Valeur.HUIT,25));
        p.ajouterAuDessus(new Carte(Couleur.PIQUE,Valeur.NEUF,26));
        p.ajouterAuDessus(new Carte(Couleur.PIQUE,Valeur.DIX,27));
        p.ajouterAuDessus(new Carte(Couleur.PIQUE,Valeur.VALET,28));
        p.ajouterAuDessus(new Carte(Couleur.PIQUE,Valeur.DAME,29));
        p.ajouterAuDessus(new Carte(Couleur.PIQUE,Valeur.ROI,30));
        p.ajouterAuDessus(new Carte(Couleur.PIQUE,Valeur.AS,31));
        return p;
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

    public int getNbrCartes(){
        return m_contenu.size();
    }

    public Carte getCarteAuDessus(){
        return m_contenu.getFirst();
    }

    public boolean estVide() {
        return m_contenu.isEmpty();
    }

    public void fusionnerAvec(Paquet paquet2) {
        while (!paquet2.estVide()){
            this.ajouterAuDessous(paquet2.piocher());
        }
    }
}
