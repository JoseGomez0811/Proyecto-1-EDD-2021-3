
package Clases;

import Grafo.GrafoMatriz;
import Grafo.Lista;

/**
 *
 * @author raco1
 */
public class MainPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista productos= new Lista();
        Lista almacenes= new Lista();
        Almacen primer= new Almacen("A",productos ); 
        Almacen segundo= new Almacen("B",productos );
        Almacen tercero= new Almacen("C", productos);
        Almacen cuarto= new Almacen("D", productos);
        
        almacenes.insertarUltimo(primer);
        almacenes.insertarUltimo(segundo);
        almacenes.insertarUltimo(tercero);
        almacenes.insertarUltimo(cuarto);
        String[] arcos= {"A,B,23","A,C,10","B,D,20","B,C,4","C,A,14","C,D,15","D,A,21","D,C,13" };
        
        GrafoMatriz grafo= new GrafoMatriz(almacenes,arcos);
        
        grafo.imprimirGrafo();
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
        grafo.llenarMatriz();
        grafo.imprimirGrafo();
        System.out.println("Esta es la buena ");
        grafo.addAlmacen("E", productos);
        grafo.imprimirGrafo();
        
    }
    
}
