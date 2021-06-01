
package Grafo;

import Clases.Almacen;
import Clases.Ruta;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
    private Lista arcos;
    /**
     * arreglo bidimensional
     */
    private  int [][] matriz;
    /**
     * Cantidad de almacenes
     */
    private int sizeAlm;
    
    // Constructores
    /**
     * Constructor con 2 parametros
     * @param almacenes
     * @param arcos 
     */
    public GrafoMatriz(Lista almacenes, Lista arcos ){
        this.almacenes=almacenes;
        this.arcos=arcos;
        this.sizeAlm=almacenes.getSize();
        
    }
    
    //Metodos
    /**
    Se encarga de iniciar la matriz
    */
    public void generarM(){
        int tam=sizeAlm;
        matriz = new int [tam][tam];
        for (int i = 0; i < sizeAlm; i++){
            for (int j = 0; i < sizeAlm; i++){
                matriz[i][j] = 0;
            }
        }
    }
    /**
     * Se encarga de llenar la matriz con la distancia de los caminos entre los grafos
     */
    public void llenarMatriz(){
        String inicio;
        String fina;
        int peso;
        int numAl=0;
        int numIl=0;
        try{
            
        for (Nodo arco=arcos.getpFirst(); arco!=null; arco=arco.getpNext()  ) {
            inicio=arco.getRuta().getSalida().getId().toUpperCase();
            fina=arco.getRuta().getLlegada().getId().toUpperCase();
            peso=arco.getRuta().getPeso();
            
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
        }catch (Exception err){
            JOptionPane.showMessageDialog(null, "Una lista esta vacia");
        }
    }
        
    /**
     * Imprime la matriz de adyacencia (Esta aqui temporalmente)
     */
    public void imprimirGrafo(){
        System.out.print(" ");
        for(int i = 0; i < sizeAlm; i++)
        {
                System.out.printf( almacenes.getAlmacen(i).getId()+"    "  );
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
     * @param salida
     * @param llegada
     * @param peso 
     */
    private void addArco(Almacen salida, Almacen llegada, int peso){
        //En construccion 
        try{
            if(almacenes.buscar(salida.getId())!=null && almacenes.buscar(llegada.getId())!=null ){
                 Ruta nueva= new Ruta(salida,llegada,peso);
                 arcos.insertarRuta(nueva);
            }else{
                JOptionPane.showMessageDialog(null, "El almacen no pertenece a la lista");
            }
        }catch(Exception error) {
            
        }
    }
    
    
    /**
     * Agrega un nuevo almacen al grafo
     * @param id
     * @param stock 
     */
    public void addAlmacen(String id, Lista stock){
        try{
            if(almacenes.buscar(id)==null){
                Almacen nuevo= new Almacen(id, stock);
                almacenes.insertarAlmacen(nuevo);
                sizeAlm++;
                while(true){
                    Almacen llegada=elegirAlm();
                    int peso=pedirPeso();
                    Almacen llegada2=elegirAlm();
                    int peso2=pedirPeso();
                    if (llegada!=null ){
                        if(peso!=0){
                            addArco(nuevo, llegada, peso);
                            addArco(nuevo, llegada2, peso2);
                            generarM();
                            llenarMatriz();
                            break;
                        }else{
                            JOptionPane.showMessageDialog(null, "No es un input correcto ");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Error al colocar el almacen ");
                    }
                }
                JOptionPane.showMessageDialog(null,"Se agrego un nuevo almacen");
            }else{
                JOptionPane.showMessageDialog(null,"Ese almacen ya existe");
            }
        }catch (Exception err){
            JOptionPane.showMessageDialog(null,"Ese almacen ya existe");
        }
      }
    
   /**
    * Se encarga de pedir un almacen de llegada para generar una nueva ruta
    * @return el almacen a donde queremos llegar
    */
     public Almacen elegirAlm(){
         try{
             
            String[] cadena = new String[almacenes.getSize()-1];
            int count=0;

            for(Nodo aux=almacenes.getpFirst();aux!=null; aux=aux.getpNext()){
                if(aux==almacenes.getpLast()){
                    count++;
                }else{
                   cadena[count]=aux.getAlmacen().getId();
                   count++;
                }
            }
            Icon icono = new ImageIcon(getClass().getResource("almacen.jpg"));
            String resp = (String) JOptionPane.showInputDialog(null, "Seleccione el almacen de llegada", "Almacen", JOptionPane.DEFAULT_OPTION,icono , cadena, cadena[0]);
            return almacenes.buscar(resp).getAlmacen();
                 
         }catch(Exception err){
             JOptionPane.showMessageDialog(null,"Error");
             return null;
         }
         
     }   
     
     /**
      * Se encarga de pedir el la distancia entre dos almacenes
      * @return la distancia entre los almacenes
      */
    public int pedirPeso(){
        String peso;
        try{
            while(true){
                peso = JOptionPane.showInputDialog(null, "¿Cual es la distancia entre los almacenes?", "redondee");
                if(Integer.parseInt(peso)<=0){
                    JOptionPane.showMessageDialog(null, "No es un numero valido", "Error", JOptionPane.WARNING_MESSAGE);
                    continue;
                }else{
                    return Integer.parseInt(peso);
                }
            }
        }catch(Exception err){
                JOptionPane.showMessageDialog(null, "No es un numero valido", "Error", JOptionPane.WARNING_MESSAGE);
        }
        return 0;
    }  
    
    
    /**
     * Se encarga de eliminar un almacen y sus rutas
     * @param id 
     */
    public void eliminarAlmacen(String id){
        almacenes.removerPorReferencia(id);
        arcos.removerRuta(id);
        arcos.removerRuta(id);
        almacenes.imprimir();
        arcos.imprimirRuta();
        
    }
    
    
    
 }   
                    
                    
                
                            
                            
                              
                                
                                
                                
                            
                            
                    
                    
    
                
                
        
      
      
      

        
        