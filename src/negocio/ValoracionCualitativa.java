/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;

/**
 * @author Carlos Manrique
 * @author Alfredo Santamaria
 * @author Laura Chacón
 */
public class ValoracionCualitativa {
    
    private Float valorEstimado;
    private String tipoAmenaza;
    private String nombreAmenaza;
    private Float degradacion;
    private Float ocurrencia;
    private Float valoracion;
    private List dependencia;

    /**
     * @return the valorEstimado
     */
    public Float getValorEstimado() {
        return valorEstimado;
    }

    /**
     * @param valorEstimado the valorEstimado to set
     */
    public void setValorEstimado(Float valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    /**
     * @return the tipoAmenaza
     */
    public String getTipoAmenaza() {
        return tipoAmenaza;
    }

    /**
     * @param tipoAmenaza the tipoAmenaza to set
     */
    public void setTipoAmenaza(String tipoAmenaza) {
        this.tipoAmenaza = tipoAmenaza;
    }

    /**
     * @return the nombreAmenaza
     */
    public String getNombreAmenaza() {
        return nombreAmenaza;
    }

    /**
     * @param nombreAmenaza the nombreAmenaza to set
     */
    public void setNombreAmenaza(String nombreAmenaza) {
        this.nombreAmenaza = nombreAmenaza;
    }

    /**
     * @return the degradacion
     */
    public Float getDegradacion() {
        return degradacion;
    }

    /**
     * @param degradacion the degradacion to set
     */
    public void setDegradacion(Float degradacion) {
        this.degradacion = degradacion;
    }

    /**
     * @return the ocurrencia
     */
    public Float getOcurrencia() {
        return ocurrencia;
    }

    /**
     * @param ocurrencia the ocurrencia to set
     */
    public void setOcurrencia(Float ocurrencia) {
        this.ocurrencia = ocurrencia;
    }

    /**
     * @return the valoracion
     */
    public Float getValoracion() {
        return valoracion;
    }

    /**
     * @param valoracion the valoracion to set
     */
    public void setValoracion(Float valoracion) {
        this.valoracion = valoracion;
    }

    /**
     * @return the dependencia
     */
    public List getDependencia() {
        return dependencia;
    }

    /**
     * @param dependencia the dependencia to set
     */
    public void setDependencia(List dependencia) {
        this.dependencia = dependencia;
    }
    
    
}
