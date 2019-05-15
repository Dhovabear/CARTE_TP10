package Controler;

import Model.JeuModel;
import View.Fenetre;

/**
 * JeuMainControl est le cont&ocirc;leur principal du programme ,
 * il appelle tout les autres contr&ocirc;leurs, cr&eacute;e la vue
 * et ajoute les listeners a la vue.
 *
 * @see Fenetre
 * @see JeuSourisMouvementControl
 * @see JeuSourisMoletteControl
 * @see JeuClavierControl
 */
public class JeuMainControl {
    private JeuModel m_jeu;
    private Fenetre m_vue;

    public JeuMainControl(JeuModel jeu) {
        this.m_jeu = jeu;
        m_vue = new Fenetre(jeu);
        m_vue.addKeyListener(new JeuClavierControl(jeu,m_vue));
        m_vue.addMouseMotionListener(new JeuSourisMouvementControl(m_vue));
        m_vue.addMouseWheelListener(new JeuSourisMoletteControl(m_vue));
    }
}
