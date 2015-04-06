/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Carlos Manrique
 * @author Alfredo Santamaria
 * @author Laura Chacón
 */
public class Activo implements Serializable{
    /**
     * nombre del activo
     */
    private String nombre;
    
    /**
     * valoracion cuantitativa del activo
     */
    private valoracionCuantitativa valoracionCuantitativa;
    /**
     * valoración cualitativa, puede ser más de una dependiendo la dimensión
     */
    private List<ValoracionCualitativa> valoracionCualitativa;
    /**
     * tipos del activo, pude ser mas de uno
     */
    private ArrayList<TipoActivo> tipos;
    
    /**
     * constructor Activo
     * @param nombre
     * @param tipos 
     */
    public Activo(String nombre, ArrayList<TipoActivo> tipos) {
        this.nombre = nombre;
        this.tipos = tipos;
        this.valoracionCualitativa= new ArrayList<>();
    }
    
    /**
     * constructor Activo
     */
    public Activo() {
        this.nombre = "";
        this.tipos = new ArrayList<>();
        this.valoracionCualitativa= new ArrayList<>();
    }
    
    /**
     * retorna el nombre del activo
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * retorna la lista de tipos del activo
     * @return tipos
     */
    public ArrayList<TipoActivo> getTipos() {
        return tipos;
    }

    /**
     * modifica el nombre del activo
     * @param nombre nuevo nombre del activo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * modifica la lita de tipos del activo
     * @param tipos nueva lista de tipos
     */
    public void setTipos(ArrayList<TipoActivo> tipos) {
        this.tipos = tipos;
    }
    
    /**
     * agraga un tipo a la lista de tipos del activo
     * @param nuevo tipo a agragar
     */
    public void addTipo(TipoActivo nuevo){
        tipos.add(nuevo);
    }

    
    public valoracionCuantitativa getValoracionCuantitativa() {
        return valoracionCuantitativa;
    }

    public void setValoracionCuantitativa(valoracionCuantitativa valoracionCuantitativa) {
        this.valoracionCuantitativa = valoracionCuantitativa;
    }

    public void setValoracionCualitativa(ValoracionCualitativa valoracion) {
        this.valoracionCualitativa.add(valoracion);
        /*System.out.println(this.valoracionCualitativa.size());
        for (ValoracionCualitativa v : valoracionCualitativa) {
            System.out.println(v.getDegradacion());
            System.out.println(v.getNombreAmenaza());
            System.out.println(v.getOcurrencia());
            System.out.println(v.getTipoAmenaza());
            System.out.println(v.getValorEstimado());
            System.out.println(v.getValoracion());
            for (Object a : v.getDependencia()) {
                System.out.println(a);
            }
        }*/
    }

    public List<ValoracionCualitativa> getValoracionCualitativa() {
        return valoracionCualitativa;
    }
    
}
