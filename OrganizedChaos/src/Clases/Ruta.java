
package Clases;

/**
 *
 * @author raco1
 */
public class Ruta {
    private Almacen salida;
    private Almacen llegada;
    private int peso;

    public Ruta(Almacen salida, Almacen llegada, int peso) {
        this.salida = salida;
        this.llegada = llegada;
        this.peso = peso;
    }

    /**
     * @return the llegada
     */
    public Almacen getLlegada() {
        return llegada;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @return the salida
     */
    public Almacen getSalida() {
        return salida;
    }

    /**
     * @param llegada the llegada to set
     */
    public void setLlegada(Almacen llegada) {
        this.llegada = llegada;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @param salida the salida to set
     */
    public void setSalida(Almacen salida) {
        this.salida = salida;
    }
    
    
}
