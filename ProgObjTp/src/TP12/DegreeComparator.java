package TP12;

import java.util.Comparator;

public class DegreeComparator implements Comparator {

    private Graph m_graph;

    public DegreeComparator(Graph g){
        this.m_graph = g;
    }

    @Override
    public int compare(Object o1, Object o2) {
        if(!(o1 instanceof Node) || !(o2 instanceof Node))
            return -1;
        int n1 = m_graph.getEdgesLinkedTo(((Node)o1).getName()).size();
        int n2 = m_graph.getEdgesLinkedTo(((Node)o2).getName()).size();

        if(n1 == n2){
            return 0;
        }else if(n1 > n2){
            return 1;
        }else{
            return -1;
        }
    }
}
