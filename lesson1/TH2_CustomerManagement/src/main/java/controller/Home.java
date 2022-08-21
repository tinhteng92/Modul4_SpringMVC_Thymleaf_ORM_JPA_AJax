package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.CrudCustomer;


@Controller
public class Home {
    @Autowired
    CrudCustomer crudCustomer;

    @GetMapping("/home")
    public String showHome (Model model){
        model.addAttribute("customers", crudCustomer.customers);
        return "home";
    }
}
