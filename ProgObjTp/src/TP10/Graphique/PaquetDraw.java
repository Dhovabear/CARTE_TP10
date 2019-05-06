package TP10.Graphique;

import TP10.Paquet;

import javax.swing.*;
import java.awt.*;

public class PaquetDraw {

    public static void drawPaquetRetourner(Paquet paq, int x, int y, JPanel p , Graphics g){
        g.setColor(Color.white);
        //int y1 = y + paq.nbrCartes()*3;
        for(int i = 0; i < paq.nbrCartes() ; i++){
            CarteDraw.drawCarteRetourner(g,p,x,(y-(i*3)));
        }
    }

    public static void drawPaquetFace(Paquet paq , int x , int y, JPanel p , Graphics g){
        g.setColor(Color.white);
        //int y1 = y + paq.nbrCartes()*3;
        for(int i = 0; i < paq.nbrCartes() ; i++){
            CarteDraw.drawCarte(g,p,x,(y-(i*3)),paq.getCarteAuDessus());
        }
    }
}
