package model.dao;

import java.util.List;
import model.pojo.Poblacion;
import model.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;


public class poblacionDAO {
     public static String poblacionTotal(){
        String s = "0";
        List<Poblacion> lst = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM Poblacion");
            lst = query.list();
            for(int i = 0; i <21; i++){
                lst.remove(i);
            }
            long poblacionHombres = 0;
            long poblacionMujeres = 0;
            for(int i = 0; i < lst.size(); i++){
                poblacionMujeres += lst.get(i).getEdadMujeres();
                poblacionHombres += lst.get(i).getEdadHombres();
            }
            
            s = String.valueOf(poblacionMujeres)+","+String.valueOf(poblacionHombres);
        }catch(Exception e){
            e.printStackTrace();
        }
        return s;
    }

}
