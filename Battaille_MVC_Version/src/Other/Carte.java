package Other;

import java.awt.image.BufferedImage;

import static Other.Valeur.*;


public class Carte {


    private Couleur m_couleurCarte;
    private Valeur m_valeurCarte;
    private int m_imageId;

    public Carte(Couleur couleurCarte, Valeur valeurCarte, int imageId) {
        this.m_couleurCarte = couleurCarte;
        this.m_valeurCarte = valeurCarte;
        this.m_imageId = imageId;
    }
    
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

    public int getImageId() {
        return m_imageId;
    }
}
