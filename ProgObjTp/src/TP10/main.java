package TP10;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        Paquet tp = Paquet.genererPaquetDe32Cartes();
        System.out.println(tp);

        for (int i = 0 ; i <  15 ; i++){
            tp.melanger();
            System.out.println(tp);
        }

    }
}
