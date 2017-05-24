package controller;

import java.util.List;
import model.dao.EscuelasDAO;
import model.dao.EstadosDAO;
import model.pojo.Escuela;
import model.util.Calculadora;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/estadistica.htm")
public class estadisticaController {
    @RequestMapping(method = RequestMethod.POST)
    public String validar(@RequestParam("edo") String edo, Model model){
        Integer e = Integer.valueOf(edo);
        
        int total = EscuelasDAO.escuelasEstado(e);
        String nombreEdo = EstadosDAO.nombre(e);
        List<String> coordenada = EscuelasDAO.coordenadaEscuela(e);
        
        int alumnoH = EscuelasDAO.totalAlumnosHombres(e);
        int alumnoM = EscuelasDAO.totalAlumnosMujeres(e);
        int maestroH = EscuelasDAO.totalMaestrosHombres(e);
        int maestroM = EscuelasDAO.totalMaestrosMujeres(e);
        List<Escuela>lst = EscuelasDAO.escuelasLst(e);
                
        
        model.addAttribute("alumnoH", alumnoH);
        model.addAttribute("alumnoM", alumnoM);
        model.addAttribute("maestrosH", maestroH);
        model.addAttribute("maestrosM", maestroM);
        model.addAttribute("total",total);
        model.addAttribute("nombreEdo",nombreEdo);
        model.addAttribute("gps",coordenada);
        
        return "estadisticas";
    }
}
