
package Grafo;

import Clases.Almacen;

/**
 *
 * @author raco1
 */
public class Nodo {
    
    private Almacen almacen;
    private Nodo pNext;
    
    public Nodo(Almacen almacen){
        this.almacen=almacen;
        this.pNext=null;
    }

    /**
     * @return the almacen
     */
    public Object getAlmacen() {
        return almacen;
    }

    /**
     * @return the pNext
     */
    public Nodo getpNext() {
        return pNext;
    }

    /**
     * @param almacen the almacen to set
     */
    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }
    
    
}
