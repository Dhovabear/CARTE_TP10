package View;

import Other.EventLog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class EventLogDraw {

    public EventLog log;
    private boolean mouseIn;
    private int backIndex;
    private int x;
    private  int y;

    public EventLogDraw(EventLog log , int x, int y , Fenetre fen){
        this.log = log;
        backIndex = 0;
        this.x = x;
        this.y = y;
        mouseIn = false;

        fen.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                if(e.getX() < x+180 && e.getX() > x &&
                   e.getY() < y && e.getY() > y-170){
                    mouseIn = true;
                }else{
                    mouseIn = false;
                }

            }
        });
        fen.addMouseWheelListener( new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(mouseIn){
                    if(e.getWheelRotation() > 0 && backIndex > 0){
                        backIndex --;
                    }else if(e.getWheelRotation() < 0 && backIndex < log.getMessages().size()){
                        backIndex ++;
                    }
                }
            }

        });

        //fen.addMouseWheelListener(mwl);
    }

    public void draw(Graphics g){
        g.setColor(Color.black);
        g.fillRect(x-3,y-173 , 206,186);

        g.setColor(Color.lightGray);
        g.fillRect(x,y-170 , 200,180);

        g.setColor(Color.gray);
        g.fillRect(x,y-170 , 200,25);

        g.setColor(Color.black);
        g.setFont(PaquetDraw.policeCompteur.deriveFont(19f));

        g.drawString("HISTORIQUE",x+10,y-150);

        for (int i = 0 ; i < 7 ; i++){
            if(log.getMessages().size()-1-i-backIndex <= 0){
                continue;
            }
            g.drawString(log.getMessages().get(log.getMessages().size()-1-i-backIndex),x+10,(y - i*20));
            //System.out.println(log.getMessages().size());
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isMouseIn() {
        return mouseIn;
    }

    public void setMouseIn(boolean mouseIn) {
        this.mouseIn = mouseIn;
    }

    public int getBackIndex() {
        return backIndex;
    }

    public void setBackIndex(int backIndex) {
        this.backIndex = backIndex;
    }
}
