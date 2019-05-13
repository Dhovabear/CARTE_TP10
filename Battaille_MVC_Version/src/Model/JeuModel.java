package Model;

import Other.EventLog;
import Other.Paquet;
import View.PaquetDraw;

public class JeuModel {

    private  boolean m_batailleEnCours;
    private  int m_gagnant;

    //Variables temporaires pour le dessin
    private Paquet m_pqDevantJ1Draw;
    private Paquet m_pqDevantJ2Draw;
    private Paquet m_piocheJ1Draw;
    private Paquet m_piocheJ2Draw;

    private Paquet m_tasDevantJ1;
    private Paquet m_piocheJ1;
    private Paquet m_tasDevantJ2;
    private Paquet m_piocheJ2;

    private boolean m_jeuCommencer = false;
    private int m_nbrTour = 0;
    private EventLog chat;

    public JeuModel(){
        Paquet pq = Paquet.genererPaquetDe32Cartes();
        pq.melanger();
        m_piocheJ1 = pq.piocherPlusieursCartes(16);
        m_piocheJ2 = pq.piocherPlusieursCartes(16);

        m_tasDevantJ1 = new Paquet();
        m_tasDevantJ2 = new Paquet();

        chat = new EventLog();
    }

    public void nextTurn(){
        m_jeuCommencer = true;

        if(m_gagnant != 0){ return;}

        m_nbrTour++;
        chat.print("--tour "+m_nbrTour+"--");

        if(m_piocheJ1.estVide()){

            m_gagnant = 2;

            chat.print("Partie terminée");
            chat.print("J2 gagnant");

            updateDerniereCartesJouee();

            return;

        }else if(m_piocheJ2.estVide()){

            m_gagnant = 1;

            chat.print("Partie terminée");
            chat.print("J1 gagnant");

            updateDerniereCartesJouee();

            return;
        }

        if(m_batailleEnCours){
            poserCarte();

            updateDerniereCartesJouee();

            if(m_tasDevantJ1.getCarteAuDessus().estPlusFortQue(m_tasDevantJ2.getCarteAuDessus())){

                chat.print("J1 remporte la bataille");
                chat.print("et gagne " + (m_tasDevantJ1.getNbrCartes() + m_tasDevantJ2.getNbrCartes()) + " cartes");
                chat.print("");

                m_batailleEnCours = false;

                m_piocheJ1.fusionnerAvec(m_tasDevantJ1);
                m_piocheJ1.fusionnerAvec(m_tasDevantJ2);

            }else if(m_tasDevantJ2.getCarteAuDessus().estPlusFortQue(m_tasDevantJ1.getCarteAuDessus())){

                chat.print("J2 remporte la bataille");
                chat.print("et gagne " + (m_tasDevantJ1.getNbrCartes() + m_tasDevantJ2.getNbrCartes()) + " cartes");
                chat.print("");

                m_batailleEnCours = false;

                m_piocheJ2.fusionnerAvec(m_tasDevantJ2);
                m_piocheJ2.fusionnerAvec(m_tasDevantJ1);

            }else{
                chat.print("la bataille continue");
                chat.print("");
            }
        }else{

            poserCarte();
            updateDerniereCartesJouee();

            if(m_tasDevantJ1.getCarteAuDessus().estPlusFortQue(m_tasDevantJ2.getCarteAuDessus())){

                chat.print("J1 remporte le tour");
                chat.print("et gagne " + (m_tasDevantJ1.getNbrCartes() + m_tasDevantJ2.getNbrCartes()) + " cartes");
                chat.print("");

                m_piocheJ1.fusionnerAvec(m_tasDevantJ1);
                m_piocheJ1.fusionnerAvec(m_tasDevantJ2);

            }else if(m_tasDevantJ2.getCarteAuDessus().estPlusFortQue(m_tasDevantJ1.getCarteAuDessus())){

                chat.print("J2 remporte le tour");
                chat.print("et gagne " + (m_tasDevantJ1.getNbrCartes() + m_tasDevantJ2.getNbrCartes()) + " cartes");
                chat.print("");

                m_piocheJ2.fusionnerAvec(m_tasDevantJ2);
                m_piocheJ2.fusionnerAvec(m_tasDevantJ1);

            }else{

                m_batailleEnCours = true;

                chat.print("bataille!");
                chat.print("");
            }
        }

    }

    private void updateDerniereCartesJouee() {

        m_pqDevantJ1Draw = new Paquet(m_tasDevantJ1);
        m_pqDevantJ2Draw = new Paquet(m_tasDevantJ2);

        m_piocheJ1Draw = new Paquet(m_piocheJ1);
        m_piocheJ2Draw = new Paquet(m_piocheJ2);

    }

    private void poserCarte(){

        m_tasDevantJ1.ajouterAuDessus(m_piocheJ1.piocher());
        m_tasDevantJ2.ajouterAuDessus(m_piocheJ2.piocher());

    }

    public Paquet getPqDevantJ1Draw() {
        return m_pqDevantJ1Draw;
    }

    public Paquet getM_pqDevantJ2Draw() {
        return m_pqDevantJ2Draw;
    }

    public Paquet getPiocheJ1Draw() {
        return m_piocheJ1Draw;
    }

    public Paquet getPiocheJ2Draw() {
        return m_piocheJ2Draw;
    }

    public Paquet getTasDevantJ2() {
        return m_tasDevantJ2;
    }

    public Paquet getPiocheJ2() {
        return m_piocheJ2;
    }

    public boolean isJeuCommencer() {
        return m_jeuCommencer;
    }

    public int getNbrTour() {
        return m_nbrTour;
    }

    public EventLog getEventLog() {
        return chat;
    }
}
