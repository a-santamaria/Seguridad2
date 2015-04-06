/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Carlos Manrique
 * @author Alfredo Santamaria
 * @author Laura Chacón
 */
public class Empresa implements Serializable{
    /**
     * nomvre de la empresa
     */
    private String nombre;
    /**
     * lista de los activos de la empresa
     */
    private ArrayList<Activo> activos;

    /**
     * constructor 
     * @param nombre de la empresa
     */
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.activos = new ArrayList<>();
    }

    /**
     * retorna nombre de la emprsa
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * modifica nombre de la empresa
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * retorna la lista de activos de la empresa
     * @return activos
     */
    public ArrayList<Activo> getActivos() {
        return activos;
    }
    
    /**
     * agraga un activo a la emresa
     * @param nuevo activo que se va a agregar
     */
    public void addActivo(Activo nuevo){
        activos.add(nuevo);
    }
}
