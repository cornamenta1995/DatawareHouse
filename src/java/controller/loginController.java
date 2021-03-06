package controller;

import java.util.List;
import model.dao.EscuelasDAO;
import model.dao.EstadosDAO;
import model.dao.UsuarioDAO;
import model.dao.poblacionDAO;
import model.pojo.Entidad;
import model.pojo.Usuario;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/principal.htm")
public class loginController {
    
    @RequestMapping(method = RequestMethod.POST)
    public String validar(@RequestParam("txtCorreo") String correo, @RequestParam("txtContra") String contra, Model model){
        if(!correo.trim().isEmpty() && !contra.trim().isEmpty()){
            List<Usuario> dao = UsuarioDAO.buscarUsuario(correo, contra);
            if(!dao.isEmpty()){
                Usuario usuarioTO = dao.get(0);
                    String cuentaTotal = EscuelasDAO.cuentaTotal();
                    List<Entidad> listaEstados = EstadosDAO.listaEstados();
                    int tamanio = tamanioMuestra(Integer.parseInt(cuentaTotal));
                    String poblacion[] = poblacionDAO.poblacionTotal().split(",");
                    
                    model.addAttribute("usuario",usuarioTO);
                    model.addAttribute("listaEstado", listaEstados);
                    model.addAttribute("cuentaEscuela", cuentaTotal);
                    model.addAttribute("muestra",tamanio);
                    model.addAttribute("mujeres", poblacion[0]);
                    model.addAttribute("hombres",poblacion[1]);
              
                if(usuarioTO.getTipoUsuario().getIdtipoUsuario() == 1){
                    return "administrador";
                }else{
                    
                    return "gerente";
                }
            }else{
                return "login";
            }
        }  
        return "login";
  
    }
    private int tamanioMuestra(int n){
        if(n == 0){
            return 0;
        }else{
            return (1067)/(1+(1066/n));
        }    
    }
}
