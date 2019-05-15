package Other;

import java.awt.image.BufferedImage;

import static Other.Valeur.*;


/**
 * Carte est la classe qui comme son nom l'indique repr&eacute;sente une carte de jeu.
 *
 * @see Couleur
 * @see Valeur
 * @see View.CarteDraw
 */
public class Carte {


    private Couleur m_couleurCarte;
    private Valeur m_valeurCarte;
    private int m_imageId;

    /**
     * @param couleurCarte
     * @param valeurCarte
     * @param imageId qui va contenir l'identifiant de l'image de la carte
     */
    public Carte(Couleur couleurCarte, Valeur valeurCarte, int imageId) {
        this.m_couleurCarte = couleurCarte;
        this.m_valeurCarte = valeurCarte;
        this.m_imageId = imageId;
    }

    /**
     * Fonction qui va tester la sup&eacute;riorit&eacute;e de la carte courante par rapport a la carte
     * pass&eacute;e en param&egrave;tre.
     * @param c
     * @return true si la carte courante est sup&eacute;rieur a c.
     */
    public boolean estPlusFortQue(Carte c){
        switch(this.m_valeurCarte){
            case SEPT:
                return false;
            case HUIT:
                switch (c.m_valeurCarte){
                    case SEPT: return true;
                    default: return false;
                }
            case NEUF:
                switch (c.m_valeurCarte){
                    case SEPT: return true;
                    case HUIT: return true;
                    default: return false;
                }
            case DIX:
                switch (c.m_valeurCarte){
                    case SEPT: return true;
                    case HUIT: return true;
                    case NEUF: return true;
                    default: return false;
                }
            case VALET:
                switch (c.m_valeurCarte){
                    case SEPT: return true;
                    case HUIT: return true;
                    case NEUF: return true;
                    case DIX: return true;
                    default: return false;
                }
            case DAME:
                switch (c.m_valeurCarte){
                    case DAME: return false;
                    case ROI: return false;
                    case AS: return false;
                    default: return true;
                }
            case ROI:
                switch (c.m_valeurCarte){
                    case ROI: return false;
                    case AS: return false;
                    default: return true;
                }
            case AS:
                if(c.m_valeurCarte == AS)
                    return false;
                return true;
        }
        return false;
    }

    public Couleur getCouleurCarte() {
        return m_couleurCarte;
    }

    public Valeur getValeurCarte() {
        return m_valeurCarte;
    }

    /**
     * @return l'identifant de l'image qui repr&eacute;sente la carte.
     */
    public int getImageId() {
        return m_imageId;
    }
}
