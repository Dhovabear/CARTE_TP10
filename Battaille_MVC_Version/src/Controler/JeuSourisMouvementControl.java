package Controler;

import View.EventLogDraw;
import View.Fenetre;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * JeuSourisMouvementControl est la classe qui va g&eacute;rer les entr&eacute;es du mouvement de la souris.
 * Elle sert notament a verifi&eacute; la position de la souris pour faire fonctionner l'historique de la partie.
 *
 * @see MouseMotionListener
 * @see EventLogDraw
 * @see Other.EventLog
 */
public class JeuSourisMouvementControl implements MouseMotionListener {

    private Fenetre m_vue;

    public JeuSourisMouvementControl(Fenetre vue){
        this.m_vue = vue;
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

        EventLogDraw ev = m_vue.getPanel().getEvDraw();
        //System.out.println(ev.isMouseIn());
        if(e.getX() < ev.getX()+180 && e.getX() > ev.getX() &&
                e.getY() < ev.getY() && e.getY() > ev.getY()-170){
            ev.setMouseIn(true);
        }else{
            ev.setMouseIn(false);
        }
    }
}
