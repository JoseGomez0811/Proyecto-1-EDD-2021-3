
package Clases;

import Grafo.Lista;

/**
 *Clase Almacen
 * Contiene la informacion del almacen
 * @author raco1
 */
public class Almacen {
    //Atributos
    /**
     * id del almacen
     */
    private String id;
    /**
     * Lista de productos
     */
    private Lista stock;
    /**
     * cantidad de productos
     */
    private int cantStock;
    
    // Constructor
    
    /**
     * Contructor con 2 parametros
     * @param id
     * @param stock 
     */
    
    public Almacen(String id, Lista stock){
        this.id=id;
        this.stock=stock;
        this.cantStock=stock.getSize();
        
    }

    /**
     * @return the cantStock
     */
    public int getCantStock() {
        return cantStock;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the stock
     */
    public Lista getStock() {
        return stock;
    }

    /**
     * @param cantStock the cantStock to set
     */
    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(Lista stock) {
        this.stock = stock;
    }
    
}
