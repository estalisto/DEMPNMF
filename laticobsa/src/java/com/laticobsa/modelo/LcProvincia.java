package com.laticobsa.modelo;
// Generated 30-ago-2017 1:41:34 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * LcProvincia generated by hbm2java
 */
public class LcProvincia  implements java.io.Serializable {


     private int idProvincia;
     private LcPais lcPais;
     private String provincia;
     private String estado;
     private Set lcEmpresas = new HashSet(0);
     private Set lcZonases = new HashSet(0);
     private Set lcClienteses = new HashSet(0);
     private Set lcCiudads = new HashSet(0);

    public LcProvincia() {
    }

	
    public LcProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }
    public LcProvincia(int idProvincia, LcPais lcPais, String provincia, String estado, Set lcEmpresas, Set lcZonases, Set lcClienteses, Set lcCiudads) {
       this.idProvincia = idProvincia;
       this.lcPais = lcPais;
       this.provincia = provincia;
       this.estado = estado;
       this.lcEmpresas = lcEmpresas;
       this.lcZonases = lcZonases;
       this.lcClienteses = lcClienteses;
       this.lcCiudads = lcCiudads;
    }
   
    public int getIdProvincia() {
        return this.idProvincia;
    }
    
    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }
    public LcPais getLcPais() {
        return this.lcPais;
    }
    
    public void setLcPais(LcPais lcPais) {
        this.lcPais = lcPais;
    }
    public String getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
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
    public Set getLcZonases() {
        return this.lcZonases;
    }
    
    public void setLcZonases(Set lcZonases) {
        this.lcZonases = lcZonases;
    }
    public Set getLcClienteses() {
        return this.lcClienteses;
    }
    
    public void setLcClienteses(Set lcClienteses) {
        this.lcClienteses = lcClienteses;
    }
    public Set getLcCiudads() {
        return this.lcCiudads;
    }
    
    public void setLcCiudads(Set lcCiudads) {
        this.lcCiudads = lcCiudads;
    }




}


