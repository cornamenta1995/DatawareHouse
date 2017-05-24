package model.util;

import java.util.List;
import model.pojo.Escuela;

public class Calculadora {
    
    private int totalAlumnosH;
    private int totalAlumnosM;
    private int totalMaestrosH;
    private int totalMaestrosM;
    private int totalEscuela;
    private String nombre;
    private List<Escuela> lst;
    
    public static int tamanioMuestra(int n){
        if(n == 0){
            return 0;
        }else{
            return (1067)/(1+(1066/n));
        }
    }
}
