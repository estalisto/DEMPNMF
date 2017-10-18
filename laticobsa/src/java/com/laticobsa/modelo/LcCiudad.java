package com.laticobsa.modelo;
// Generated 30-ago-2017 1:41:34 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * LcCiudad generated by hbm2java
 */
public class LcCiudad  implements java.io.Serializable {


     private int idCiudad;
     private LcProvincia lcProvincia;
     private String ciudad;
     private String estado;
     private Set lcEmpresas = new HashSet(0);
     private Set lcClienteses = new HashSet(0);
     private Set lcZonases = new HashSet(0);
     private Set lcParroquiases = new HashSet(0);
     private Set lcReferenciases = new HashSet(0);
     private Set lcDatosDeudoreses = new HashSet(0);

    public LcCiudad() {
    }

	
    public LcCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }
    public LcCiudad(int idCiudad, LcProvincia lcProvincia, String ciudad, String estado, Set lcEmpresas, Set lcClienteses, Set lcZonases, Set lcParroquiases, Set lcReferenciases, Set lcDatosDeudoreses) {
       this.idCiudad = idCiudad;
       this.lcProvincia = lcProvincia;
       this.ciudad = ciudad;
       this.estado = estado;
       this.lcEmpresas = lcEmpresas;
       this.lcClienteses = lcClienteses;
       this.lcZonases = lcZonases;
       this.lcParroquiases = lcParroquiases;
       this.lcReferenciases = lcReferenciases;
       this.lcDatosDeudoreses = lcDatosDeudoreses;
    }
   
    public int getIdCiudad() {
        return this.idCiudad;
    }
    
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }
    public LcProvincia getLcProvincia() {
        return this.lcProvincia;
    }
    
    public void setLcProvincia(LcProvincia lcProvincia) {
        this.lcProvincia = lcProvincia;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set getLcEmpresas() {
        return this.lcEmpresas;
    }
    
    public void setLcEmpresas(Set lcEmpresas) {
        this.lcEmpresas = lcEmpresas;
    }
    public Set getLcClienteses() {
        return this.lcClienteses;
    }
    
    public void setLcClienteses(Set lcClienteses) {
        this.lcClienteses = lcClienteses;
    }
    public Set getLcZonases() {
        return this.lcZonases;
    }
    
    public void setLcZonases(Set lcZonases) {
        this.lcZonases = lcZonases;
    }
    public Set getLcParroquiases() {
        return this.lcParroquiases;
    }
    
    public void setLcParroquiases(Set lcParroquiases) {
        this.lcParroquiases = lcParroquiases;
    }
    public Set getLcReferenciases() {
        return this.lcReferenciases;
    }
    
    public void setLcReferenciases(Set lcReferenciases) {
        this.lcReferenciases = lcReferenciases;
    }
    public Set getLcDatosDeudoreses() {
        return this.lcDatosDeudoreses;
    }
    
    public void setLcDatosDeudoreses(Set lcDatosDeudoreses) {
        this.lcDatosDeudoreses = lcDatosDeudoreses;
    }




}


