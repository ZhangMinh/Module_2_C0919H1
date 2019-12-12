package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.LibraryService;

import java.util.Map;

@Controller
public class dictionaryController {
    LibraryService libraryService = new LibraryService ();

    @GetMapping(value = "")
    public String homePage() {
        return "index";
    }

    @PostMapping(value = "/dictionary")
    public String dictionary(@RequestParam(name = "nhapvao") String value,
                             @RequestParam(name = "choice") String choice,
                             Model model) {
        model.addAttribute ( "result", libraryService.showResult ( choice, value ) );
        return "index";
    }
}
