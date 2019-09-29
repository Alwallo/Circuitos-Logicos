/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_datos;

import javax.swing.JComponent;

/**
 *
 * @author alvgo
 */
public class LinkedList {
    private Node head;
    private int size;
    
    /**
     * Se crea el constructor de la clase, inicializando los atributos
     */
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    /**
     * Metodo para verificar si la lista esta vacia
     * @return Retorna true si la lista esta vacia, false si no
     */
    public boolean isEmpty() {
        return this.head == null;
    }
    
    /**
     * Metodo para conocer la longitud de la lista
     * @return Retorna la longitud de la lista
     */
    public int size() {
        return this.size;
    }
    
    /**
     * Metodo para agregar nodos a la lista
     * @param nombre Nombre del componente con el que sera referenciado
     * @param posX Posicion en X del componente
     * @param posY Posicion en Y del componente
     * @param W Ancho del componente
     * @param H Largo del componente
     * @param comp Tipo de componente
     */
    public void insertFirst(String nombre, int posX, int posY, int W, int H, JComponent comp) {
        Node newBNode = new Node(nombre, posX, posY, W, H, comp);
        newBNode.next = this.head;
        this.head = newBNode;
        this.size++;
    }
    
    /**
     * Metodo para borrar el primer nodo de la lista
     * @return Retorna el nodo borrado
     */
    public Node deleteFirst() {
        if (this.head != null) {
            Node temp = this.head;
            this.head = this.head.next;
            this.size--;
            return temp;
        } else {
            return null;
        }
    }
    
    public void displayList() {
        Node current = this.head;
        while (current != null) {
            current = current.getNext();
        }
    }
    
    /**
     * Metodo para buscar un componente
     * @param searchValue Nombre del componente que sera buscado
     * @return Retorna el nodo en busqueda si se encuentra
     */
    public Node find(String searchValue) {
        Node current = this.head;
        while (current != null) {
            if (current.getNombre().equals(searchValue)) {
                return current;
            } else {
                current = current.getNext();
            }
        }
        return null;
    }
    
    /**
     * Metodo para borrar un nodo de la lista especifico
     * @param searchValue Nombre del componente que sera borrado
     * @return Retorna el nodo borrado
     */
    public Node delete(String searchValue) {
        Node current = this.head;
        Node previous = this.head;

        while (current != null) {
            if (current.getNombre().equals(searchValue)) {
                if (current == this.head) {
                    this.head = this.head.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                return current;
            } else {
                previous = current;
                current = current.getNext();
            }
        }
        return null;
    }
    
    /**
     * Metodo para obtener el primer nodo de la lista
     * @return Retorna el primer nodo
     */
    public Node getHead(){
        return this.head;
    }
}
