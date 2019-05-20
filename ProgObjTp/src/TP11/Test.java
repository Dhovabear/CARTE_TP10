package TP11;

import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TerrainConstructible t = new TerrainConstructible("Terrain",100f);
        Maison m1 = new Maison("3 rue de la fesse",16.0f,1,"éléctrique");
        Maison m2 = new Maison("4 rue du fion",9.0f,1,"Gaz");
        Immeuble i1 = new Immeuble("1 rue de planoise",50.0f,10,5);

        t.construireHabitation(m1);
        t.construireHabitation(m2);
        t.construireHabitation(i1);


        t.getHabitations().sort(new SurfaceComparator()); // pour trier par surface

        t.getHabitations().sort(new LexicoComparator()); //Pour trier par ordre alphabétique

        System.out.println(t);
        System.out.print("\nEntrez l'adresse d'une habitation a supprimer: ");

        String tmp = "";
        boolean ok = false;

        do {
            tmp = in.nextLine();
            for (Habitation h: t.getHabitations()) {
                if(tmp.equals(h.getAdresse())){
                    ok = true;
                    break;
                }
            }

            if(!ok){
                System.out.print("Veuillez entrer une adresse valide !: ");
            }

        }while (!ok);
        t.detruireHabitation(tmp);

        System.out.print("\n" + t);
    }


}
