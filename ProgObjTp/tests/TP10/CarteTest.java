package TP10;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarteTest {

    // TEST SUR LA CARTE 7
    @Test
    public void test_Que_La_Carte_De_7_N_est_Pas_Superieur_A_La_Carte_7(){
        Carte t7 = new Carte(Valeur.SEPT,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t7));
    }

    @Test
    public void test_Que_La_Carte_De_7_Est_Inferieur_A_La_Carte_8(){
        Carte t7 = new Carte(Valeur.SEPT,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.HUIT,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_De_7_Est_Inferieur_A_La_Carte_9(){
        Carte t7 = new Carte(Valeur.SEPT,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.NEUF,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_De_7_Est_Inferieur_A_La_Carte_10(){
        Carte t7 = new Carte(Valeur.SEPT,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.DIX,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_De_7_Est_Inferieur_A_La_Carte_Valet(){
        Carte t7 = new Carte(Valeur.SEPT,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.VALET,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_De_7_Est_Inferieur_A_La_Carte_Dame(){
        Carte t7 = new Carte(Valeur.SEPT,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.DAME,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_De_7_Est_Inferieur_A_La_Carte_Roi(){
        Carte t7 = new Carte(Valeur.SEPT,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.ROI,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_De_7_Est_Inferieur_A_La_Carte_As(){
        Carte t7 = new Carte(Valeur.SEPT,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.AS,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }


    // TEST SUR LA CARTE DE 8
    @Test
    public void test_Que_La_Carte_De_8_Est_Inferieur_A_La_Carte_9(){
        Carte t7 = new Carte(Valeur.HUIT,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.NEUF,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_De_8_Est_Inferieur_A_La_Carte_10(){
        Carte t7 = new Carte(Valeur.HUIT,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.DIX,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_De_8_Est_Inferieur_A_La_Carte_Valet(){
        Carte t7 = new Carte(Valeur.HUIT,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.VALET,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_De_8_Est_Inferieur_A_La_Carte_Dame(){
        Carte t7 = new Carte(Valeur.HUIT,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.DAME,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_De_8_Est_Inferieur_A_La_Carte_Roi(){
        Carte t7 = new Carte(Valeur.HUIT,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.ROI,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_De_8_Est_Inferieur_A_La_Carte_As(){
        Carte t7 = new Carte(Valeur.HUIT,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.AS,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    // TEST SUR LA CARTE DE 9

    @Test
    public void test_Que_La_Carte_De_9_Est_Inferieur_A_La_Carte_10(){
        Carte t7 = new Carte(Valeur.NEUF,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.DIX,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_De_9_Est_Inferieur_A_La_Carte_Valet(){
        Carte t7 = new Carte(Valeur.NEUF,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.VALET,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_De_9_Est_Inferieur_A_La_Carte_Dame(){
        Carte t7 = new Carte(Valeur.NEUF,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.DAME,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_De_9_Est_Inferieur_A_La_Carte_Roi(){
        Carte t7 = new Carte(Valeur.NEUF,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.ROI,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_De_9_Est_Inferieur_A_La_Carte_AS(){
        Carte t7 = new Carte(Valeur.NEUF,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.AS,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    //TEST SUR LA CARTE 10

    @Test
    public void test_Que_La_Carte_De_10_Est_Inferieur_A_La_Carte_Valet(){
        Carte t7 = new Carte(Valeur.DIX,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.VALET,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_De_10_Est_Inferieur_A_La_Carte_Dame(){
        Carte t7 = new Carte(Valeur.DIX,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.DAME,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_De_10_Est_Inferieur_A_La_Carte_Roi(){
        Carte t7 = new Carte(Valeur.DIX,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.ROI,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_De_10_Est_Inferieur_A_La_Carte_As(){
        Carte t7 = new Carte(Valeur.DIX,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.AS,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    //TEST SUR LA CARTE Valet

    @Test
    public void test_Que_La_Carte_Valet_Est_Inferieur_A_La_Carte_Dame(){
        Carte t7 = new Carte(Valeur.VALET,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.DAME,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_Valet_Est_Inferieur_A_La_Carte_Roi(){
        Carte t7 = new Carte(Valeur.VALET,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.ROI,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_Valet_Est_Inferieur_A_La_Carte_As(){
        Carte t7 = new Carte(Valeur.VALET,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.AS,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    //TEST SUR LA CARTE DAME

    @Test
    public void test_Que_La_Carte_Dame_Est_Inferieur_A_La_Carte_Roi(){
        Carte t7 = new Carte(Valeur.DAME,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.ROI,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }

    @Test
    public void test_Que_La_Carte_Dame_Est_Inferieur_A_La_Carte_As(){
        Carte t7 = new Carte(Valeur.DAME,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.AS,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }


    // TEST SUR LE ROI

    @Test
    public void test_Que_La_Carte_Roi_Est_Inferieur_A_La_Carte_As(){
        Carte t7 = new Carte(Valeur.ROI,Couleur.TREFLE);
        Carte t8 = new Carte(Valeur.AS,Couleur.TREFLE);
        Assert.assertFalse(t7.estPlusFortQue(t8));
    }
}