package fr.progObj.tp1;

import java.util.List;

public class Entreprise {

    private List<Employe> m_employes;
    private String m_nom;


    public Entreprise(String nom) {
        m_nom = nom;
    }

    public int sommeSalaireAVerser(){
        int somme = 0;
        for (Employe e: m_employes) {
            somme += e.calculerSalaire();
        }
        return somme;
    }

    public void afficherPersonel(){
        System.out.print("\nEmployes de " + m_nom + ": ");
        for (Employe e : m_employes) {
            System.out.println(e);
        }
    }

    public void afficherResponsables(){
        System.out.print("\nResponsables de " + m_nom + ": ");
        for (Employe e : m_employes) {
            if(e instanceof Responsable)
                System.out.println(e);
        }
    }

    public void recruterEmploye(Employe e){
        m_employes.add(e);
    }

    public Responsable findSupremeLeader(){
        for (Employe e: m_employes) {
            if(e instanceof Responsable){
                boolean findHimself = false;
                Responsable r = (Responsable)e;
                for ( Employe e2: m_employes) {
                    if( e2 instanceof Responsable){
                        for (Employe ssf: ((Responsable) e2).getM_sousFifres()) {
                            if(r.getM_matricule() == ssf.getM_matricule()){
                                findHimself = true;
                                break;
                            }
                        }
                    }
                    if(findHimself){break;}
                }
                if(!findHimself){
                    return r;
                }
            }
        }
        return null;
    }

    public void afficherHierarchy(){
        findSupremeLeader().printAllSousFifres();
    }

    public void replaceEmploye(int i , Employe e){
        m_employes.set(i,e);
    }



}
