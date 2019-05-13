package View;

import Other.Carte;
import Other.Paquet;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CarteDraw {
    private static BufferedImage[] imgIndex;
    private static BufferedImage dosCarte;

    public static void loadImages() {
        imgIndex = new BufferedImage[32];
        try {
            dosCarte = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardBack_blue3.png").toString()));
            imgIndex[0] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardClubs7.png").toString()));
            imgIndex[1] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardClubs8.png").toString()));
            imgIndex[2] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardClubs9.png").toString()));
            imgIndex[3] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardClubs10.png").toString()));
            imgIndex[4] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardClubsJ.png").toString()));
            imgIndex[5] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardClubsQ.png").toString()));
            imgIndex[6] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardClubsK.png").toString()));
            imgIndex[7] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardClubsA.png").toString()));

            imgIndex[8] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardDiamonds7.png").toString()));
            imgIndex[9] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardDiamonds8.png").toString()));
            imgIndex[10] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardDiamonds9.png").toString()));
            imgIndex[11] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardDiamonds10.png").toString()));
            imgIndex[12] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardDiamondsJ.png").toString()));
            imgIndex[13] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardDiamondsQ.png").toString()));
            imgIndex[14] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardDiamondsK.png").toString()));
            imgIndex[15] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardDiamondsA.png").toString()));

            imgIndex[16] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardHearts7.png").toString()));
            imgIndex[17] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardHearts8.png").toString()));
            imgIndex[18] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardHearts9.png").toString()));
            imgIndex[19] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardHearts10.png").toString()));
            imgIndex[20] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardHeartsJ.png").toString()));
            imgIndex[21] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardHeartsQ.png").toString()));
            imgIndex[22] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardHeartsK.png").toString()));
            imgIndex[23] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardHeartsA.png").toString()));

            imgIndex[24] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardSpades7.png").toString()));
            imgIndex[25] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardSpades8.png").toString()));
            imgIndex[26] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardSpades9.png").toString()));
            imgIndex[27] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardSpades10.png").toString()));
            imgIndex[28] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardSpadesJ.png").toString()));
            imgIndex[29] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardSpadesQ.png").toString()));
            imgIndex[30] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardSpadesK.png").toString()));
            imgIndex[31] = ImageIO.read(new File(CarteDraw.class.getResource("/Cards/cardSpadesA.png").toString()));

        } catch (IOException e) {
            System.out.println("Erreur lors du chargement des images");
        }
    }

    public static void drawCarteFaceCachee(int x , int y , Graphics g , JPanel p){
        g.drawImage(dosCarte,x,y,p);
    }

    public static void drawCarte(Carte c , int x , int y , Graphics g , JPanel p){
        g.drawImage(imgIndex[c.getImageId()],x,y,p);
    }

}