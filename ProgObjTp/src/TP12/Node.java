package TP12;

public class Node {

    private String m_name;

    public Node(String nom){
        this.m_name = nom;
    }

    @Override
    public String toString() {
        return m_name;
    }

    public boolean named(String name) {
        return name.equals(m_name);
    }

    public String getName() {
        return m_name;
    }
}
