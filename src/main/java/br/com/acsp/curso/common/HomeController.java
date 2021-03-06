package br.com.acsp.curso.common;

import br.com.acsp.curso.domain.agenda.Agenda;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: Christian Reichel Date: 8/18/13 Time: 10:44 AM
 */
@Controller
public class HomeController extends AbstractController {

    @ModelAttribute("agenda")
    public Agenda getAgenda() {
        return new Agenda();
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(ModelMap map) {
        map.put("homeMenu", "active");
        return "home";
    }

    @RequestMapping(value = "/sobre", method = RequestMethod.GET)
    public String sobre(ModelMap map) {
        map.put("homeMenu", "active");
        return "sobre";
    }

}
