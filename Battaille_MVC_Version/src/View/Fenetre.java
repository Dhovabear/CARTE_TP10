package View;

import Model.JeuModel;

import javax.swing.*;

public class Fenetre extends JFrame {

    private JeuDessin m_jd;

    public Fenetre(JeuModel model){

        setTitle("Battaille !");
        setSize(800,600);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        m_jd = new JeuDessin(model);
        setContentPane(m_jd);
        setVisible(true);

    }

    public JeuDessin getPanel() {
        return m_jd;
    }
}
