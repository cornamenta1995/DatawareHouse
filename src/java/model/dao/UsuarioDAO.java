package model.dao;

import java.util.List;
import model.pojo.Usuario;
import model.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;


public class UsuarioDAO {
    public static List<Usuario> buscarUsuario(String correo, String contra){
        List<Usuario> lst = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM Usuario U WHERE U.correo = :email AND U.contra = :contrasenia ");
            query.setParameter("email", correo);
            query.setParameter("contrasenia", contra);
            lst = query.list();
        }catch(Exception e){
            e.printStackTrace();
        }
        return lst;
    }
}
