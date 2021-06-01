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


//Constructor-----------------------------------------------------
    public Lista() {
        pFirst = null;
        pLast = null;
    }
    
//Funciones y metodos--------------------------------------------------------
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
  
    public void mostrarLista(){
        pNow = pFirst;
        while (pNow != null){
            JOptionPane.showMessageDialog(null, pNow.dato);
            pNow = pNow.pNext;
        }
    }
}
