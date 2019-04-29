package fr.progObj.tp1;

import java.util.List;

public class Responsable extends Employe {

    private List<Employe> m_sousFifres;

    public Responsable(String nom, int indiceSalarial) {
        super(nom, indiceSalarial);
    }

    public void printSousFifres(){
        System.out.print("\n Liste des sous fifres: ");
        for ( Employe e : m_sousFifres) {
            System.out.println(e);
        }
    }

    public void printAllSousFifres(){
        for ( Employe e : m_sousFifres) {
            System.out.println(e);
            if(e instanceof Responsable){
                ((Responsable) e).printAllSousFifres();
            }
        }
    }


    public void addSousFifre(Employe e){
        m_sousFifres.add(e);
    }

    public List<Employe> getM_sousFifres() {
        return m_sousFifres;
    }
}
