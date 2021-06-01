/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author José Gómez
 */
public class Nodo {
    public Object dato;
    Nodo pNext;
    
    public Nodo(Object dato) {
        this.dato = dato;
        pNext= null;
    }
}
