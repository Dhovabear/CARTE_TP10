package TP10;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        Paquet tp = new Paquet();
        tp.ajouterAuDessus(new Carte(Valeur.SEPT, Couleur.TREFLE));
        tp.ajouterAuDessus(new Carte(Valeur.HUIT,Couleur.TREFLE ));
        tp.ajouterAuDessus(new Carte(Valeur.NEUF,Couleur.TREFLE ));
        tp.ajouterAuDessus(new Carte(Valeur.DIX,Couleur.TREFLE ));
        tp.ajouterAuDessus(new Carte(Valeur.VALET,Couleur.TREFLE ));
        tp.ajouterAuDessus(new Carte(Valeur.DAME,Couleur.TREFLE ));
        tp.ajouterAuDessus(new Carte(Valeur.ROI,Couleur.TREFLE ));
        tp.ajouterAuDessus(new Carte(Valeur.AS,Couleur.TREFLE ));


        System.out.println(tp);

        for (int i = 0 ; i <  15 ; i++){
            tp.melanger();
            System.out.println(tp);
        }

    }
}
