package TP12;

public class Edge {
    private Node m_n1;
    private Node m_n2;

    public Edge(Node n1 , Node n2){
        this.m_n1 = n1;
        this.m_n2 = n2;
    }


    @Override
    public String toString() {
        return "("+m_n1.toString()+","+m_n2.toString()+")";
    }

    public boolean linkedTo(String nodeName) {
        return m_n1.named(nodeName) || m_n2.named(nodeName);
    }
}
