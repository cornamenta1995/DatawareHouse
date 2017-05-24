package model.dao;

import bean.Coordenada;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.pojo.Escuela;
import model.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

public class EscuelasDAO {
     public static String cuentaTotal(){
        List lst = null;
        String resultado = "0";
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("SELECT count(*) FROM Escuela E");
            lst = query.list();
            resultado = String.valueOf(lst.get(0));
        }catch(Exception e){
            e.printStackTrace();
        }
        return resultado;
    }
        public static List<Escuela> escuelasLst(Integer edo){
        List<Escuela> lst = null;

        try{
            
            Session session = HibernateUtil.getSessionFactory().openSession();
            SQLQuery query = session.createSQLQuery("select * from Escuela where Escuela.Entidad_idEntidad = :estado");
            query.setParameter("estado", edo);
            lst = query.list();

            
        }catch(Exception e){
            e.printStackTrace();
        }
        return lst;
    }
     
    public static int escuelasEstado(Integer edo){
        List lst = null;
        String s = "0";
        int total = 0;
        try{
            
            Session session = HibernateUtil.getSessionFactory().openSession();
            SQLQuery query = session.createSQLQuery("select count(*) from Escuela where Escuela.Entidad_idEntidad = :estado");
            query.setParameter("estado", edo);
            lst = query.list();
            s = String.valueOf(lst.get(0));
            total = Integer.parseInt(s);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return total;
    }
        public static int totalMaestrosMujeres(Integer edo) {
        List lst = null;
        int s = 0;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            SQLQuery query = session.createSQLQuery("select sum(Escuela.Docentes_Mujeres) from Escuela where Escuela.Entidad_idEntidad = :estado");
            query.setParameter("estado", edo);
            lst = query.list();
            s = Integer.parseInt(String.valueOf(lst.get(0)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }
       public static int totalMaestrosHombres(Integer edo) {
        List lst = null;
        int s = 0;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            SQLQuery query = session.createSQLQuery("select sum(Escuela.Docentes_Hombres) from Escuela where Escuela.Entidad_idEntidad = :estado");
            query.setParameter("estado", edo);
            lst = query.list();
            s = Integer.parseInt(String.valueOf(lst.get(0)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }
        

    public static int totalAlumnosMujeres(Integer edo) {
        List lst = null;
        int s = 0;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            SQLQuery query = session.createSQLQuery("select sum(Escuela.Alumnos_Mujeres) from Escuela where Escuela.Entidad_idEntidad = :estado");
            query.setParameter("estado", edo);
            lst = query.list();
            s = Integer.parseInt(String.valueOf(lst.get(0)));
        }catch(Exception e){
            e.printStackTrace();
        }
        return s;
    }
    
    public static int totalAlumnosHombres(Integer edo){
        List lst = null;
        int s = 0;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            SQLQuery query = session.createSQLQuery("select sum(Escuela.Alumnos_Hombres) from Escuela where Escuela.Entidad_idEntidad = :estado");
            query.setParameter("estado", edo);
            lst = query.list();
            s = Integer.parseInt(String.valueOf(lst.get(0)));
        }catch(Exception e){
            e.printStackTrace();
        }
        return s;
    }
    
    public static List<Coordenada> coordenadaEscuela(Integer edo){
        List<String> lst = null;
        List<Coordenada> gps = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            SQLQuery query = session.createSQLQuery("select asText(Escuela.Coordenada_A) from Escuela where Escuela.Entidad_idEntidad = :estado");
            query.setParameter("estado", edo);
            lst = query.list();
            Coordenada[] aux = new Coordenada[lst.size()];
            int i = 0;
                    
            for(String s : lst){
               s = s.substring(6, s.length()-1);
               String arreglo[] = s.split(" ");
               aux[i] = new Coordenada(Float.parseFloat(arreglo[0]),Float.parseFloat(arreglo[1]));
               i++;
            }
   
            gps = new ArrayList<Coordenada>((Arrays.asList(aux)));
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return gps;
    }
}
