package com.laticobsa.modelo;
// Generated 30-ago-2017 1:41:34 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * LcNotas generated by hbm2java
 */
public class LcNotas  implements java.io.Serializable {


     private int idNota;
     private Integer idDeudor;
     private Integer idCliente;
     private String observacion;
     private Date fechaTransaccion;
     private String estado;

    public LcNotas() {
    }

	
    public LcNotas(int idNota) {
        this.idNota = idNota;
    }
    public LcNotas(int idNota, Integer idDeudor, Integer idCliente, String observacion, Date fechaTransaccion, String estado) {
       this.idNota = idNota;
       this.idDeudor = idDeudor;
       this.idCliente = idCliente;
       this.observacion = observacion;
       this.fechaTransaccion = fechaTransaccion;
       this.estado = estado;
    }
   
    public int getIdNota() {
        return this.idNota;
    }
    
    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }
    public Integer getIdDeudor() {
        return this.idDeudor;
    }
    
    public void setIdDeudor(Integer idDeudor) {
        this.idDeudor = idDeudor;
    }
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public Date getFechaTransaccion() {
        return this.fechaTransaccion;
    }
    
    public void setFechaTransaccion(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}


