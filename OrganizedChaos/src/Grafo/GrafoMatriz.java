
package Grafo;

import Clases.Almacen;
import javax.swing.JOptionPane;
/**
 *Clase GrafoMatriz
 * 
 * Contiene la matriz de adyacencia
 * 
 * @author raco1
 */
public class GrafoMatriz {
    //Atributos
    
    /**
     * Lista de almacenes
     */
    private final Lista almacenes;
    /**
     * array de arcos (probablemente se vaya a cambiar )
     */
    private String[] arcos;
    /**
     * arreglo bidimensional
     */
    private final int [][] matriz;
    /**
     * Cantidad de almacenes
     */
    private final int sizeAlm;
    
    // Constructores
    /**
     * Constructor con 2 parametros
     * @param almacenes
     * @param arcos 
     */
    public GrafoMatriz(Lista almacenes, String[] arcos ){
        this.almacenes=almacenes;
        this.arcos=arcos;
        this.sizeAlm=almacenes.getSize();
        matriz = new int [sizeAlm][sizeAlm];
        for (int i = 0; i < sizeAlm; i++){
            for (int j = 0; i < sizeAlm; i++){
                matriz[i][j] = 0;
            }
        }
    }
    
    //Metodos
    
    /**
     * Se encarga de llenar la matriz con la distancia de los caminos entre los grafos
     */
    public void llenarMatriz(){
        String inicio;
        String fina;
        int peso;
        int numAl=0;
        int numIl=0;
        
        for (String arco: arcos ) {
            String[] cadena= arco.split(",");
            inicio=cadena[0].toUpperCase();
            fina=cadena[1].toUpperCase();
            peso=Integer.parseInt(cadena[2]);
            for (int i = 0; i < almacenes.getSize(); i++) {
                String id= almacenes.getAlmacen(i).getId();
                if(inicio.equals(id)){
                    numAl=i;
                }
            }
            for (int k = 0; k < almacenes.getSize(); k++) {
                String id=almacenes.getAlmacen(k).getId();
                if(fina.equals(id)){
                    numIl=k;
                }
            }
            matriz[numAl][numIl]=peso;
        }
    }
        
    /**
     * Imprime la matriz de adyacencia (Esta aqui temporalmente)
     */
    public void imprimirGrafo(){
        System.out.print(" ");
        for(int i = 0; i < sizeAlm; i++)
        {
                System.out.printf( almacenes.getAlmacen(i).getId()+"     "  );
        }
        System.out.println();
        for( int i = 0; i < sizeAlm; i++){
                System.out.printf( almacenes.getAlmacen(i).getId());
                for(int j = 0; j < sizeAlm; j++){
                        System.out.printf(" %3d" ,matriz[i][j]);
                }
                System.out.println();
        }
 }
    
    /**
     * Asigna un nuevo arco 
     * @param a
     * @param b
     * @param peso 
     */
    private void addArco(String a, String b, String peso){
        String arco= a+","+b+","+peso;
        String[] cadena= new String[arcos.length+1];
        for (int i = 0; i < arcos.length; i++) {
            cadena[i]=arcos[i];
        }
        cadena[arcos.length+1]=arco;
        arcos=cadena;
        
    }
    
    
    /**
     * Agrega un nuevo almacen al grafo
     * @param id
     * @param stock 
     */
    public void addAlmacen(String id, Lista stock){
      Almacen nuevo= new Almacen(id, stock);
      almacenes.insertarUltimo(nuevo);
      int prueba=0;
      while(prueba<2){
            String s = JOptionPane.showInputDialog(null,
                   "Ingrese el destino de la ruta: ",
                   "Nuevo almacen",
                   JOptionPane.INFORMATION_MESSAGE);
            String peso= JOptionPane.showInputDialog(null,
                   "Ingrese la distancia: ",
                   "Nuevo almacen",
                   JOptionPane.INFORMATION_MESSAGE);
           this.addArco(id, s, peso);
           prueba++;
      }
      
      
      
  }   
}
        
        