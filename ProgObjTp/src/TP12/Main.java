package TP12;

public class Main {
    public static void main(String[] args){
        Graph g = new Graph();
        g.addNode("FUCK");
        g.addNode("THAT");
        g.addNode("SHIT");

        g.addEdge("FUCK","THAT");
        g.addEdge("THAT","SHIT");

        System.out.print(g);
    }
}
