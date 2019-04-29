package TP10;

import java.util.ArrayList;

public class Carte {

    public static enum Couleur{
        TREFLE,
        CARREAU,
        COEUR,
        PIQUE;
    };

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
