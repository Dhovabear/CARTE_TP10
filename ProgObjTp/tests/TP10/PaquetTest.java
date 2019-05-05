package TP10;

import org.junit.Assert;
import org.junit.Test;

public class PaquetTest {


    @Test
    public void tirerCarteAuDessus() {
        Carte tc = new Carte(Valeur.ROI, Couleur.PIQUE);
        Carte tc2 = new Carte(Valeur.ROI, Couleur.COEUR);

        Paquet testP = new Paquet();

        testP.ajouterAuDessus(tc2);
        testP.ajouterAuDessus(tc);

        Assert.assertEquals(tc , testP.piocher());
    }



}