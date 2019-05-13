package View;

import Other.Paquet;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PaquetDraw {

    private static Font policeCompteur;
    public static  Font defaultFont;

    public static void loadRessources(){
        try {
            policeCompteur = Font.createFont(Font.TRUETYPE_FONT,new File(PaquetDraw.class.getResource("/Font/Bubblegum.ttf").toString()));
            defaultFont = Font.createFont(Font.TRUETYPE_FONT,new File(PaquetDraw.class.getResource("/Font/coolvetica.ttf").toString()));
        } catch (FontFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void drawPaquetFaceCachee(Paquet paq , int x , int y, Graphics g , JPanel p){
        g.setColor(Color.white);
        g.setFont(policeCompteur.deriveFont(50f));

        for(int i = 0; i < paq.getNbrCartes() ; i++){
            CarteDraw.drawCarteFaceCachee(x,(y-(i*3)),g,p);
        }

        g.setColor(new Color(174, 255, 248));

        if(paq.getNbrCartes()==0){
            g.drawString("Vide" , x+56 , (y-(3*paq.getNbrCartes()))+110);
        }else if(paq.getNbrCartes() < 10){
            g.drawString(Integer.toString(paq.getNbrCartes()) , x+56 , (y-(3*paq.getNbrCartes()))+110);
        }else{
            g.drawString(Integer.toString(paq.getNbrCartes()) , x+40 , (y-(3*paq.getNbrCartes()))+110);
        }

        g.setFont(policeCompteur.deriveFont(12f));
    }

    public static void drawPaquetFaceVisible(Paquet paq , int x , int y , Graphics g , JPanel p){
        g.setColor(Color.white);
        //int y1 = y + paq.nbrCartes()*3;
        for(int i = 0; i < paq.getNbrCartes() ; i++){
            CarteDraw.drawCarte(paq.getCarteAuDessus(),x,(y-(i*3)),g,p);
        }
    }

}
