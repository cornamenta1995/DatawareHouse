package model.pojo;
// Generated 22/05/2017 10:06:07 PM by Hibernate Tools 4.3.1



/**
 * UsuarioId generated by hbm2java
 */
public class UsuarioId  implements java.io.Serializable {


     private int idusuario;
     private int tipoUsuario;

    public UsuarioId() {
    }

    public UsuarioId(int idusuario, int tipoUsuario) {
       this.idusuario = idusuario;
       this.tipoUsuario = tipoUsuario;
    }
   
    public int getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    public int getTipoUsuario() {
        return this.tipoUsuario;
    }
    
    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UsuarioId) ) return false;
		 UsuarioId castOther = ( UsuarioId ) other; 
         
		 return (this.getIdusuario()==castOther.getIdusuario())
 && (this.getTipoUsuario()==castOther.getTipoUsuario());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdusuario();
         result = 37 * result + this.getTipoUsuario();
         return result;
   }   


}

