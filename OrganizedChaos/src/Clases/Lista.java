/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author José Gómez
 */
public class Lista {
    Nodo pFirst;
    Nodo pLast;
    public Nodo pNow;


    /**
    *Método constructor de la clasde Lista 
    **/
    public Lista() {
        pFirst = null;
        pLast = null;
    }
    
    /**
    *Método que agrega un nuevo elemento a la lista
    * @param dato El parámetro dato define los nombre de los productos que serán agregado a la lista
    **/
    public void ingresarNodo(Object dato){
        Nodo pNew = new Nodo(dato);
        
        
        if (pFirst == null){
            pFirst = pNew;
            pFirst.pNext = null;
            pLast = pNew;    
        }else{
            pLast.pNext = pNew;
            pNew.pNext = null;
            pLast = pNew;
        }
    }
    
    /**
    *Método que muestra la lista
    **/
    public void mostrarLista(){
        pNow = pFirst;
        while (pNow != null){
            JOptionPane.showMessageDialog(null, pNow.dato);
            pNow = pNow.pNext;
        }
    }
}
