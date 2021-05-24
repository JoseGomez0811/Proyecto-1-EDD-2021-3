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
    
    File ficheroA = new File ("test\\almacenA.txt");
    File ficheroB = new File ("test\\almacenB.txt");
    File ficheroC = new File ("test\\almacenC.txt");
    File ficheroD = new File ("test\\almacenD.txt");
    File ficheroE = new File ("test\\almacenE.txt");
    File ficheroP = new File ("test\\amazon.txt");
    File ficheroR = new File ("test\\rutas.txt");

    public ManejoArchivo(){
        
    }
    
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
    
    public void leerDatosA(){
        try{
            
            PrintWriter pw = new PrintWriter("test\\amazon.txt");
            pw.print("");
            pw.close();
            
            FileReader fr = new FileReader("test\\almacenA.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadenaA;
            while ((cadenaA = br.readLine()) != null){
                //JOptionPane.showMessageDialog(null, ""+cadenaA);
                
                
                //pw.append(cadenaA);
                //pw.append("\n");
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroP, true)));
                escribir.write(cadenaA);
                escribir.write("\n");
                //JOptionPane.showMessageDialog(null, "El producto ha sido guardado exitosamente");
                
                escribir.close();
                
                
            }  
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
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
    
    public void leerDatosB(){
        try{
            FileReader fr = new FileReader("test\\almacenB.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadenaB;
            while ((cadenaB = br.readLine()) != null){
                //JOptionPane.showMessageDialog(null, ""+cadenaB);

                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroP, true)));
                escribir.write(cadenaB);
                escribir.write("\n");
                //JOptionPane.showMessageDialog(null, "El producto ha sido guardado exitosamente");
                escribir.close();
                
                
            }  
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
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
    
    public void leerDatosC(){
        try{
            FileReader fr = new FileReader("test\\almacenC.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadenaC;
            while ((cadenaC = br.readLine()) != null){
                //JOptionPane.showMessageDialog(null, ""+cadenaC);
                
                
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroP, true)));
                escribir.write(cadenaC);
                escribir.write("\n");
                //JOptionPane.showMessageDialog(null, "El producto ha sido guardado exitosamente");
                escribir.close();
                
                
            }  
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
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
    
    public void leerDatosD(){
        try{
            FileReader fr = new FileReader("test\\almacenD.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadenaD;
            while ((cadenaD = br.readLine()) != null){
                //JOptionPane.showMessageDialog(null, ""+cadenaD);
                
                
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroP, true)));
                escribir.write(cadenaD);
                escribir.write("\n");
                //JOptionPane.showMessageDialog(null, "El producto ha sido guardado exitosamente");
                escribir.close();
                
                
            }  
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
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
    
    public void leerDatosE(){
        try{
            FileReader fr = new FileReader("test\\almacenE.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadenaE;
            while ((cadenaE = br.readLine()) != null){
                //JOptionPane.showMessageDialog(null, ""+cadenaE);
                
                
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroP, true)));
                escribir.write(cadenaE);
                escribir.write("\n");
                //JOptionPane.showMessageDialog(null, "El producto ha sido guardado exitosamente");
                escribir.close();
                
                
            }  
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
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
    
    public void leerRutas(){
        try{
            FileReader fr = new FileReader("test\\rutas.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadenaR;
            while ((cadenaR = br.readLine()) != null){
                //JOptionPane.showMessageDialog(null, ""+cadenaR);
                
                
                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroP, true)));
                escribir.write(cadenaR);
                escribir.write("\n");
                //JOptionPane.showMessageDialog(null, "Las rutas han sido guardadas exitosamente");
                escribir.close();
                
                
            }  
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void buscarDatosA(String producto2, int stock2){
        String producto3 = producto2;
        int cantidadR = stock2;
        
        try{
            BufferedReader leer = new BufferedReader(new FileReader("test\\almacenA.txt"));
            String linea;
            //int nLineas = (int) leer.lines().count();
            
            //String lineaNueva;
            
            while ((linea = leer.readLine()) != null){
                
                if (linea.indexOf(producto3) != -1){
                    JOptionPane.showMessageDialog(null, "Se encontro el registro: "+linea);
                    linea = (producto3 + "," + cantidadR);
                    JOptionPane.showMessageDialog(null, "Se ha actualizado el stock: "+ linea); 
                }

                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroA, true)));
                escribir.write(linea);
                escribir.write("\n");
                //JOptionPane.showMessageDialog(null, "Las rutas han sido guardadas exitosamente");
                escribir.close();
                //JOptionPane.showMessageDialog(null, nLineas); 

            }
        
        }catch ( Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    } 
    
    public void buscarDatosB(String producto2, int stock2){
        String producto3 = producto2;
        int cantidadR = stock2;
        
        try{
            BufferedReader leer = new BufferedReader(new FileReader("test\\almacenB.txt"));
            String linea;
            //int nLineas = (int) leer.lines().count();
            
            //String lineaNueva;
            
            while ((linea = leer.readLine()) != null){
                
                if (linea.indexOf(producto3) != -1){
                    JOptionPane.showMessageDialog(null, "Se encontro el registro: "+linea);
                    linea = (producto3 + "," + cantidadR);
                    JOptionPane.showMessageDialog(null, "Se ha actualizado el stock: "+ linea); 
                }

                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroB, true)));
                escribir.write(linea);
                escribir.write("\n");
                //JOptionPane.showMessageDialog(null, "Las rutas han sido guardadas exitosamente");
                escribir.close();
                //JOptionPane.showMessageDialog(null, nLineas); 

            }
        
        }catch ( Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void buscarDatosC(String producto2, int stock2){
        String producto3 = producto2;
        int cantidadR = stock2;
        
        try{
            BufferedReader leer = new BufferedReader(new FileReader("test\\almacenC.txt"));
            String linea;
            //int nLineas = (int) leer.lines().count();
            
            //String lineaNueva;
            
            while ((linea = leer.readLine()) != null){
                
                if (linea.indexOf(producto3) != -1){
                    JOptionPane.showMessageDialog(null, "Se encontro el registro: "+linea);
                    linea = (producto3 + "," + cantidadR);
                    JOptionPane.showMessageDialog(null, "Se ha actualizado el stock: "+ linea); 
                }

                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroC, true)));
                escribir.write(linea);
                escribir.write("\n");
                //JOptionPane.showMessageDialog(null, "Las rutas han sido guardadas exitosamente");
                escribir.close();
                //JOptionPane.showMessageDialog(null, nLineas); 

            }
        
        }catch ( Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void buscarDatosD(String producto2, int stock2){
        String producto3 = producto2;
        int cantidadR = stock2;
        
        try{
            BufferedReader leer = new BufferedReader(new FileReader("test\\almacenD.txt"));
            String linea;
            //int nLineas = (int) leer.lines().count();
            
            //String lineaNueva;
            
            while ((linea = leer.readLine()) != null){
                
                if (linea.indexOf(producto3) != -1){
                    JOptionPane.showMessageDialog(null, "Se encontro el registro: "+linea);
                    linea = (producto3 + "," + cantidadR);
                    JOptionPane.showMessageDialog(null, "Se ha actualizado el stock: "+ linea); 
                }

                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroD, true)));
                escribir.write(linea);
                escribir.write("\n");
                //JOptionPane.showMessageDialog(null, "Las rutas han sido guardadas exitosamente");
                escribir.close();
                //JOptionPane.showMessageDialog(null, nLineas); 

            }
        
        }catch ( Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void buscarDatosE(String producto2, int stock2){
        String producto3 = producto2;
        int cantidadR = stock2;
        
        try{
            BufferedReader leer = new BufferedReader(new FileReader("test\\almacenE.txt"));
            String linea;
            //int nLineas = (int) leer.lines().count();
            
            //String lineaNueva;
            
            while ((linea = leer.readLine()) != null){
                
                if (linea.indexOf(producto3) != -1){
                    JOptionPane.showMessageDialog(null, "Se encontro el registro: "+linea);
                    linea = (producto3 + "," + cantidadR);
                    JOptionPane.showMessageDialog(null, "Se ha actualizado el stock: "+ linea); 
                }

                BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroE, true)));
                escribir.write(linea);
                escribir.write("\n");
                //JOptionPane.showMessageDialog(null, "Las rutas han sido guardadas exitosamente");
                escribir.close();
                //JOptionPane.showMessageDialog(null, nLineas); 

            }
        
        }catch ( Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void eliminarAlmacenA(){
        File fichero = new File("test\\almacenA.txt");
        
        if (fichero.delete()){
            JOptionPane.showMessageDialog(null, "El fichero ha sido borrado satisfactoriamente");
        }else{
            JOptionPane.showMessageDialog(null,"El fichero no puede ser borrado");
        }
    }
    
    public void eliminarAlmacenB(){
        File fichero = new File("test\\almacenB.txt");
        
        if (fichero.delete()){
            JOptionPane.showMessageDialog(null, "El fichero ha sido borrado satisfactoriamente");
        }else{
            JOptionPane.showMessageDialog(null,"El fichero no puede ser borrado");
        }
    }
    
    public void eliminarAlmacenC(){
        File fichero = new File("test\\almacenC.txt");
        
        if (fichero.delete()){
            JOptionPane.showMessageDialog(null, "El fichero ha sido borrado satisfactoriamente");
        }else{
            JOptionPane.showMessageDialog(null,"El fichero no puede ser borrado");
        }
    }
    
    public void eliminarAlmacenD(){
        File fichero = new File("test\\almacenD.txt");
        
        if (fichero.delete()){
            JOptionPane.showMessageDialog(null, "El fichero ha sido borrado satisfactoriamente");
        }else{
            JOptionPane.showMessageDialog(null,"El fichero no puede ser borrado");
        }
    }
    
    public void eliminarAlmacenE(){
        File fichero = new File("test\\almacenE.txt");
        
        if (fichero.delete()){
            JOptionPane.showMessageDialog(null, "El fichero ha sido borrado satisfactoriamente");
        }else{
            JOptionPane.showMessageDialog(null,"El fichero no puede ser borrado");
        }
    }
}
