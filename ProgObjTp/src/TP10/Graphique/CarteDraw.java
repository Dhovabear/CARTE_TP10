package TP10.Graphique;

import TP10.Carte;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class CarteDraw {

    public static BufferedImage carteRetourner;

    public static void loadTextures(){
    }

    public static void drawCarteRetourner(JPanel p, int x, int y){
        Graphics g = p.getGraphics();
        g.drawImage(carteRetourner,x,y,p);
    }

    public static void drawCarte(JPanel p, int x , int y , Carte c){
        Graphics g = p.getGraphics();
        switch (c.getCouleurCarte()){
            case TREFLE:
                break;
            case CARREAU:
                break;
            case COEUR:
                break;
            case PIQUE:
                break;
        }
    }
}
