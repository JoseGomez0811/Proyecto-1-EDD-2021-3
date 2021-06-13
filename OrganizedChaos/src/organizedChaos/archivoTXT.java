/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizedChaos;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
/**
 *
 * @author joseg
 */
public class archivoTXT {
    public static void main(String[] args) {
        
        String nPantallasA = "3";
        String nRamA = "2";
        String nProcesadorA = "1";
        
        String nPantallasB = "3";
        String nGraficaB = "5";

        String[] lineas = { "Almacenes", "Almacén A:", "Pantalla, "+nPantallasA, "RAM, "+nRamA, "Procesador, "+nProcesadorA, "Almacén B:", "Pantalla, "+nPantallasB, "Gráfica, "+nGraficaB, "Almacén C:" };

        /** FORMA 2 DE ESCRITURA. Con el fichero codificado en UTF-8 **/
        Writer out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\joseg\\OneDrive\\Escritorio\\Proyecto 1 EDD 2021-3\\amazon.txt"), "UTF-8"));
			
            // Escribimos linea a linea en el fichero
            for (String linea : lineas) {
                try {
                    out.write(linea+"\n");
                } catch (IOException ex) {
                    System.out.println("Mensaje excepcion escritura: " + ex.getMessage());
                }
            }

        } catch (UnsupportedEncodingException | FileNotFoundException ex2) {
            System.out.println("Mensaje error 2: " + ex2.getMessage());
        } finally {
            try {
                out.close();
            } catch (IOException ex3) {
                System.out.println("Mensaje error cierre fichero: " + ex3.getMessage());
            }
        }
    }

    
}
