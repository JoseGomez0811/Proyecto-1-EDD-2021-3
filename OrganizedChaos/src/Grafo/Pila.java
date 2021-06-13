package Grafo;

import Clases.Almacen;
import javax.swing.JOptionPane;


/**
 *
 * @author raco1
 */
public class Pila {
    
        int tamPila;
        int cima;
        
        Almacen []listaPila;
        
        public Pila(){
            this.cima=0;
            this.tamPila=0;
            listaPila= new Almacen[tamPila]; 
        }
        
        
        public void insertar(Almacen alm){
            listaPila[cima]=alm;
            cima++;
        }
        
        public Almacen eliminar(){
            Almacen eliminar=null;
            if(cima==0){
                JOptionPane.showMessageDialog(null, "La pila esta vacia");
            }else{
                eliminar=listaPila[cima];
                cima--;
            }
            return eliminar;
        }
        public boolean vacio(){
            return cima==0;
        }
        
            
             
        
        
}
