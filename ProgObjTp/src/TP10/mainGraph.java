package TP10;

import TP10.Graphique.CarteDraw;
import TP10.Graphique.PaquetDraw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class mainGraph {

    public static JFrame fenetre;
    public static JPanel pan;
    public static boolean batailleEnCours;
    public static int gagnant;

    private static Carte j1DessusTas;
    private static Carte j2DessusTas;

    private static Paquet pqDevantJ1Draw;
    private static Paquet pqDevantJ2Draw;

    public static void main(String[] args) {

        batailleEnCours = false;
        gagnant = 0;

        Paquet pq = Paquet.genererPaquetDe32Cartes();
        pq.melanger();
        Paquet piocheJ1 = pq.piocherPlusieursCarte(16);
        Paquet piocheJ2 = pq.piocherPlusieursCarte(16);

        Paquet tasDevantJ1 = new Paquet();
        Paquet tasDevantJ2 = new Paquet();



        System.out.println(piocheJ1);
        System.out.println(piocheJ2);


        fenetre = new JFrame();
        pan = new JPanel(true){
            @Override
            protected void paintComponent(Graphics g) {
                g.setColor(new Color(50, 100, 27));
                g.fillRect(0,0,pan.getWidth(),pan.getHeight());

                PaquetDraw.drawPaquetRetourner(piocheJ1,40,100,pan,g);
                PaquetDraw.drawPaquetRetourner(piocheJ2,pan.getWidth() - 200,350,pan,g);
                if(pqDevantJ1Draw != null && pqDevantJ2Draw != null){
                    g.setColor(Color.white);
                    //CarteDraw.drawCarte(g,pan,300,100,j1DessusTas);
                    //CarteDraw.drawCarte(g,pan,300,350,j2DessusTas);
                    PaquetDraw.drawPaquetFace(pqDevantJ1Draw,300,100,pan,g);
                    PaquetDraw.drawPaquetFace(pqDevantJ2Draw,300,300,pan,g);
                }else{
                    g.setColor(Color.green);
                    g.drawString("Appuyez sur '->' pour commencer !" ,400, 200);
                }
            }
        };

        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println(e.getKeyCode());
                if(e.getKeyCode() == 39){
                    nextTurn(piocheJ1, piocheJ2, tasDevantJ1, tasDevantJ2);
                }
            }
        };
        fenetre.addKeyListener(kl);


        CarteDraw.loadTextures();
        fenetre.setContentPane(pan);
        fenetre.setSize(800,600);
        fenetre.setLocationRelativeTo(null);
        fenetre.setTitle("Bataille!");
        fenetre.setResizable(false);
        fenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fenetre.setVisible(true);

        while (true){
            pan.repaint();
        }


    }

    private static void nextTurn(Paquet piocheJ1, Paquet piocheJ2, Paquet tasDevantJ1, Paquet tasDevantJ2) {
        if(gagnant == 0){

            if(piocheJ1.estVide()){
                gagnant = 2;
                System.out.println("J1 a perdu !");
                return;
            }else if(piocheJ2.estVide()){
                gagnant = 1;
                System.out.println("J2 a perdu !");
                return;
            }

            System.out.println("pioche J1: " + piocheJ1);
            System.out.println("pioche J2: " + piocheJ2 + "\n");

            if(batailleEnCours){
                jouerTour(tasDevantJ1, piocheJ1, tasDevantJ2, piocheJ2);

                updateCardToDraw(tasDevantJ1, tasDevantJ2);

                if(tasDevantJ1.getCarteAuDessus().estPlusFortQue(tasDevantJ2.getCarteAuDessus())){
                    System.out.println("J1 remporte la battaille !\n");
                    batailleEnCours = false;
                    piocheJ1.fusionnerAvec(tasDevantJ1);
                    piocheJ1.fusionnerAvec(tasDevantJ2);
                }else if(tasDevantJ2.getCarteAuDessus().estPlusFortQue(tasDevantJ1.getCarteAuDessus())){
                    System.out.println("J2 remporte la battaille !\n");
                    batailleEnCours = false;
                    piocheJ2.fusionnerAvec(tasDevantJ2);
                    piocheJ2.fusionnerAvec(tasDevantJ1);
                }else if(tasDevantJ1.getCarteAuDessus().estEgal(tasDevantJ2.getCarteAuDessus())){
                    System.out.println("Cartes encores egales , la battaille continue!");
                }

            }else{
                jouerTour(tasDevantJ1, piocheJ1, tasDevantJ2, piocheJ2);

                updateCardToDraw(tasDevantJ1, tasDevantJ2);

                if(tasDevantJ1.getCarteAuDessus().estEgal(tasDevantJ2.getCarteAuDessus())){
                    batailleEnCours = true;
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
        }
    }

    private static void jouerTour(Paquet tasDevantJ1, Paquet piocheJ1, Paquet tasDevantJ2, Paquet piocheJ2) {
        tasDevantJ1.ajouterAuDessus(piocheJ1.piocher());
        System.out.println("J1 pose la carte: " + tasDevantJ1.getCarteAuDessus());
        tasDevantJ2.ajouterAuDessus(piocheJ2.piocher());
        System.out.println("J2 pose la carte: " + tasDevantJ2.getCarteAuDessus() + "\n");
    }

    private static void updateCardToDraw(Paquet tasDevantJ1, Paquet tasDevantJ2) {
        //j1DessusTas = tasDevantJ1.getCarteAuDessus();
        //j2DessusTas = tasDevantJ2.getCarteAuDessus();
        pqDevantJ1Draw = new Paquet(tasDevantJ1);
        pqDevantJ2Draw = new Paquet(tasDevantJ2);
    }


}
