package model.pojo;

import java.util.HashSet;
import java.util.Set;

public class Control  implements java.io.Serializable {


     private Integer idControl;
     private String control;
     private Set escuelas = new HashSet(0);

    public Control() {
    }

	
    public Control(String control) {
        this.control = control;
    }
    public Control(String control, Set escuelas) {
       this.control = control;
       this.escuelas = escuelas;
    }
   
    public Integer getIdControl() {
        return this.idControl;
    }
    
    public void setIdControl(Integer idControl) {
        this.idControl = idControl;
    }
    public String getControl() {
        return this.control;
    }
    
    public void setControl(String control) {
        this.control = control;
    }
    public Set getEscuelas() {
        return this.escuelas;
    }
    
    public void setEscuelas(Set escuelas) {
        this.escuelas = escuelas;
    }
}


