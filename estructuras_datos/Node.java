/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_datos;

/**
 *
 * @author alvgo
 */
public class Node {
    private Object data;
    public Node next;

    public Node(Object data) {
        this.next = null;
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public Node getNext() {
        return this.next;
    }

    public void setNext(Node BNode) {
        this.next = BNode;
    }
}
