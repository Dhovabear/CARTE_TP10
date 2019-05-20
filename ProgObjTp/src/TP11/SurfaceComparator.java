package TP11;

import java.util.Comparator;

public class SurfaceComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(!(o1 instanceof Habitation) || !(o2 instanceof Habitation) ){
            return -666;
        }
        Habitation h1 = (Habitation) o1;
        Habitation h2 = (Habitation) o2;

        if(h1.getSuperficie() == h2.getSuperficie()){
            return 0;
        }else if(h1.getSuperficie() > h2.getSuperficie()){
            return 1;
        }else{
            return -1;
        }
    }
}
