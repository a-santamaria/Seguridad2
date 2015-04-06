/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Carlos Manrique
 * @author Alfredo Santamaria
 * @author Laura Chacón
 */
public class Archivos {
    
    /**
     * constructor
     */
    public Archivos() {
    }
    
    /**
     * nombre del archivos que guarda los objetos
     */
    private static String nombreArchivo = "Seguridad";
    /**
     * lista de empresas del sistema
     */
    public static ArrayList<Empresa> empresas = null;
    
    
    /**
     * guarda en el archivo la lista de empresas del sistema
     * @param empresas lista de las empresas
     */
    public static void guardarArchivo(ArrayList<Empresa> empresas){
        if(Archivos.empresas == null)
            Archivos.empresas = empresas;
                
        FileOutputStream fout = null;
        ObjectOutputStream out = null;
        try {
            fout = new FileOutputStream(nombreArchivo);
            out = new ObjectOutputStream(fout);
            out.writeObject(empresas);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        if(out  != null){
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
         } 
        }
    }
    
    /**
     * guarda en el archivo que ya se encuentra
     * en la variable estatica nombreArchivo
     */
    public static void guardarArchivo(){
                
        FileOutputStream fout = null;
        ObjectOutputStream out = null;
        try {
            fout = new FileOutputStream(nombreArchivo);
            out = new ObjectOutputStream(fout);
            out.writeObject(empresas);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        if(out  != null){
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
         } 
        }
    }
    
    /**
     * carga los objetos del archivo
     * @return lista de las empresas del sistema
     */
    public static ArrayList<Empresa> cargarArchivo(){
        ObjectInputStream objectinputstream = null;
        FileInputStream streamIn = null;
        Archivos.empresas = new ArrayList<>();
        File f = new File(nombreArchivo);
        if(!f.exists()) return null;
        try {
            streamIn = new FileInputStream(nombreArchivo);
            objectinputstream = new ObjectInputStream(streamIn);
            empresas = (ArrayList<Empresa>) objectinputstream.readObject();

        } catch (Exception e) {

            e.printStackTrace();
        } finally {
        if(objectinputstream != null){
            try {
                objectinputstream .close();
            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
         } 
       }
        return Archivos.empresas;
    }
    

}
