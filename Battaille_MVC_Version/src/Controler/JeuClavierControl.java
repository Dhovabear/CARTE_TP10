package Controler;

import Model.JeuModel;
import View.Fenetre;
import View.JeuDessin;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Classe qui va contenir toutes les actions en cas d'entr&eacute;e du clavier
 * il est instanci&eacute; par JeuMainControl.
 * Les contr&ocirc;les li&eacute;s aux jeu sont simple:
 * <ul>
 *     <li>Fl&egrave;che de droite pour jouer un tour</li>
 *     <li>Fl&egrave;che du bas pour jouer 10 tours</li>
 * </ul>
 *
 * @see KeyListener
 * @see JeuMainControl
 * @see JeuSourisMoletteControl
 * @see JeuSourisMouvementControl
 */
public class JeuClavierControl implements KeyListener {

    private JeuModel m_jeu;
    private JeuDessin m_dessin;

    public JeuClavierControl(JeuModel jeu , Fenetre fenetre){
        this.m_jeu = jeu;
        this.m_dessin = fenetre.getPanel();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

        if(e.getKeyCode() == 39){ //Fleche de droite
            m_jeu.nextTurn();
            m_dessin.repaint();
            return;
        }

        if(e.getKeyCode() == 40){ //Fleche du bas
            for (int i = 0 ; i < 10 ; i++){
                m_jeu.nextTurn();
            }
            m_dessin.repaint();
            return;
        }

    }
}
