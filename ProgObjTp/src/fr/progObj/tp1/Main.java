package fr.progObj.tp1;

public class Main {

    public static void main(String[] args){
        Entreprise dab = new Entreprise("DabEntertainment");

        Responsable pdg = new Responsable("Ussan Bolt " , 10);
            Responsable cmdir = new Responsable("ludo Mulin",2);
                cmdir.addSousFifre(new Commerciaux("Marc",1));
                cmdir.addSousFifre(new Commerciaux("Michel",1));
                cmdir.addSousFifre(new Commerciaux("Paul",1));
            Responsable tecdir = new Responsable("MII", 2);
                tecdir.addSousFifre(new Employe("Patrick",1));
                tecdir.addSousFifre(new Employe("Justin", 1));
                tecdir.addSousFifre(new Employe("Bridou",1));

         pdg.addSousFifre(cmdir);
         pdg.addSousFifre(tecdir);





    }

}
