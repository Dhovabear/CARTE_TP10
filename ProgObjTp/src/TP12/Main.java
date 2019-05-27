package TP12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Graph g = new Graph();
        g.addNode("1");
        g.addNode("2");
        g.addNode("3");
        g.addNode("4");
        g.addNode("5");
        g.addNode("6");
        g.addNode("7");
        g.addNode("8");

        g.addEdge("1","2");
        g.addEdge("2","3");
        g.addEdge("3","4");
        g.addEdge("4","1");

        g.addEdge("5","6");
        g.addEdge("6","7");
        g.addEdge("7","8");
        g.addEdge("8","5");

        g.addEdge("1","5");
        g.addEdge("2","6");
        g.addEdge("3","7");
        g.addEdge("4","8");

        Graph g2 = new Graph();

        ArrayList<Node> bestNodesFirst = (ArrayList<Node>) g.getNodes().clone();
        bestNodesFirst.sort(new DegreeComparator(g));

        while (g.getEdges().size() > 0){

        }

        System.out.print(g);
    }
}
