package Controler;

import Model.JeuModel;
import View.Fenetre;

import javax.swing.*;

public class JeuMainControl {
    private JeuModel m_jeu;
    private Fenetre m_vue;

    public JeuMainControl(JeuModel jeu) {
        this.m_jeu = jeu;
        m_vue = new Fenetre(jeu);
        m_vue.addKeyListener(new JeuClavierControl(jeu,m_vue));
        m_vue.addMouseMotionListener(new jeuSourisMouvementControl());
        m_vue.addMouseWheelListener(new jeuSourisMoletteControl());
    }
}
