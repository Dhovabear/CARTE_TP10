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
            dosCarte = ImageIO.read(CarteDraw.class.getResource("/Cards/cardBack_blue3.png"));
            imgIndex[0] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardClubs7.png"));
            imgIndex[1] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardClubs8.png"));
            imgIndex[2] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardClubs9.png"));
            imgIndex[3] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardClubs10.png"));
            imgIndex[4] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardClubsJ.png"));
            imgIndex[5] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardClubsQ.png"));
            imgIndex[6] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardClubsK.png"));
            imgIndex[7] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardClubsA.png"));

            imgIndex[8] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardDiamonds7.png"));
            imgIndex[9] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardDiamonds8.png"));
            imgIndex[10] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardDiamonds9.png"));
            imgIndex[11] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardDiamonds10.png"));
            imgIndex[12] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardDiamondsJ.png"));
            imgIndex[13] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardDiamondsQ.png"));
            imgIndex[14] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardDiamondsK.png"));
            imgIndex[15] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardDiamondsA.png"));

            imgIndex[16] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardHearts7.png"));
            imgIndex[17] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardHearts8.png"));
            imgIndex[18] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardHearts9.png"));
            imgIndex[19] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardHearts10.png"));
            imgIndex[20] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardHeartsJ.png"));
            imgIndex[21] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardHeartsQ.png"));
            imgIndex[22] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardHeartsK.png"));
            imgIndex[23] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardHeartsA.png"));

            imgIndex[24] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardSpades7.png"));
            imgIndex[25] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardSpades8.png"));
            imgIndex[26] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardSpades9.png"));
            imgIndex[27] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardSpades10.png"));
            imgIndex[28] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardSpadesJ.png"));
            imgIndex[29] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardSpadesQ.png"));
            imgIndex[30] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardSpadesK.png"));
            imgIndex[31] = ImageIO.read(CarteDraw.class.getResource("/Cards/cardSpadesA.png"));

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