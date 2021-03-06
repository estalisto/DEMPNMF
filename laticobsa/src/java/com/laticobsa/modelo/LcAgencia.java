package com.laticobsa.modelo;
// Generated 30-ago-2017 1:41:34 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * LcAgencia generated by hbm2java
 */
public class LcAgencia  implements java.io.Serializable {


     private int idAgencia;
     private LcEmpresa lcEmpresa;
     private String nombre;
     private String opcion;
     private String direccion;
     private String telefono;
     private String telefono2;
     private String celular;
     private String email;
     private Date fechaCreacion;
     private String estado;
     private Set lcDatosDeudoreses = new HashSet(0);
     private Set lcEmpleadoses = new HashSet(0);
     private Set lcRecordatorioses = new HashSet(0);

    public LcAgencia() {
    }

	
    public LcAgencia(int idAgencia) {
        this.idAgencia = idAgencia;
    }
    public LcAgencia(int idAgencia, LcEmpresa lcEmpresa, String nombre, String opcion, String direccion, String telefono, String telefono2, String celular, String email, Date fechaCreacion, String estado, Set lcDatosDeudoreses, Set lcEmpleadoses, Set lcRecordatorioses) {
       this.idAgencia = idAgencia;
       this.lcEmpresa = lcEmpresa;
       this.nombre = nombre;
       this.opcion = opcion;
       this.direccion = direccion;
       this.telefono = telefono;
       this.telefono2 = telefono2;
       this.celular = celular;
       this.email = email;
       this.fechaCreacion = fechaCreacion;
       this.estado = estado;
       this.lcDatosDeudoreses = lcDatosDeudoreses;
       this.lcEmpleadoses = lcEmpleadoses;
       this.lcRecordatorioses = lcRecordatorioses;
    }
   
    public int getIdAgencia() {
        return this.idAgencia;
    }
    
    public void setIdAgencia(int idAgencia) {
        this.idAgencia = idAgencia;
    }
    public LcEmpresa getLcEmpresa() {
        return this.lcEmpresa;
    }
    
    public void setLcEmpresa(LcEmpresa lcEmpresa) {
        this.lcEmpresa = lcEmpresa;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getOpcion() {
        return this.opcion;
    }
    
    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono2() {
        return this.telefono2;
    }
    
    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
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
    public Set getLcDatosDeudoreses() {
        return this.lcDatosDeudoreses;
    }
    
    public void setLcDatosDeudoreses(Set lcDatosDeudoreses) {
        this.lcDatosDeudoreses = lcDatosDeudoreses;
    }
    public Set getLcEmpleadoses() {
        return this.lcEmpleadoses;
    }
    
    public void setLcEmpleadoses(Set lcEmpleadoses) {
        this.lcEmpleadoses = lcEmpleadoses;
    }
    public Set getLcRecordatorioses() {
        return this.lcRecordatorioses;
    }
    
    public void setLcRecordatorioses(Set lcRecordatorioses) {
        this.lcRecordatorioses = lcRecordatorioses;
    }




}


