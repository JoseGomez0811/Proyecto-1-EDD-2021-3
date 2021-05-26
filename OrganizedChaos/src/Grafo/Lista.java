
package Grafo;

import Clases.Almacen;

/**
 *Clase Lista
 * Se utiliza para guardar un conjunto de datos
 * @author raco1
 */
public class Lista {
    
    private Nodo pFirst;
    private Nodo pLast;
    private int size;
    
    
    public Lista(){
        this.pFirst=null;
        this.pLast=null;
        this.size=0;
                
        
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @return the pFirst
     */
    public Nodo getpFirst() {
        return pFirst;
    }

    /**
     * @return the pLast
     */
    public Nodo getpLast() {
        return pLast;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Nodo pLast) {
        this.pLast = pLast;
    }
    
    /**
     * Determina si la lista esta vacia
     * @return Retorna un boolean que indica el estado de la lista
     */
    public boolean isVacio(){
        return pFirst==null;
    }
    
    /**
     * Agrega un elemento al final de la lista 
     * @param almacen 
     */
    public void insertarUltimo(Almacen almacen){
        Nodo nuevo= new Nodo(almacen);
        if(isVacio()){
            pFirst=nuevo;
            pLast=nuevo;
        }else{
            Nodo aux = pLast;
            aux.setpNext(nuevo);
            pLast=nuevo;
        }
        size+=1;
    }
            
        
    /**
     * Busca el elemento de la lista indicado por indice
     * @param pos
     * @return Retorna el almacen que se pide
     */
    public Almacen getAlmacen(int pos){
        if(!isVacio()&& pos<=size ){
            Nodo aux=pFirst;
            for (int i = 0; i < pos; i++) {
                aux=aux.getpNext();
            }
            return (Almacen) aux.getAlmacen();
        }else{
            return null;
        }
        
        
    }
        
        
        
        
        
        
        
    
    
}
