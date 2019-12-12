package controllers;

import models.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute ( "login",new Login () );
//        ModelAndView modelAndView = new ModelAndView ( "home", "login", new Login () );
        return "home";
    }
}



