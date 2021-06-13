/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import javax.swing.JOptionPane;

/**
 *
 * @author José Gómez
 */
public class ManejoArchivo {
    private String producto;
    private int stock;
    
    private String puntoA;
    private String puntoB;
    private int distancia;
    
    public String linea;
    
    public String almacenes = "";
    
    public String line = "";
    public String reponer = "";
    
    public String lineA = "";
    public String lineB = "";
    public String lineC = "";
    public String lineD = "";
    public String lineE = "";
    
    public String compra = "";
    public String compraA = "";
    public String compraB = "";
    public String compraC = "";
    public String compraD = "";
    public String compraE = "";
    
    Lista lista = new Lista();
    
    File ficheroA = new File ("test\\almacenA.txt");
    File ficheroB = new File ("test\\almacenB.txt");
    File ficheroC = new File ("test\\almacenC.txt");
    File ficheroD = new File ("test\\almacenD.txt");
    File ficheroE = new File ("test\\almacenE.txt");
    File ficheroP = new File ("test\\amazon.txt");
    File ficheroR = new File ("test\\rutas.txt");

    /**
    *Constructor de la clase ManejoArcivo
    **/
    public ManejoArchivo(){
        
    }
    /**
    *Método para validar la existencia de un archivo txt
    **/
    public void existeArchivo(){
        try{
            if (ficheroA.exists()){
                JOptionPane.showMessageDialog(null, "La base de datos existe");
            }
            else{
                ficheroA.createNewFile();
                JOptionPane.showMessageDialog(null, "Base de Datos creada");
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    /**
    *Método que escribe la información proporcionada por el usuario en el archivo almacenA.txt
    * @param producto2 El parámetro producto2 define los nombres de los productos ingresado por el usuario
    * @param stock2 El parámetro stock2 define la cantidad que habrá disponible del producto ingresado por el usuario
    **/
    public void escribirDatosA(String producto2, int stock2){
       producto = producto2;
       stock = stock2;
       
       try{
           BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroA, true)));
           escribir.write(producto + "," + stock);
           escribir.write("\n");
           JOptionPane.showMessageDialog(null, "El producto ha sido guardado exitosamente");
           escribir.close();
       }
       catch (Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }
    }
    
