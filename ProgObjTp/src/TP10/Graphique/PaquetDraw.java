package TP10.Graphique;

import TP10.Paquet;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PaquetDraw {

    public static Font fontCompteur;
    public static Font fontBase;

    public static void loadRessources(){
        try {
            fontCompteur = Font.createFont(Font.TRUETYPE_FONT,new File(PaquetDraw.class.getResource("/Font/Bubblegum.ttf").getFile())).deriveFont(35f);
            fontBase = Font.createFont(Font.TRUETYPE_FONT,new File(PaquetDraw.class.getResource("/Font/coolvetica.ttf").getFile()));
        } catch (FontFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void drawPaquetRetourner(Paquet paq, int x, int y, JPanel p , Graphics g){
        g.setColor(Color.white);
        g.setFont(fontCompteur.deriveFont(50f));
        //int y1 = y + paq.nbrCartes()*3;
        for(int i = 0; i < paq.nbrCartes() ; i++){
            CarteDraw.drawCarteRetourner(g,p,x,(y-(i*3)));
        }
        g.setColor(new Color(174, 255, 248));

        if(paq.nbrCartes()==0){
            g.drawString("Vide" , x+56 , (y-(3*paq.nbrCartes()))+110);
        }else if(paq.nbrCartes() < 10){
            g.drawString(Integer.toString(paq.nbrCartes()) , x+56 , (y-(3*paq.nbrCartes()))+110);
        }else{
            g.drawString(Integer.toString(paq.nbrCartes()) , x+40 , (y-(3*paq.nbrCartes()))+110);
        }

        g.setFont(fontCompteur.deriveFont(12f));
    }

    public static void drawPaquetFace(Paquet paq , int x , int y, JPanel p , Graphics g){
        g.setColor(Color.white);
        //int y1 = y + paq.nbrCartes()*3;
        for(int i = 0; i < paq.nbrCartes() ; i++){
            CarteDraw.drawCarte(g,p,x,(y-(i*3)),paq.getCarteAuDessus());
        }
    }
}
