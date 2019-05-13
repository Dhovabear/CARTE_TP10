package View;

import Model.JeuModel;

import javax.swing.*;
import java.awt.*;

public class JeuDessin extends JPanel {
    private JeuModel m_jeu;

    public JeuDessin(JeuModel jeu){
        this.m_jeu = jeu;
        PaquetDraw.loadRessources();
        CarteDraw.loadImages();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(50, 100, 27));
        g.fillRect(0,0,getWidth(),getHeight());
        if(!m_jeu.isJeuCommencer()){
            g.setColor(Color.green);
            g.drawString("Appuyez sur '->' pour commencer !" ,300, 200);
        }else{
            if(m_jeu.getPiocheJ1Draw() != null && m_jeu.getPiocheJ2Draw() != null){
                PaquetDraw.drawPaquetFaceCachee(m_jeu.getPiocheJ1Draw(),40,100, g, this);
                PaquetDraw.drawPaquetFaceCachee(m_jeu.getPiocheJ2Draw(),getWidth() - 200,350, g, this);
            }

            if(m_jeu.getPqDevantJ1Draw() != null && m_jeu.getM_pqDevantJ2Draw() != null){
                g.setColor(Color.white);
                PaquetDraw.drawPaquetFaceVisible(m_jeu.getPqDevantJ1Draw(),300,100, g, this);
                PaquetDraw.drawPaquetFaceVisible(m_jeu.getM_pqDevantJ2Draw(),300,300, g, this);
            }

            g.setFont(PaquetDraw.defaultFont.deriveFont(30f));
            g.drawString("Tour "+m_jeu.getNbrTour(),300,50);
        }

    }
}