    /**
    *Método que lee el archivo almacenA.txt y posteriormente lo escribe en el archivo amazon.txt 
    **/
    public void leerDatosA(){
        try{
            
            PrintWriter pw = new PrintWriter("test\\amazon.txt");
            pw.print("");
            pw.close();
            
            FileReader fr = new FileReader("test\\almacenA.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadenaA;
            while ((cadenaA = br.readLine()) != null){
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroP, true)));
                escribir.write(cadenaA);
                escribir.write("\n");
                
                escribir.close();
                
                
            }  
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    /**
    *Método que escribe la información proporcionada por el usuario en el archivo almacenB.txt* 
    * @param producto2 El parámetro producto2 define los nombres de los productos ingresado por el usuario
    * @param stock2 El parámetro stock2 define la cantidad que habrá disponible del producto ingresado por el usuario
    **/
    public void escribirDatosB(String producto2, int stock2){
       producto = producto2;
       stock = stock2;
       
       try{
           BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroB, true)));
           escribir.write(producto + "," + stock);
           escribir.write("\n");
           JOptionPane.showMessageDialog(null, "El producto ha sido guardado exitosamente");
           escribir.close();
       }
       catch (Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }
    }
    
    /**
    *Método que lee el archivo almacenB.txt y posteriormente lo escribe en el archivo amazon.txt 
    **/
    public void leerDatosB(){
        try{
            FileReader fr = new FileReader("test\\almacenB.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadenaB;
            while ((cadenaB = br.readLine()) != null){

                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroP, true)));
                escribir.write(cadenaB);
                escribir.write("\n");
                escribir.close();
                
                
            }  
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    /**
    *Método que escribe la información proporcionada por el usuario en el archivo almacenC.txt
    *@param producto2 El parámetro producto2 define los nombres de los productos ingresado por el usuario
    *@param stock2 El parámetro stock2 define la cantidad que habrá disponible del producto ingresado por el usuario
    **/
    public void escribirDatosC(String producto2, int stock2){
       producto = producto2;
       stock = stock2;
       
       try{
           BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroC, true)));
           escribir.write(producto + "," + stock);
           escribir.write("\n");
           JOptionPane.showMessageDialog(null, "El producto ha sido guardado exitosamente");
           escribir.close();
       }
       catch (Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }
    }
    
    /**
    *Método que lee el archivo almacenC.txt y posteriormente lo escribe en el archivo amazon.txt 
    **/
    public void leerDatosC(){
        try{
            FileReader fr = new FileReader("test\\almacenC.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadenaC;
            while ((cadenaC = br.readLine()) != null){
                
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroP, true)));
                escribir.write(cadenaC);
                escribir.write("\n");
                escribir.close();
                
                
            }  
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    /**
    *Método que escribe la información proporcionada por el usuario en el archivo almacenD.txt
    *@param producto2 El parámetro producto2 define los nombres de los productos ingresado por el usuario
    *@param stock2 El parámetro stock2 define la cantidad que habrá disponible del producto ingresado por el usuario
    **/
    public void escribirDatosD(String producto2, int stock2){
       producto = producto2;
       stock = stock2;
       
       try{
           BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroD, true)));
           escribir.write(producto + "," + stock);
           escribir.write("\n");
           JOptionPane.showMessageDialog(null, "El producto ha sido guardado exitosamente");
           escribir.close();
       }
       catch (Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }
    }
    
    /**
    *Método que lee el archivo almacenD.txt y posteriormente lo escribe en el archivo amazon.txt 
    **/
    public void leerDatosD(){
        try{
            FileReader fr = new FileReader("test\\almacenD.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadenaD;
            while ((cadenaD = br.readLine()) != null){
                
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroP, true)));
                escribir.write(cadenaD);
                escribir.write("\n");
                escribir.close();
                
                
            }  
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    /**
    *Método que escribe la información proporcionada por el usuario en el archivo almacenE.txt
    *@param producto2 El parámetro producto2 define los nombres de los productos ingresado por el usuario
    *@param stock2 El parámetro stock2 define la cantidad que habrá disponible del producto ingresado por el usuario
    **/
    public void escribirDatosE(String producto2, int stock2){
       producto = producto2;
       stock = stock2;
       
       try{
           BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroE, true)));
           escribir.write(producto + "," + stock);
           escribir.write("\n");
           JOptionPane.showMessageDialog(null, "El producto ha sido guardado exitosamente");
           escribir.close();
       }
       catch (Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }
    }
    
    /**
    *Método que lee el archivo almacenE.txt y posteriormente lo escribe en el archivo amazon.txt 
    **/
    public void leerDatosE(){
        try{
            FileReader fr = new FileReader("test\\almacenE.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadenaE;
            while ((cadenaE = br.readLine()) != null){
                
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroP, true)));
                escribir.write(cadenaE);
                escribir.write("\n");
                escribir.close();
                
                
            }  
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    /**
    *Método que escribe la información relacionada con las rutas en el archivo rutas.txt
    **/
    public void escribirRutas(){
       
       try{
           BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroR, true)));
           escribir.write("A" + "," + "B" + "," + 10);
           escribir.write("\n");
           escribir.write("A" + "," + "C" + "," + 20);
           escribir.write("\n");
           escribir.write("B" + "," + "C" + "," + 5);
           escribir.write("\n");
           escribir.write("B" + "," + "D" + "," + 8);
           escribir.write("\n");
           escribir.write("C" + "," + "D" + "," + 4);
           escribir.write("\n");
           escribir.write("C" + "," + "E" + "," + 13);
           escribir.write("\n");
           escribir.write("D" + "," + "E" + "," + 3);
           escribir.write("\n");
           escribir.write("E" + "," + "A" + "," + 25);
           escribir.write("\n");
           JOptionPane.showMessageDialog(null, "las rutas han sido guardadas exitosamente");
           escribir.close();
       }
       catch (Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }
    }
    
    /**
    *Método que lee el archivo rutas.txt y posteriormente lo escribe en el archivo amazon.txt 
    **/
    public void leerRutas(){
        try{
            FileReader fr = new FileReader("test\\rutas.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadenaR;
            while ((cadenaR = br.readLine()) != null){
                
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroP, true)));
                escribir.write(cadenaR);
                escribir.write("\n");
                escribir.close();
                
                
            }  
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /**
    *Método que lee el archivo amazon.txt para posteriormente mostrar su información en la clase ventanaCompra 
    **/
    public void leerPrincipal(){
        try{
            FileReader fr = new FileReader("test\\amazon.txt");
            BufferedReader br = new BufferedReader(fr);
            
            while ((linea = br.readLine()) != null){
                if (!linea.isEmpty()){
                    almacenes += linea + "\n";
                }
            }
            
            if (!"".equals(almacenes)){
                lista.ingresarNodo(almacenes); 
            }

            
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }   
         
    }

    /**
    *Método que lee el archivo almacenA.txt, busca un elemento del fichero, modifica el elemento y escribe en el mismo archivo con la información nueva
    * @param producto2 El parámetro producto2 define los nombres de los productos ingresado por el usuario
    * @param stock2 El parámetro stock2 define la cantidad que habrá disponible del producto ingresado por el usuario
    **/
    public void buscarDatosA(String producto2, int stock2){
        String producto3 = producto2;
        int cantidadR = stock2;
        
        try{
            BufferedReader leer = new BufferedReader(new FileReader("test\\almacenA.txt"));
            String linea;
            
            while ((line = leer.readLine()) != null){
                if (line.indexOf(producto3) != -1){
                    JOptionPane.showMessageDialog(null, "Se encontro el registro: "+line);
                    line = (producto3 + "," + cantidadR);
                    JOptionPane.showMessageDialog(null, "Se ha actualizado el stock: "+ line); 
                }
                
                if (!line.isEmpty()){
                    reponer += line + "\n";
                }
            }
            
            if (!"".equals(reponer)){
                PrintWriter pw = new PrintWriter("test\\almacenA.txt");
                pw.print("");
                pw.close();
                
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroA, true)));
                escribir.write(reponer);
                escribir.close();
                reponer = "";
                
            }
            
        
        }catch ( Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    } 
    
    /**
    *Método que lee el archivo almacenB.txt, busca un elemento del fichero, modifica el elemento y escribe en el mismo archivo con la información nueva
    * @param producto2 El parámetro producto2 define los nombres de los productos ingresado por el usuario
    * @param stock2 El parámetro stock2 define la cantidad que habrá disponible del producto ingresado por el usuario
    **/
    public void buscarDatosB(String producto2, int stock2){
        String producto3 = producto2;
        int cantidadR = stock2;
        
        try{
            BufferedReader leer = new BufferedReader(new FileReader("test\\almacenB.txt"));
            String linea;
            
            while ((line = leer.readLine()) != null){
                if (line.indexOf(producto3) != -1){
                    JOptionPane.showMessageDialog(null, "Se encontro el registro: "+line);
                    line = (producto3 + "," + cantidadR);
                    JOptionPane.showMessageDialog(null, "Se ha actualizado el stock: "+ line); 
                }
                
                if (!line.isEmpty()){
                    reponer += line + "\n";
                }
            }
            
            if (!"".equals(reponer)){
                PrintWriter pw = new PrintWriter("test\\almacenB.txt");
                pw.print("");
                pw.close();
                
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroB, true)));
                escribir.write(reponer);
                escribir.close();
                reponer = "";
                
            }
            
        
        }catch ( Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    /**
    *Método que lee el archivo almacenC.txt, busca un elemento del fichero, modifica el elemento y escribe en el mismo archivo con la información nueva
    * @param producto2 El parámetro producto2 define los nombres de los productos ingresado por el usuario
    * @param stock2 El parámetro stock2 define la cantidad que habrá disponible del producto ingresado por el usuario
    **/
    public void buscarDatosC(String producto2, int stock2){
        String producto3 = producto2;
        int cantidadR = stock2;
        
        try{
            BufferedReader leer = new BufferedReader(new FileReader("test\\almacenC.txt"));
            String linea;
            
            while ((line = leer.readLine()) != null){
                if (line.indexOf(producto3) != -1){
                    JOptionPane.showMessageDialog(null, "Se encontro el registro: "+line);
                    line = (producto3 + "," + cantidadR);
                    JOptionPane.showMessageDialog(null, "Se ha actualizado el stock: "+ line); 
                }
                
                if (!line.isEmpty()){
                    reponer += line + "\n";
                }
            }
            
            if (!"".equals(reponer)){
                PrintWriter pw = new PrintWriter("test\\almacenC.txt");
                pw.print("");
                pw.close();
                
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroC, true)));
                escribir.write(reponer);
                escribir.close();
                reponer = "";
                
            }
            
        
        }catch ( Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    /**
    *Método que lee el archivo almacenD.txt, busca un elemento del fichero, modifica el elemento y escribe en el mismo archivo con la información nueva
    * @param producto2 El parámetro producto2 define los nombres de los productos ingresado por el usuario
    * @param stock2 El parámetro stock2 define la cantidad que habrá disponible del producto ingresado por el usuario
    **/
    public void buscarDatosD(String producto2, int stock2){
        String producto3 = producto2;
        int cantidadR = stock2;
        
        try{
            BufferedReader leer = new BufferedReader(new FileReader("test\\almacenD.txt"));
            String linea;
            
            while ((line = leer.readLine()) != null){
                if (line.indexOf(producto3) != -1){
                    JOptionPane.showMessageDialog(null, "Se encontro el registro: "+line);
                    line = (producto3 + "," + cantidadR);
                    JOptionPane.showMessageDialog(null, "Se ha actualizado el stock: "+ line); 
                }
                
                if (!line.isEmpty()){
                    reponer += line + "\n";
                }
            }
            
            if (!"".equals(reponer)){
                PrintWriter pw = new PrintWriter("test\\almacenD.txt");
                pw.print("");
                pw.close();
                
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroD, true)));
                escribir.write(reponer);
                escribir.close();
                reponer = "";
                
            }
            
        
        }catch ( Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    /**
    *Método que lee el archivo almacenE.txt, busca un elemento del fichero, modifica el elemento y escribe en el mismo archivo con la información nueva
    * @param producto2 El parámetro producto2 define los nombres de los productos ingresado por el usuario
    * @param stock2 El parámetro stock2 define la cantidad que habrá disponible del producto ingresado por el usuario
    **/
    public void buscarDatosE(String producto2, int stock2){
        String producto3 = producto2;
        int cantidadR = stock2;
        
        try{
            BufferedReader leer = new BufferedReader(new FileReader("test\\almacenE.txt"));
            String linea;
            
            while ((line = leer.readLine()) != null){
                if (line.indexOf(producto3) != -1){
                    JOptionPane.showMessageDialog(null, "Se encontro el registro: "+line);
                    line = (producto3 + "," + cantidadR);
                    JOptionPane.showMessageDialog(null, "Se ha actualizado el stock: "+ line); 
                }
                
                if (!line.isEmpty()){
                    reponer += line + "\n";
                }
            }
            
            if (!"".equals(reponer)){
                PrintWriter pw = new PrintWriter("test\\almacenE.txt");
                pw.print("");
                pw.close();
                
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroE, true)));
                escribir.write(reponer);
                escribir.close();
                reponer = "";
                
            }
            
        
        }catch ( Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    /**
    *Método que elimina el archivo almacenA.txt
    **/
    public void eliminarAlmacenA(){
        File fichero = new File("test\\almacenA.txt");
        
        if (fichero.delete()){
            JOptionPane.showMessageDialog(null, "El fichero ha sido borrado satisfactoriamente");
        }else{
            JOptionPane.showMessageDialog(null,"El fichero no puede ser borrado");
        }
    }
    
    /**
    *Método que elimina el archivo almacenB.txt
    **/
    public void eliminarAlmacenB(){
        File fichero = new File("test\\almacenB.txt");
        
        if (fichero.delete()){
            JOptionPane.showMessageDialog(null, "El fichero ha sido borrado satisfactoriamente");
        }else{
            JOptionPane.showMessageDialog(null,"El fichero no puede ser borrado");
        }
    }
    
    /**
    *Método que elimina el archivo almacenC.txt
    **/
    public void eliminarAlmacenC(){
        File fichero = new File("test\\almacenC.txt");
        
        if (fichero.delete()){
            JOptionPane.showMessageDialog(null, "El fichero ha sido borrado satisfactoriamente");
        }else{
            JOptionPane.showMessageDialog(null,"El fichero no puede ser borrado");
        }
    }
    
    /**
    *Método que elimina el archivo almacenD.txt
    **/
    public void eliminarAlmacenD(){
        File fichero = new File("test\\almacenD.txt");
        
        if (fichero.delete()){
            JOptionPane.showMessageDialog(null, "El fichero ha sido borrado satisfactoriamente");
        }else{
            JOptionPane.showMessageDialog(null,"El fichero no puede ser borrado");
        }
    }
    
    /**
    *Método que elimina el archivo almacenE.txt
    **/
    public void eliminarAlmacenE(){
        File fichero = new File("test\\almacenE.txt");
        
        if (fichero.delete()){
            JOptionPane.showMessageDialog(null, "El fichero ha sido borrado satisfactoriamente");
        }else{
            JOptionPane.showMessageDialog(null,"El fichero no puede ser borrado");
        }
    }
    
    /**
    *Método que busca archivo por archivo el producto solicitado por el usuario
    * @param producto2 El parámetro producto2 define los nombres de los productos ingresado por el usuario
    * @param cantidad El parámetro cantidad define la cantidad que habrá de producto que desea adquirir el usuario
    **/
    public void comprar(String producto2, int cantidad){
        String producto3 = producto2;
        
        try{
            BufferedReader leerA = new BufferedReader(new FileReader("test\\almacenA.txt"));

            while ((lineA = leerA.readLine()) != null){
                if (lineA.indexOf(producto3) != -1){
                    JOptionPane.showMessageDialog(null, "Se encontro el registro en el Almacen A ");
                    String[] cadena = lineA.split(",");
                    String stockR = cadena[cadena.length -1];
                    if (Integer.parseInt(stockR) > 0){
                        lineA = (producto3 + "," + (Integer.parseInt(stockR) - cantidad));
                        JOptionPane.showMessageDialog(null, "Su compra ha sido realizada con exito: "+ "\n" + "Producto: " + producto3 + "\n" + "Cantidad: " + cantidad); 
                    }else{
                        JOptionPane.showMessageDialog(null, "En estos momentos no disponemos del producto");
                    }
                }
                
                if (!lineA.isEmpty()){
                    compraA += lineA + "\n";
                }   
            }
            
            BufferedReader leerB = new BufferedReader(new FileReader("test\\almacenB.txt"));

            while ((lineB = leerB.readLine()) != null){
                if (lineB.indexOf(producto3) != -1){
                    JOptionPane.showMessageDialog(null, "Se encontro el registro en el Almacen B ");
                    String[] cadena = lineB.split(",");
                    String stockR = cadena[cadena.length -1];
                    if (Integer.parseInt(stockR) > 0){
                        lineB = (producto3 + "," + (Integer.parseInt(stockR) - cantidad));
                        JOptionPane.showMessageDialog(null, "Su compra ha sido realizada con exito: "+ "\n" + "Producto: " + producto3 + "\n" + "Cantidad: " + cantidad); 
                    }else{
                        JOptionPane.showMessageDialog(null, "En estos momentos no disponemos del producto");
                    }
                }
                
                if (!lineB.isEmpty()){
                    compraB += lineB + "\n";
                }
            }
            
            BufferedReader leerC = new BufferedReader(new FileReader("test\\almacenC.txt"));

            while ((lineC = leerC.readLine()) != null){
                if (lineC.indexOf(producto3) != -1){
                    JOptionPane.showMessageDialog(null, "Se encontro el registro en el Almacen C ");
                    String[] cadena = lineC.split(",");
                    String stockR = cadena[cadena.length -1];
                    if (Integer.parseInt(stockR) > 0){
                        lineC = (producto3 + "," + (Integer.parseInt(stockR) - cantidad));
                        JOptionPane.showMessageDialog(null, "Su compra ha sido realizada con exito: "+ "\n" + "Producto: " + producto3 + "\n" + "Cantidad: " + cantidad); 
                    }else{
                        JOptionPane.showMessageDialog(null, "En estos momentos no disponemos del producto");
                    }
                }
                
                if (!lineC.isEmpty()){
                    compraC += lineC + "\n";
                }   
            }
            
            BufferedReader leerD = new BufferedReader(new FileReader("test\\almacenD.txt"));

            while ((lineD = leerD.readLine()) != null){
                if (lineD.indexOf(producto3) != -1){
                    JOptionPane.showMessageDialog(null, "Se encontro el registro en el Almacen D ");
                    String[] cadena = lineD.split(",");
                    String stockR = cadena[cadena.length -1];
                    if (Integer.parseInt(stockR) > 0){
                        lineD = (producto3 + "," + (Integer.parseInt(stockR) - cantidad)); 
                        JOptionPane.showMessageDialog(null, "Su compra ha sido realizada con exito: "+ "\n" + "Producto: " + producto3 + "\n" + "Cantidad: " + cantidad); 
                    }else{
                        JOptionPane.showMessageDialog(null, "En estos momentos no disponemos del producto");
                    }
                }
                
                if (!lineD.isEmpty()){
                    compraD += lineD + "\n";
                }    
            }
            
            BufferedReader leerE = new BufferedReader(new FileReader("test\\almacenE.txt"));

            while ((lineE = leerE.readLine()) != null){
                if (lineE.indexOf(producto3) != -1){
                    JOptionPane.showMessageDialog(null, "Se encontro el registro en el Almacen D ");
                    String[] cadena = lineE.split(",");
                    String stockR = cadena[cadena.length -1];
                    if (Integer.parseInt(stockR) > 0){
                        lineE = (producto3 + "," + (Integer.parseInt(stockR) - cantidad)); 
                        JOptionPane.showMessageDialog(null, "Su compra ha sido realizada con exito: "+ "\n" + "Producto: " + producto3 + "\n" + "Cantidad: " + cantidad); 
                    }else{
                        JOptionPane.showMessageDialog(null, "En estos momentos no disponemos del producto");
                    }
                }
                
                if (!lineE.isEmpty()){
                    compraE += lineE + "\n";
                }  
            }

            if (!"".equals(compraA)){
                PrintWriter pw = new PrintWriter("test\\almacenA.txt");
                pw.print("");
                pw.close();
                
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroA, true)));
                escribir.write(compraA);
                escribir.close();                
            }
            
            if (!"".equals(compraB)){
                PrintWriter pw = new PrintWriter("test\\almacenB.txt");
                pw.print("");
                pw.close();
                
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroB, true)));
                escribir.write(compraB);
                escribir.close();                
            }
            
            if (!"".equals(compraC)){
                PrintWriter pw = new PrintWriter("test\\almacenC.txt");
                pw.print("");
                pw.close();
                
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroC, true)));
                escribir.write(compraC);
                escribir.close();                
            }
            
            if (!"".equals(compraD)){
                PrintWriter pw = new PrintWriter("test\\almacenD.txt");
                pw.print("");
                pw.close();
                
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroD, true)));
                escribir.write(compraD);
                escribir.close();                
            }
            
            if (!"".equals(compraE)){
                PrintWriter pw = new PrintWriter("test\\almacenE.txt");
                pw.print("");
                pw.close();
                
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroE, true)));
                escribir.write(compraE);
                escribir.close();                
            }

        }catch ( Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }  
    }
}
