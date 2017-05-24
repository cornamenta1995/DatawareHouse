package model.pojo;
// Generated 22/05/2017 10:06:07 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Entidad generated by hbm2java
 */
public class Entidad  implements java.io.Serializable {


     private Integer idEntidad;
     private String entidad;
     private Set poblacions = new HashSet(0);
     private Set escuelas = new HashSet(0);

    public Entidad() {
    }

	
    public Entidad(String entidad) {
        this.entidad = entidad;
    }
    public Entidad(String entidad, Set poblacions, Set escuelas) {
       this.entidad = entidad;
       this.poblacions = poblacions;
       this.escuelas = escuelas;
    }
   
    public Integer getIdEntidad() {
        return this.idEntidad;
    }
    
    public void setIdEntidad(Integer idEntidad) {
        this.idEntidad = idEntidad;
    }
    public String getEntidad() {
        return this.entidad;
    }
    
    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }
    public Set getPoblacions() {
        return this.poblacions;
    }
    
    public void setPoblacions(Set poblacions) {
        this.poblacions = poblacions;
    }
    public Set getEscuelas() {
        return this.escuelas;
    }
    
    public void setEscuelas(Set escuelas) {
        this.escuelas = escuelas;
    }




}

