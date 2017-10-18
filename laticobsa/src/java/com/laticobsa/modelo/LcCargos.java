package com.laticobsa.modelo;
// Generated 30-ago-2017 1:41:34 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * LcCargos generated by hbm2java
 */
public class LcCargos  implements java.io.Serializable {


     private int idCargo;
     private LcEmpresa lcEmpresa;
     private String cargo;
     private String observacion;
     private Date fechaCreacion;
     private String estado;
     private Set lcEmpleadoses = new HashSet(0);

    public LcCargos() {
    }

	
    public LcCargos(int idCargo) {
        this.idCargo = idCargo;
    }
    public LcCargos(int idCargo, LcEmpresa lcEmpresa, String cargo, String observacion, Date fechaCreacion, String estado, Set lcEmpleadoses) {
       this.idCargo = idCargo;
       this.lcEmpresa = lcEmpresa;
       this.cargo = cargo;
       this.observacion = observacion;
       this.fechaCreacion = fechaCreacion;
       this.estado = estado;
       this.lcEmpleadoses = lcEmpleadoses;
    }
   
    public int getIdCargo() {
        return this.idCargo;
    }
    
    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }
    public LcEmpresa getLcEmpresa() {
        return this.lcEmpresa;
    }
    
    public void setLcEmpresa(LcEmpresa lcEmpresa) {
        this.lcEmpresa = lcEmpresa;
    }
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
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
    public Set getLcEmpleadoses() {
        return this.lcEmpleadoses;
    }
    
    public void setLcEmpleadoses(Set lcEmpleadoses) {
        this.lcEmpleadoses = lcEmpleadoses;
    }




}


