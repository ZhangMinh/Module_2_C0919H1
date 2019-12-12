package controllers;

import Model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/showform")
    public String showForm(ModelMap model) {
        model.addAttribute ( "employee", new Employee () );
        return "create";
    }

    @PostMapping("/addEmployee")
    public String submitForm(@ModelAttribute("employee") Employee employee, BindingResult result, ModelMap model) {
        if (result.hasErrors ()) {
            return "create";
        }
        model.addAttribute ( "name", employee.getName () );
        model.addAttribute ( "contactNumber", employee.getContactNumber () );
        model.addAttribute ( "id", employee.getId () );
        return "info";
    }
}
