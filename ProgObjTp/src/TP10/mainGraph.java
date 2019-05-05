package TP10;

import javax.swing.*;

public class mainGraph {

    public static JFrame fenetre;
    public static JPanel pan;

    public static void main(String[] args) {
        fenetre = new JFrame();
        pan = new JPanel(true);

        fenetre.setContentPane(pan);
        fenetre.setSize(800,600);
        fenetre.setLocationRelativeTo(null);
        fenetre.setTitle("Bataille!");
        fenetre.setResizable(false);
        fenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fenetre.setVisible(true);

        while (true){
            pan.repaint();
        }


    }
}
