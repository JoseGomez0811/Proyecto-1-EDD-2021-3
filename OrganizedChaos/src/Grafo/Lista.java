
package Grafo;

import Clases.Almacen;
import Clases.Ruta;
import javax.swing.JOptionPane;

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
    public void insertarAlmacen(Almacen almacen){
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
     * se encarga de insertar una ruta a la lista de rutas
     * @param ruta 
     */
    public void insertarRuta(Ruta ruta){
        Nodo nuevo= new Nodo(ruta);
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
    * se encarga de eliminar un objecto de la lista de almacenes
    * @param referencia 
    */
    public void removerPorReferencia(String referencia){
        if (buscar(referencia)!=null) {
            if (pFirst.getAlmacen().getId().equals( referencia)) {
                pFirst = pFirst.getpNext();
            } else{
                Nodo aux = pFirst;
                while(!aux.getpNext().getAlmacen().getId().equals(referencia)){
                    aux = aux.getpNext();
                }
                Nodo siguiente = aux.getpNext().getpNext();
                aux.setpNext(siguiente);  
            }
            size--;
        }
    }
       
      /**
       * Elimina un objeto de la lista de rutas 
       * @param referencia 
       */
    public void removerRuta(String referencia){
        if (buscarRuta(referencia)!=null) {
            if (pFirst.getRuta().getSalida().getId().equals( referencia)) {
                pFirst = pFirst.getpNext();
            } else{
                Nodo aux = pFirst;
                while(!aux.getpNext().getRuta().getSalida().getId().equals(referencia)){
                    aux = aux.getpNext();
                }
                Nodo siguiente = aux.getpNext().getpNext();
                aux.setpNext(siguiente);  
            }
            size--;
        }
    }
            
       /**
        * Se encarga de imprimir la lista de almacenes
        */         
     public void imprimir(){
        String mostrar="";
        if(!isVacio()){
            Nodo aux = pFirst;
            for (int i = 0; i < size; i++) {
                mostrar+=aux.getAlmacen().getId()+"\n";
                //System.out.print(aux.getDato()+ "\n ");
                aux = aux.getpNext();
            }
            JOptionPane.showMessageDialog(null,mostrar );
        } else{
            System.out.println("Lista vacia");
        }
    }
                
    /**
     * Se encarga de imprimir la lista de rutas
     */            
     public void imprimirRuta(){
        String mostrar="";
        if(!isVacio()){
            Nodo aux = pFirst;
            for (int i = 0; i < size; i++) {
                mostrar+=aux.getRuta().getSalida().getId()+", "+ aux.getRuta().getLlegada().getId()+ ", "+ aux.getRuta().getPeso() +"\n";
                
                aux = aux.getpNext();
            }
            JOptionPane.showMessageDialog(null,mostrar );
        } else{
            System.out.println("Lista vacia");
        }
    }
               
     /**
      * se encarga de buscar un almacen en la lista 
      * @param id
      * @return el nodo en donde esta guardado el dato id
      */          
    public Nodo buscar(String id){
        Nodo aux;
        for (aux = pFirst; aux !=null  ; aux=aux.getpNext()) {
            if(id.equals(aux.getAlmacen().getId())){
                return aux;
            }
        }
        return null;
    }   

/**
 * Se encarga de buscar una ruta en la lista
 * @param id
 * @return un nodo que tiene una de las rutas del almacen
 */    
    public Nodo buscarRuta(String id){
        Nodo aux;
        for (aux = pFirst; aux !=null  ; aux=aux.getpNext()) {
            if(id.equals(aux.getRuta().getSalida().getId())){
                return aux;
            }
        }
        return null;
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
                
    
    
        
            
                
               
                
                
                
            
        
        
   
    
    
    
        
        
        
        
        
        
    
    
