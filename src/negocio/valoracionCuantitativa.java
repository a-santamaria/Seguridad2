/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 * @author Carlos Manrique
 * @author Alfredo Santamaria
 * @author Laura Chacón
 */
public class valoracionCuantitativa {
    private String tipoAmenaza;
    private String nombreAmenaza;
    private int probaOcurrencia;
    private String valoracionOcurrencia;

    public valoracionCuantitativa(String tipoAmenaza, String nombreAmenaza, int probaOcurrencia, String valoracionOcurrencia) {
        this.tipoAmenaza = tipoAmenaza;
        this.nombreAmenaza = nombreAmenaza;
        this.probaOcurrencia = probaOcurrencia;
        this.valoracionOcurrencia = valoracionOcurrencia;
    }
    
    public valoracionCuantitativa(){
        
    }

    public String getTipoAmenaza() {
        return tipoAmenaza;
    }

    public void setTipoAmenaza(String tipoAmenaza) {
        this.tipoAmenaza = tipoAmenaza;
    }

    public String getNombreAmenaza() {
        return nombreAmenaza;
    }

    public void setNombreAmenaza(String nombreAmenaza) {
        this.nombreAmenaza = nombreAmenaza;
    }

    public int getProbaOcurrencia() {
        return probaOcurrencia;
    }

    public void setProbaOcurrencia(int probaOcurrencia) {
        this.probaOcurrencia = probaOcurrencia;
    }

    public String getValoracionOcurrencia() {
        return valoracionOcurrencia;
    }

    public void setValoracionOcurrencia(String valoracionOcurrencia) {
        this.valoracionOcurrencia = valoracionOcurrencia;
    }
}
