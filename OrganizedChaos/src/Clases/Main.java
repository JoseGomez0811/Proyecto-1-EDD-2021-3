/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.ventanaPrincipal;

/**
 *
 * @author José Gómez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
        *Se llama a la clase ventanaPrincipal 
        **/
        ventanaPrincipal venprin = new ventanaPrincipal();
        /**
        *Se hace visible la ventana principal del programa
        **/
        venprin.setVisible(true);
    }
    
}
