package Model;

import Other.EventLog;
import Other.Paquet;
import View.PaquetDraw;

/**
 * JeuModel joue le r&ocirc;le du model (car le programme est concu dans une architecture MVC)
 * Le jeu g&egrave;re les deux joueurs , leurs cartes , etc...
 * Le jeu se pr&eacute;pare a la construction du mod&egrave;le et se d&eacute;roule en utilisant la fonction nextTurn() ( qui comme son nom l'indique va jouer un tour).
 * Les &eacute;v&egrave;nements du jeu seront enregistr&eacute;s dans un historique qui permetra de consulter les &eacute;venements de la partie.
 *
 * Cette classe contients des variables accessible via des Getters, ces variables servent a la vue
 * qui va pouvoir savoir quelle sont les derni&egrave;res cartes jou&eacute;es. Ceci est n&eacute;cessaire car a la fin d'un tour les cartes sont remise dans les paquets
 * (suivant le r&eacute;sultat du tour bien sur) et donc quand la vue voulais voir les cartes jou&eacute;es ce tour , elles n'existaits d&eacute;ja plus, d'o&ugrave; ces variables
 * temporaires.
 *
 * @see View.Fenetre
 * @see EventLog
 * @see Paquet
 * @see Other.Carte
 */
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

    /**
     * Fonction qui va jouer le prochain tour.
     * note: elle ne fera plus rien si le jeu est termin&eacute;.
     */
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


                m_batailleEnCours = false;

                m_piocheJ1.fusionnerAvec(m_tasDevantJ1);
                m_piocheJ1.fusionnerAvec(m_tasDevantJ2);

                chat.print("J1  :   " + m_piocheJ1.getNbrCartes() + "   |   J2  :   " + m_piocheJ2.getNbrCartes());
                chat.print("");


            }else if(m_tasDevantJ2.getCarteAuDessus().estPlusFortQue(m_tasDevantJ1.getCarteAuDessus())){

                chat.print("J2 remporte la bataille");
                chat.print("et gagne " + (m_tasDevantJ1.getNbrCartes() + m_tasDevantJ2.getNbrCartes()) + " cartes");


                m_batailleEnCours = false;

                m_piocheJ2.fusionnerAvec(m_tasDevantJ2);
                m_piocheJ2.fusionnerAvec(m_tasDevantJ1);

                chat.print("J1  :   " + m_piocheJ1.getNbrCartes() + "   |   J2  :   " + m_piocheJ2.getNbrCartes());
                chat.print("");

            }else{
                chat.print("la bataille continue");
                chat.print("J1  :   " + m_piocheJ1.getNbrCartes() + "   |   J2  :   " + m_piocheJ2.getNbrCartes());
                chat.print("");
            }
        }else{

            poserCarte();
            updateDerniereCartesJouee();

            if(m_tasDevantJ1.getCarteAuDessus().estPlusFortQue(m_tasDevantJ2.getCarteAuDessus())){

                chat.print("J1 remporte le tour");
                chat.print("et gagne " + (m_tasDevantJ1.getNbrCartes() + m_tasDevantJ2.getNbrCartes()) + " cartes");


                m_piocheJ1.fusionnerAvec(m_tasDevantJ1);
                m_piocheJ1.fusionnerAvec(m_tasDevantJ2);

                chat.print("J1  :   " + m_piocheJ1.getNbrCartes() + "   |   J2  :   " + m_piocheJ2.getNbrCartes());
                chat.print("");


            }else if(m_tasDevantJ2.getCarteAuDessus().estPlusFortQue(m_tasDevantJ1.getCarteAuDessus())){

                chat.print("J2 remporte le tour");
                chat.print("et gagne " + (m_tasDevantJ1.getNbrCartes() + m_tasDevantJ2.getNbrCartes()) + " cartes");

                m_piocheJ2.fusionnerAvec(m_tasDevantJ2);
                m_piocheJ2.fusionnerAvec(m_tasDevantJ1);

                chat.print("J1  :   " + m_piocheJ1.getNbrCartes() + "   |   J2  :   " + m_piocheJ2.getNbrCartes());
                chat.print("");

            }else{

                m_batailleEnCours = true;

                chat.print("bataille!");
                chat.print("J1  :   " + m_piocheJ1.getNbrCartes() + "   |   J2  :   " + m_piocheJ2.getNbrCartes());
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

    public Paquet getPqDevantJ2Draw() {
        return m_pqDevantJ2Draw;
    }

    public Paquet getPiocheJ1Draw() {
        return m_piocheJ1Draw;
    }

    public Paquet getPiocheJ2Draw() {
        return m_piocheJ2Draw;
    }

    /**
     * @return L'&eacute;tat de la partie (si elle est en cours ou non)
     */
    public boolean isJeuCommencer() {
        return m_jeuCommencer;
    }

    /**
     * @return Nombre de tours jou&eacute;s depuis le d&eacute;but de la partie.
     */
    public int getNbrTour() {
        return m_nbrTour;
    }

    /**
     * @return L'historique de la partie
     */
    public EventLog getEventLog() {
        return chat;
    }
}
