package com.laticobsa.modelo;
// Generated 30-ago-2017 1:41:34 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * LcAsignacioPiccaTmpId generated by hbm2java
 */
public class LcAsignacioPiccaTmpId  implements java.io.Serializable {


     private String identificacion;
     private BigDecimal monto;
     private Long idUsuario;
     private String nomUsuario;

    public LcAsignacioPiccaTmpId() {
    }

    public LcAsignacioPiccaTmpId(String identificacion, BigDecimal monto, Long idUsuario, String nomUsuario) {
       this.identificacion = identificacion;
       this.monto = monto;
       this.idUsuario = idUsuario;
       this.nomUsuario = nomUsuario;
    }
   
    public String getIdentificacion() {
        return this.identificacion;
    }
    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public BigDecimal getMonto() {
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }
    public Long getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNomUsuario() {
        return this.nomUsuario;
    }
    
    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LcAsignacioPiccaTmpId) ) return false;
		 LcAsignacioPiccaTmpId castOther = ( LcAsignacioPiccaTmpId ) other; 
         
		 return ( (this.getIdentificacion()==castOther.getIdentificacion()) || ( this.getIdentificacion()!=null && castOther.getIdentificacion()!=null && this.getIdentificacion().equals(castOther.getIdentificacion()) ) )
 && ( (this.getMonto()==castOther.getMonto()) || ( this.getMonto()!=null && castOther.getMonto()!=null && this.getMonto().equals(castOther.getMonto()) ) )
 && ( (this.getIdUsuario()==castOther.getIdUsuario()) || ( this.getIdUsuario()!=null && castOther.getIdUsuario()!=null && this.getIdUsuario().equals(castOther.getIdUsuario()) ) )
 && ( (this.getNomUsuario()==castOther.getNomUsuario()) || ( this.getNomUsuario()!=null && castOther.getNomUsuario()!=null && this.getNomUsuario().equals(castOther.getNomUsuario()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdentificacion() == null ? 0 : this.getIdentificacion().hashCode() );
         result = 37 * result + ( getMonto() == null ? 0 : this.getMonto().hashCode() );
         result = 37 * result + ( getIdUsuario() == null ? 0 : this.getIdUsuario().hashCode() );
         result = 37 * result + ( getNomUsuario() == null ? 0 : this.getNomUsuario().hashCode() );
         return result;
   }   


}

