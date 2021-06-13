
package Grafo;

import Clases.Almacen;

/**
 *
 * @author raco1
 */
public class RecorrerGrafo {
    public static Almacen[] recorrerProf(GrafoMatriz g, String id) {
        Almacen w, v;
        Pila pila= new Pila();
        Almacen[]m;
        m= new Almacen[g.getSizeAlm()];
        v=g.getAlmacenes().buscar(id).getAlmacen();
        v.getStock().imprimirProducto();
        return m;
    }
    public static Almacen[]recorrerAnch(GrafoMatriz g){
        Lista v;
        Almacen[] d;
        d=new Almacen[g.getSizeAlm()]; 
        v=g.getAlmacenes();
        Almacen aux;
        for (int i = 0; i < 10; i++) {
            aux=v.getAlmacen(i);
            aux.getStock().imprimirProducto();
        }
        return d;
        
        
    }
    
    
}
