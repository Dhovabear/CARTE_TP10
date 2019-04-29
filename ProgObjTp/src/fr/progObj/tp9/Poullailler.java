package fr.progObj.tp9;

import java.util.ArrayList;
import java.util.List;

public class Poullailler {
    private List<Volaille> volailles;

    public Poullailler() {
        this.volailles = new ArrayList<Volaille>();
    }

    public void addVolaille(Volaille v){
        this.volailles.add(v);
    }

    public Volaille findVolaille(int id){
        for ( Volaille v: volailles) {
            if(v.getId() == id){
                return v;
            }
        }
        return null;
    }

    public List<Volaille> volailleAAbattre(){
        List<Volaille> l = new ArrayList<Volaille>();
        for (Volaille v: volailles) {
            if(v.getPoids() >= Poulet.getPoidsAbattage() && v instanceof Poulet){
                System.out.println(v.getId() + " poids: "  + v.getPoids());
                l.add(v);
            }else if(v.getPoids() >= Canard.getPoidsAbattage() && v instanceof Canard){
                System.out.println(v.getId() + " poids: "  + v.getPoids());
                l.add(v);
            }
        }
        return l;
    }

}
