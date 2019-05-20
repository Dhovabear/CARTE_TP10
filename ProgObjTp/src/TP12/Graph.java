package TP12;

import java.util.ArrayList;

public class Graph {
    private ArrayList<Node> m_nodes;
    private ArrayList<Edge> m_edges;

    public Graph(){
        this.m_nodes = new ArrayList<Node>();
        this.m_edges = new ArrayList<Edge>();
    }

    public void addNode(String nodeName){
        if(getNodeByName(nodeName) != null){
            System.err.println("Un noeud portant ce nom existe déja !");
            return;
        }

        this.m_nodes.add(new Node(nodeName));
    }

    public void addEdge(String nameN1 , String nameN2){
        Node n1 = getNodeByName(nameN1);
        Node n2 = getNodeByName(nameN2);

        if(n1 == null || n2 == null ){
            System.err.println("Un des noeuds n'existe pas !");
            return;
        }

        m_edges.add(new Edge(n1,n2));
    }



    private Node getNodeByName(String name){
        for (Node n: m_nodes) {
            if(n.named(name)){return n;}
        }
        return null;
    }

    public ArrayList<Edge> getEdgesLinkedTo(String nodeName){
        Node n = getNodeByName(nodeName);
        ArrayList<Edge> edglist = new ArrayList<Edge>();
         for ( Edge e: m_edges) {
             if(e.linkedTo(nodeName)){edglist.add(e);}
         }
         return edglist;
    }


    public ArrayList<Edge> getEdges() {
        return m_edges;
    }

    public ArrayList<Node> getNodes() {
        return m_nodes;
    }

    @Override
    public String toString() {
        StringBuilder tmp = new StringBuilder("nodes: [");
        for ( Node n: m_nodes) {
            tmp.append(n.toString()).append(",");
        }

        tmp.deleteCharAt(tmp.length()-1);

        tmp.append("]\nedges: [");

        for (Edge a: m_edges) {
            tmp.append(a.toString()).append(",");
        }

        tmp.deleteCharAt(tmp.length()-1);

        tmp.append("]");
        return tmp.toString();
    }
}
