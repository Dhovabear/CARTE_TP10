package TP10.Graphique;

import TP10.Carte;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CarteDraw {

    public static BufferedImage carteRetourner;
    private static BufferedImage trefle7;
    private static BufferedImage trefle8;
    private static BufferedImage trefle9;
    private static BufferedImage trefle10;
    private static BufferedImage trefleValet;
    private static BufferedImage trefleDame;
    private static BufferedImage trefleRoi;
    private static BufferedImage trefleAs;

    private static BufferedImage carreau7;
    private static BufferedImage carreau8;
    private static BufferedImage carreau9;
    private static BufferedImage carreau10;
    private static BufferedImage carreauValet;
    private static BufferedImage carreauDame;
    private static BufferedImage carreauRoi;
    private static BufferedImage carreauAs;

    private static BufferedImage coeur7;
    private static BufferedImage coeur8;
    private static BufferedImage coeur9;
    private static BufferedImage coeur10;
    private static BufferedImage coeurValet;
    private static BufferedImage coeurDame;
    private static BufferedImage coeurRoi;
    private static BufferedImage coeurAs;

    private static BufferedImage pique7;
    private static BufferedImage pique8;
    private static BufferedImage pique9;
    private static BufferedImage pique10;
    private static BufferedImage piqueValet;
    private static BufferedImage piqueDame;
    private static BufferedImage piqueRoi;
    private static BufferedImage piqueAs;

    public static void loadTextures(){
        try {
            carteRetourner = ImageIO.read(CarteDraw.class.getResource("/Cards/cardBack_blue3.png"));

            trefle7 = ImageIO.read(CarteDraw.class.getResource("/Cards/cardClubs7.png"));
            trefle8 = ImageIO.read(CarteDraw.class.getResource("/Cards/cardClubs8.png"));
            trefle9 = ImageIO.read(CarteDraw.class.getResource("/Cards/cardClubs9.png"));
            trefle10 = ImageIO.read(CarteDraw.class.getResource("/Cards/cardClubs10.png"));
            trefleValet = ImageIO.read(CarteDraw.class.getResource("/Cards/cardClubsJ.png"));
            trefleDame = ImageIO.read(CarteDraw.class.getResource("/Cards/cardClubsQ.png"));
            trefleRoi = ImageIO.read(CarteDraw.class.getResource("/Cards/cardClubsK.png"));
            trefleAs = ImageIO.read(CarteDraw.class.getResource("/Cards/cardClubsA.png"));

            carreau7 = ImageIO.read(CarteDraw.class.getResource("/Cards/cardDiamonds7.png"));
            carreau8 = ImageIO.read(CarteDraw.class.getResource("/Cards/cardDiamonds8.png"));
            carreau9 = ImageIO.read(CarteDraw.class.getResource("/Cards/cardDiamonds9.png"));
            carreau10 = ImageIO.read(CarteDraw.class.getResource("/Cards/cardDiamonds10.png"));
            carreauValet = ImageIO.read(CarteDraw.class.getResource("/Cards/cardDiamondsJ.png"));
            carreauDame = ImageIO.read(CarteDraw.class.getResource("/Cards/cardDiamondsQ.png"));
            carreauRoi = ImageIO.read(CarteDraw.class.getResource("/Cards/cardDiamondsK.png"));
            carreauAs = ImageIO.read(CarteDraw.class.getResource("/Cards/cardDiamondsA.png"));

            coeur7 = ImageIO.read(CarteDraw.class.getResource("/Cards/cardHearts7.png"));
            coeur8 = ImageIO.read(CarteDraw.class.getResource("/Cards/cardHearts8.png"));
            coeur9 = ImageIO.read(CarteDraw.class.getResource("/Cards/cardHearts9.png"));
            coeur10 = ImageIO.read(CarteDraw.class.getResource("/Cards/cardHearts10.png"));
            coeurValet = ImageIO.read(CarteDraw.class.getResource("/Cards/cardHeartsJ.png"));
            coeurDame = ImageIO.read(CarteDraw.class.getResource("/Cards/cardHeartsQ.png"));
            coeurRoi = ImageIO.read(CarteDraw.class.getResource("/Cards/cardHeartsK.png"));
            coeurAs = ImageIO.read(CarteDraw.class.getResource("/Cards/cardHeartsA.png"));

            pique7 = ImageIO.read(CarteDraw.class.getResource("/Cards/cardSpades7.png"));
            pique8 = ImageIO.read(CarteDraw.class.getResource("/Cards/cardSpades8.png"));
            pique9 = ImageIO.read(CarteDraw.class.getResource("/Cards/cardSpades9.png"));
            pique10 = ImageIO.read(CarteDraw.class.getResource("/Cards/cardSpades10.png"));
            piqueValet = ImageIO.read(CarteDraw.class.getResource("/Cards/cardSpadesJ.png"));
            piqueDame = ImageIO.read(CarteDraw.class.getResource("/Cards/cardSpadesQ.png"));
            piqueRoi = ImageIO.read(CarteDraw.class.getResource("/Cards/cardSpadesK.png"));
            piqueAs = ImageIO.read(CarteDraw.class.getResource("/Cards/cardSpadesA.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void drawCarteRetourner(Graphics g, JPanel p, int x, int y){
        g.drawImage(carteRetourner,x,y,p);
    }

    public static void drawCarte(Graphics g , JPanel p, int x , int y , Carte c){
        switch (c.getCouleurCarte()){
            case TREFLE:
                switch (c.getValeurCarte()){
                    case SEPT: g.drawImage(trefle7,x,y,p); break;
                    case HUIT: g.drawImage(trefle8,x,y,p); break;
                    case NEUF: g.drawImage(trefle9,x,y,p); break;
                    case DIX: g.drawImage(trefle10,x,y,p); break;
                    case VALET: g.drawImage(trefleValet,x,y,p); break;
                    case DAME: g.drawImage(trefleDame,x,y,p); break;
                    case ROI: g.drawImage(trefleRoi,x,y,p); break;
                    case AS: g.drawImage(trefleAs,x,y,p); break;
                }
            case CARREAU:
                switch (c.getValeurCarte()){
                    case SEPT: g.drawImage(carreau7,x,y,p);break;
                    case HUIT: g.drawImage(carreau8,x,y,p);break;
                    case NEUF: g.drawImage(carreau9,x,y,p);break;
                    case DIX: g.drawImage(carreau10,x,y,p);break;
                    case VALET: g.drawImage(carreauValet,x,y,p);break;
                    case DAME: g.drawImage(carreauDame,x,y,p);break;
                    case ROI: g.drawImage(carreauRoi,x,y,p);break;
                    case AS: g.drawImage(carreauAs,x,y,p);break;
                }
            case COEUR:
                switch (c.getValeurCarte()){
                    case SEPT: g.drawImage(coeur7,x,y,p);break;
                    case HUIT: g.drawImage(coeur8,x,y,p);break;
                    case NEUF: g.drawImage(coeur9,x,y,p);break;
                    case DIX: g.drawImage(coeur10,x,y,p);break;
                    case VALET: g.drawImage(coeurValet,x,y,p);break;
                    case DAME: g.drawImage(coeurDame,x,y,p);break;
                    case ROI: g.drawImage(coeurRoi,x,y,p);break;
                    case AS: g.drawImage(coeurAs,x,y,p);break;
                }
            case PIQUE:
                switch (c.getValeurCarte()){
                    case SEPT: g.drawImage(pique7,x,y,p);break;
                    case HUIT: g.drawImage(pique8,x,y,p);break;
                    case NEUF: g.drawImage(pique9,x,y,p);break;
                    case DIX: g.drawImage(pique10,x,y,p);break;
                    case VALET: g.drawImage(piqueValet,x,y,p);break;
                    case DAME: g.drawImage(piqueDame,x,y,p);break;
                    case ROI: g.drawImage(piqueRoi,x,y,p);break;
                    case AS: g.drawImage(piqueAs,x,y,p);break;
                }
        }
    }
}
