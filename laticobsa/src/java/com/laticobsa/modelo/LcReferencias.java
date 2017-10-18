package com.laticobsa.modelo;
// Generated 30-ago-2017 1:41:34 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * LcReferencias generated by hbm2java
 */
public class LcReferencias  implements java.io.Serializable {


     private int idReferencia;
     private LcCiudad lcCiudad;
     private LcTipoReferencia lcTipoReferencia;
     private Integer idDeudor;
     private String nombreReferencia;
     private Integer idTelefono;
     private Integer idDireccion;
     private Date fechaCreacion;
     private String estado;
     private String descripcionCarga;

    public LcReferencias() {
    }

	
    public LcReferencias(int idReferencia) {
        this.idReferencia = idReferencia;
    }
    public LcReferencias(int idReferencia, LcCiudad lcCiudad, LcTipoReferencia lcTipoReferencia, Integer idDeudor, String nombreReferencia, Integer idTelefono, Integer idDireccion, Date fechaCreacion, String estado, String descripcionCarga) {
       this.idReferencia = idReferencia;
       this.lcCiudad = lcCiudad;
       this.lcTipoReferencia = lcTipoReferencia;
       this.idDeudor = idDeudor;
       this.nombreReferencia = nombreReferencia;
       this.idTelefono = idTelefono;
       this.idDireccion = idDireccion;
       this.fechaCreacion = fechaCreacion;
       this.estado = estado;
       this.descripcionCarga = descripcionCarga;
    }
   
    public int getIdReferencia() {
        return this.idReferencia;
    }
    
    public void setIdReferencia(int idReferencia) {
        this.idReferencia = idReferencia;
    }
    public LcCiudad getLcCiudad() {
        return this.lcCiudad;
    }
    
    public void setLcCiudad(LcCiudad lcCiudad) {
        this.lcCiudad = lcCiudad;
    }
    public LcTipoReferencia getLcTipoReferencia() {
        return this.lcTipoReferencia;
    }
    
    public void setLcTipoReferencia(LcTipoReferencia lcTipoReferencia) {
        this.lcTipoReferencia = lcTipoReferencia;
    }
    public Integer getIdDeudor() {
        return this.idDeudor;
    }
    
    public void setIdDeudor(Integer idDeudor) {
        this.idDeudor = idDeudor;
    }
    public String getNombreReferencia() {
        return this.nombreReferencia;
    }
    
    public void setNombreReferencia(String nombreReferencia) {
        this.nombreReferencia = nombreReferencia;
    }
    public Integer getIdTelefono() {
        return this.idTelefono;
    }
    
    public void setIdTelefono(Integer idTelefono) {
        this.idTelefono = idTelefono;
    }
    public Integer getIdDireccion() {
        return this.idDireccion;
    }
    
    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getDescripcionCarga() {
        return this.descripcionCarga;
    }
    
    public void setDescripcionCarga(String descripcionCarga) {
        this.descripcionCarga = descripcionCarga;
    }




}

