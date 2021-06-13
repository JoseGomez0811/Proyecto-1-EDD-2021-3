
package Grafo;

import Clases.Almacen;
import Clases.Producto;
import Clases.Ruta;

/**
 *Clase Nodo
 * Guarda la direccion de un almacen 
 * @author raco1
 */
public class Nodo {
    
    private Almacen almacen;
    private Producto pro; 
    private Ruta ruta;
    private Nodo pNext;
    
    
    public Nodo(Almacen almacen){
        this.almacen=almacen;
        this.pNext=null;
    }
    public Nodo(Producto pro){
        this.pro=pro;
        this.pNext=null;
    }
    public Nodo(Ruta ruta) {
        this.ruta = ruta;
        this.pNext=null;
    }
    

    /**
     * @return the almacen
     */
    public Almacen getAlmacen() {
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

    /**
     * @return the producto
     */
    public Ruta getRuta() {
        return ruta;
    }

    /**
     * @param producto the producto to set
     */
    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    /**
     * @return the pro
     */
    public Producto getPro() {
        return pro;
    }

    /**
     * @param pro the pro to set
     */
    public void setPro(Producto pro) {
        this.pro = pro;
    }
    
    
}
