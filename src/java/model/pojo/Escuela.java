package model.pojo;
import java.io.Serializable;

public class Escuela  implements java.io.Serializable {


     private EscuelaId id;
     private Control control;
     private Entidad entidad;
     private NivelEducativo nivelEducativo;
     private String centroEducativo;
     private String domicilio;
     private Integer totalDocentes;
     private Integer docentesMujeres;
     private Integer docentesHombres;
     private Integer totalAlumnos;
     private Integer alumnosMujeres;
     private Integer alumnosHombres;
     private Serializable coordenadaA;

    public Escuela() {
    }

	
    public Escuela(EscuelaId id, Control control, Entidad entidad, NivelEducativo nivelEducativo, Serializable coordenadaA) {
        this.id = id;
        this.control = control;
        this.entidad = entidad;
        this.nivelEducativo = nivelEducativo;
        this.coordenadaA = coordenadaA;
    }
    public Escuela(EscuelaId id, Control control, Entidad entidad, NivelEducativo nivelEducativo, String centroEducativo, String domicilio, Integer totalDocentes, Integer docentesMujeres, Integer docentesHombres, Integer totalAlumnos, Integer alumnosMujeres, Integer alumnosHombres, Serializable coordenadaA) {
       this.id = id;
       this.control = control;
       this.entidad = entidad;
       this.nivelEducativo = nivelEducativo;
       this.centroEducativo = centroEducativo;
       this.domicilio = domicilio;
       this.totalDocentes = totalDocentes;
       this.docentesMujeres = docentesMujeres;
       this.docentesHombres = docentesHombres;
       this.totalAlumnos = totalAlumnos;
       this.alumnosMujeres = alumnosMujeres;
       this.alumnosHombres = alumnosHombres;
       this.coordenadaA = coordenadaA;
    }
   
    public EscuelaId getId() {
        return this.id;
    }
    
    public void setId(EscuelaId id) {
        this.id = id;
    }
    public Control getControl() {
        return this.control;
    }
    
    public void setControl(Control control) {
        this.control = control;
    }
    public Entidad getEntidad() {
        return this.entidad;
    }
    
    public void setEntidad(Entidad entidad) {
        this.entidad = entidad;
    }
    public NivelEducativo getNivelEducativo() {
        return this.nivelEducativo;
    }
    
    public void setNivelEducativo(NivelEducativo nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }
    public String getCentroEducativo() {
        return this.centroEducativo;
    }
    
    public void setCentroEducativo(String centroEducativo) {
        this.centroEducativo = centroEducativo;
    }
    public String getDomicilio() {
        return this.domicilio;
    }
    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public Integer getTotalDocentes() {
        return this.totalDocentes;
    }
    
    public void setTotalDocentes(Integer totalDocentes) {
        this.totalDocentes = totalDocentes;
    }
    public Integer getDocentesMujeres() {
        return this.docentesMujeres;
    }
    
    public void setDocentesMujeres(Integer docentesMujeres) {
        this.docentesMujeres = docentesMujeres;
    }
    public Integer getDocentesHombres() {
        return this.docentesHombres;
    }
    
    public void setDocentesHombres(Integer docentesHombres) {
        this.docentesHombres = docentesHombres;
    }
    public Integer getTotalAlumnos() {
        return this.totalAlumnos;
    }
    
    public void setTotalAlumnos(Integer totalAlumnos) {
        this.totalAlumnos = totalAlumnos;
    }
    public Integer getAlumnosMujeres() {
        return this.alumnosMujeres;
    }
    
    public void setAlumnosMujeres(Integer alumnosMujeres) {
        this.alumnosMujeres = alumnosMujeres;
    }
    public Integer getAlumnosHombres() {
        return this.alumnosHombres;
    }
    
    public void setAlumnosHombres(Integer alumnosHombres) {
        this.alumnosHombres = alumnosHombres;
    }
    public Serializable getCoordenadaA() {
        return this.coordenadaA;
    }
    
    public void setCoordenadaA(Serializable coordenadaA) {
        this.coordenadaA = coordenadaA;
    }




}


