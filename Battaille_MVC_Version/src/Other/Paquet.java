package Other;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Paquet est la classe qui va contenir une ou plusieurs cartes.
 * Elle se compose d'une LinkedList de Cartes car ceci facilite l'action de piocher et convient
 * mieux a la situation.
 *
 * @see LinkedList
 * @see Carte
 * @see View.PaquetDraw
 */
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


    /**
     * Fonction statique qui va g&eacute;nerer un paquet de 32 cartes
     * @return paquet de 32 cartes
     */
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

    /**
     * Retourne et retire la carte en haut de la pioche
     * @return premi&egrave;re carte de la pioche
     */
    public Carte piocher(){
        return m_contenu.pollFirst();
    }

    /**
     * Permet de piocher plusieurs cartes a la fois
     * @param nbr la quantit&eacute;e de carte a piocher
     * @return paquet qui contient les n cartes pioch&eacute;es
     */
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

    /**
     * Fonction qui fusionne le paquet courant avec le paquet pass&eacute; en param&egrave;tre
     * la fusion s'effectue en ajoutant le paquet pass&eacute; en param&egrave;tre au dessous du paquet courant.
     * @param paquet2
     */
    public void fusionnerAvec(Paquet paquet2) {
        while (!paquet2.estVide()){
            this.ajouterAuDessous(paquet2.piocher());
        }
    }
}
