package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ChangeMoneyController {
    @GetMapping(value = "")
    public String homePage() {
        return "index";
    }

    @PostMapping(value = "/chuyendoi")
    public String app(@RequestParam(name = "select") String choice,
                      @RequestParam(name = "money") float value,
                      Model model) {
        String result;
        String donvi = "";
        if (choice.equals ( "usdToVnd" )) {
            result = String.format ( "%.0f", value * 23208 );
            donvi = "VND";
            model.addAttribute ( "result", result + " " + donvi );

        } else {
            result = String.format ( "%.2f", value / 23208f );
            donvi = "USD";
            model.addAttribute ( "result", result + " " + donvi );
        }
        return "index";
    }


}
