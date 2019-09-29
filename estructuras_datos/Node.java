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
public class Node {
    private String nombre;
    private int posX, posY, W, H;
    private JComponent comp;
    public Node next;

    /**
     * Constructor de la clase
     * @param nombre Nombre del componente con el que sera referenciado
     * @param posX Posicion en X del componente
     * @param posY Posicion en Y del componente
     * @param W Ancho del componente
     * @param H Largo del componente
     * @param comp Tipo de componente
     */
    public Node(String nombre, int posX, int posY, int W, int H, JComponent comp) {
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
        this.W = W;
        this.H = H;
        this.comp = comp;
        this.next = null;
    }

    /**
     * Metodo para obtener el nombre del componente guardado en un nodo especifico
     * @return Retorna el nombre del componente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para insertar el nombre a algun componente de la lista
     * @param nombre Nombre que sera insertado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener la posicion en X del componente guardado en un nodo especifico
     * @return Retorna la posicion en X del componente
     */
    public int getPosX() {
        return posX;
    }

    /**
     * Metodo para insertar la posicion en X a algun componente de la lista
     * @param posX Posicion en X que sera insertado
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }
    
    /**
     * Metodo para obtener la posicion en Y del componente guardado en un nodo especifico
     * @return Retorna la posicion en Y del componente
     */
    public int getPosY() {
        return posY;
    }

    /**
     * Metodo para insertar la posicion en Y a algun componente de la lista
     * @param posY Posicion en Y que sera insertado
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }

    /**
     * Metodo para obtener el ancho del componente guardado en un nodo especifico
     * @return Retorna el ancho del componente
     */
    public int getW() {
        return W;
    }

    /**
     * Metodo para insertar el ancho a algun componente de la lista
     * @param W Ancho que sera insertado
     */
    public void setW(int W) {
        this.W = W;
    }

    /**
     * Metodo para obtener el largo del componente guardado en un nodo especifico
     * @return Retorna el largo del componente
     */
    public int getH() {
        return H;
    }

    /**
     * Metodo para insertar el largo a algun componente de la lista
     * @param H Largo que sera insertado
     */
    public void setH(int H) {
        this.H = H;
    }

    /**
     * Metodo para obtener el componente guardado en un nodo especifico
     * @return Retorna el componente
     */
    public JComponent getComp() {
        return comp;
    }

    /**
     * Metodo para insertar el componente de la lista
     * @param comp Componente que sera insertado
     */
    public void setComp(JComponent comp) {
        this.comp = comp;
    }
    
    /**
     * Metodo para obtener el nodo siguiente del nodo actual
     * @return Retorna el siguiente del nodo actual
     */
    public Node getNext() {
        return this.next;
    }

    /**
     * Metodo para insertar el siguiente del nodo actual
     * @param BNode Nodo siguiente al actual
     */
    public void setNext(Node BNode) {
        this.next = BNode;
    }
}
