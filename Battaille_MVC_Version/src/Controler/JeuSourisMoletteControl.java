package Controler;

import View.EventLogDraw;
import View.Fenetre;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

/**
 * JeuSourisMoletteControl est la classe qui va g&eacute;rer les entr&eacute;es de la molette de la souris.
 * Elle sert uniquement a faire fonctionner l'historique de la partie.
 *
 * @see MouseWheelListener
 * @see EventLogDraw
 * @see Other.EventLog
 */
public class JeuSourisMoletteControl implements MouseWheelListener {

    private Fenetre m_vue;

    public JeuSourisMoletteControl(Fenetre vue) {
        this.m_vue = vue;
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        EventLogDraw ev = m_vue.getPanel().getEvDraw();
        //System.out.println(e.getWheelRotation());

        if(ev.isMouseIn()){

            if(e.getWheelRotation() > 0 && ev.getBackIndex() > 0){
                int tmp = ev.getBackIndex();
                ev.descendre();

            }else if(e.getWheelRotation() < 0 && ev.getBackIndex() < ev.getNbrOfMessage()) {
                int tmp = ev.getBackIndex();
                ev.monter();
            }
            m_vue.getPanel().repaint();
        }

    }
}
