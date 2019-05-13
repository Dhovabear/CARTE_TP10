package Controler;

import Model.JeuModel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class JeuClavierControl implements KeyListener {

    private JeuModel m_jeu;

    public JeuClavierControl(JeuModel jeu){
        this.m_jeu = jeu;
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
            return;
        }

        if(e.getKeyCode() == 40){ //Fleche du bas
            for (int i = 0 ; i < 10 ; i++){
                m_jeu.nextTurn();
            }
            return;
        }

    }
}
