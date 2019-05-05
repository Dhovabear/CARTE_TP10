package TP10;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        Paquet pq = Paquet.genererPaquetDe32Cartes();
        pq.melanger();
        Paquet piocheJ1 = pq.piocherPlusieursCarte(16);
        Paquet piocheJ2 = pq.piocherPlusieursCarte(16);

        Paquet tasDevantJ1 = new Paquet();
        Paquet tasDevantJ2 = new Paquet();

        System.out.println(piocheJ1);
        System.out.println(piocheJ2);

        System.out.println("Debut Du jeu !\n");


        while (!piocheJ1.estVide() && !piocheJ2.estVide()){

            System.out.println("pioche J1: " + piocheJ1);
            System.out.println("pioche J2: " + piocheJ2 + "\n");

            tasDevantJ1.ajouterAuDessus(piocheJ1.piocher());
            System.out.println("J1 pose la carte: "+tasDevantJ1.getCarteAuDessus());
            tasDevantJ2.ajouterAuDessus(piocheJ2.piocher());
            System.out.println("J2 pose la carte: "+tasDevantJ2.getCarteAuDessus() + "\n");

            if(tasDevantJ1.getCarteAuDessus().estEgal(tasDevantJ2.getCarteAuDessus())){
                System.out.println("les cartes ont la meme valeur , Battaille !");
                boolean aUnGagnant = false;
                while (!aUnGagnant){
                    tasDevantJ1.ajouterAuDessus(piocheJ1.piocher());
                    System.out.println("J1 pose la carte: "+tasDevantJ1.getCarteAuDessus());
                    tasDevantJ2.ajouterAuDessus(piocheJ2.piocher());
                    System.out.println("J2 pose la carte: "+tasDevantJ2.getCarteAuDessus() + "\n");

                    if(tasDevantJ1.getCarteAuDessus().estPlusFortQue(tasDevantJ2.getCarteAuDessus())){
                        System.out.println("J1 remporte la battaille !\n");
                        aUnGagnant = true;
                        piocheJ1.fusionnerAvec(tasDevantJ1);
                        piocheJ1.fusionnerAvec(tasDevantJ2);
                        continue;
                    }else if(tasDevantJ2.getCarteAuDessus().estPlusFortQue(tasDevantJ1.getCarteAuDessus())){
                        System.out.println("J2 remporte la battaille !\n");
                        aUnGagnant = true;
                        piocheJ2.fusionnerAvec(tasDevantJ2);
                        piocheJ2.fusionnerAvec(tasDevantJ1);
                        continue;
                    }
                    System.out.println("Cartes encores egales , la battaille continue!");
                }
            }else if(tasDevantJ1.getCarteAuDessus().estPlusFortQue(tasDevantJ2.getCarteAuDessus())){
                System.out.println("J1 remporte le tour\n");
                piocheJ1.fusionnerAvec(tasDevantJ1);
                piocheJ1.fusionnerAvec(tasDevantJ2);
            }else if(tasDevantJ2.getCarteAuDessus().estPlusFortQue(tasDevantJ1.getCarteAuDessus())){
                System.out.println("J2 remporte le tour\n");
                piocheJ2.fusionnerAvec(tasDevantJ2);
                piocheJ2.fusionnerAvec(tasDevantJ1);
            }

        }

        if(piocheJ1.estVide()){
            System.out.println("J1 a perdu !");
        }else{
            System.out.println("J2 a perdu !");
        }

    }

}
