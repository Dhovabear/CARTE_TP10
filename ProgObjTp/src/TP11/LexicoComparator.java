package TP11;

import java.util.Comparator;

public class LexicoComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(!(o1 instanceof Habitation) || !(o2 instanceof Habitation)){
            return -666;
        }
        Habitation h1 = (Habitation)o1;
        Habitation h2 = (Habitation)o2;
        return h1.getAdresse().compareTo(h2.getAdresse());
    }
}
