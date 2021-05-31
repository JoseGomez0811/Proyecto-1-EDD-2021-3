
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
        
        almacenes.insertarAlmacen(primer);
        almacenes.insertarAlmacen(segundo);
        almacenes.insertarAlmacen(tercero);
        almacenes.insertarAlmacen(cuarto);
        
        Ruta ab= new Ruta(primer,segundo,23);
        Ruta ac= new Ruta(primer,tercero,25);
        Ruta bc= new Ruta(segundo,tercero,35);
        Ruta ba= new Ruta(segundo,primer,30);
        Ruta ca= new Ruta(tercero,primer,30);
        Ruta cd= new Ruta(tercero,cuarto,40);
        Ruta da= new Ruta(cuarto,primer,50);
        Ruta db= new Ruta(cuarto,segundo,60);
        
        Lista arcos= new Lista();
        arcos.insertarRuta(ab);
        arcos.insertarRuta(ac);
        arcos.insertarRuta(bc);
        arcos.insertarRuta(ba);
        arcos.insertarRuta(ca);
        arcos.insertarRuta(cd);
        arcos.insertarRuta(da);
        arcos.insertarRuta(db);
        
        GrafoMatriz grafo= new GrafoMatriz(almacenes,arcos);
        grafo.generarM();
        grafo.imprimirGrafo();
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
        grafo.llenarMatriz();
        grafo.imprimirGrafo();
        System.out.println("Esta es la buena ");
        grafo.addAlmacen("E", productos);
        grafo.imprimirGrafo();
        almacenes.eliminar("b");
        almacenes.imprimir();
    }
    
}
