package model.dao;

import java.util.List;
import model.pojo.Entidad;
import model.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;


public class EstadosDAO {
    public static List<Entidad> listaEstados(){
        List<Entidad> lst = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM Entidad E WHERE E.idEntidad !=33 ");
            lst = query.list();
        }catch(Exception e){
            e.printStackTrace();
        }
        return lst;
    }
    public static String nombre(int estado){
        List<Entidad> lst = null;
        String s = "";
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM Entidad e WHERE e.idEntidad = :edo");
            query.setParameter("edo", estado);
            lst = query.list();
            s = lst.get(0).getEntidad();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return s;
    }
}
