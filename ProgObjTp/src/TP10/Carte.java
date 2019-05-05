package TP10;

import java.util.ArrayList;



public class Carte {

    private Valeur m_valeurDeLaCarte;
    private Couleur m_couleurDeLaCarte;

    public Carte(Valeur valeurDeLaCarte, Couleur couleurDeLaCarte) {
        this.m_valeurDeLaCarte = valeurDeLaCarte;
        this.m_couleurDeLaCarte = couleurDeLaCarte;
    }


    public Valeur getValeurCarte() {
        return m_valeurDeLaCarte;
    }

    public Couleur getCouleurCarte() {
        return m_couleurDeLaCarte;
    }

    public boolean estPlusFortQue(Carte c){
        switch(this.m_valeurDeLaCarte){
            case SEPT:
                return false;
            case HUIT:
                switch (c.m_valeurDeLaCarte){
                    case SEPT: return true;
                    default: return false;
                }
            case NEUF:
                switch (c.m_valeurDeLaCarte){
                    case SEPT: return true;
                    case HUIT: return true;
                    default: return false;
                }
            case DIX:
                switch (c.m_valeurDeLaCarte){
                    case SEPT: return true;
                    case HUIT: return true;
                    case NEUF: return true;
                    default: return false;
                }
            case VALET:
                switch (c.m_valeurDeLaCarte){
                    case SEPT: return true;
                    case HUIT: return true;
                    case NEUF: return true;
                    case DIX: return true;
                    default: return false;
                }
            case DAME:
                switch (c.m_valeurDeLaCarte){
                    case DAME: return false;
                    case ROI: return false;
                    case AS: return false;
                    default: return true;
                }
            case ROI:
                switch (c.m_valeurDeLaCarte){
                    case ROI: return false;
                    case AS: return false;
                    default: return true;
                }
            case AS:
                if(c.m_valeurDeLaCarte == Valeur.AS)
                    return false;
                return true;
        }
        return false;
    }

    public boolean estEgal(Carte c){
        return this.m_valeurDeLaCarte == c.getValeurCarte();
    }

    @Override
    public String toString() {
        switch (m_couleurDeLaCarte){
            case TREFLE:
                switch (m_valeurDeLaCarte){
                    case SEPT: return "\uD83C\uDCD7";
                    case HUIT: return "\uD83C\uDCD8";
                    case NEUF: return "\uD83C\uDCD9";
                    case DIX:  return  "\uD83C\uDCDA";
                    case VALET: return "\uD83C\uDCDB";
                    case DAME: return "\uD83C\uDCDD";
                    case ROI: return "\uD83C\uDCDE";
                    case AS: return "\uD83C\uDCD1";
                }
                break;

            case CARREAU:
                switch (m_valeurDeLaCarte){
                    case SEPT: return "\uD83C\uDCC7";
                    case HUIT: return "\uD83C\uDCC8";
                    case NEUF: return "\uD83C\uDCC9";
                    case DIX:  return  "\uD83C\uDCCA";
                    case VALET: return "\uD83C\uDCCB";
                    case DAME: return "\uD83C\uDCCD";
                    case ROI: return "\uD83C\uDCCE";
                    case AS: return "\uD83C\uDCC1";
                }
                break;

            case COEUR:
                switch (m_valeurDeLaCarte){
                    case SEPT: return "\uD83C\uDCB7";
                    case HUIT: return "\uD83C\uDCB8";
                    case NEUF: return "\uD83C\uDCB9";
                    case DIX:  return  "\uD83C\uDCBA";
                    case VALET: return "\uD83C\uDCBB";
                    case DAME: return "\uD83C\uDCBD";
                    case ROI: return "\uD83C\uDCBE";
                    case AS: return "\uD83C\uDCB1";
                }
                break;

            case PIQUE:
                switch (m_valeurDeLaCarte){
                    case SEPT: return "\uD83C\uDCA7";
                    case HUIT: return "\uD83C\uDCA8";
                    case NEUF: return "\uD83C\uDCA9";
                    case DIX:  return  "\uD83C\uDCAA";
                    case VALET: return "\uD83C\uDCAB";
                    case DAME: return "\uD83C\uDCAD";
                    case ROI: return "\uD83C\uDCAE";
                    case AS: return "\uD83C\uDCA1";
                }
                break;
        }
        return null;
    }


}
