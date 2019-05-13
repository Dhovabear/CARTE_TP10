package Controler;

import View.EventLogDraw;
import View.Fenetre;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class jeuSourisMouvementControl implements MouseMotionListener {

    private Fenetre m_vue;

    public jeuSourisMouvementControl(Fenetre vue){
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
