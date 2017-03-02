/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

/**
 *
 * @author alex
 */
public class node {

    private Object node;
    private int priority;

    public node(Object name, int tamaño) {
        this.node = name;
        this.priority = tamaño;
    }

    public Object getNode() {
        return node;
    }

    public void setNode(Object node) {
        this.node = node;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    

    @Override
    public String toString() {
        return node + "-" + priority;
    }
}

