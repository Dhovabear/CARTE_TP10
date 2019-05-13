package Controler;

import View.EventLogDraw;
import View.Fenetre;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class jeuSourisMoletteControl implements MouseWheelListener {

    private Fenetre m_vue;

    public jeuSourisMoletteControl(Fenetre vue) {
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
