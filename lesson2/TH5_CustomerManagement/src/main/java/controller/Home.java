package controller;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CrudCustomer;


@Controller
@RequestMapping("/customers")
public class Home {
    @Autowired
    CrudCustomer crudCustomer;

    @GetMapping()
    public ModelAndView showHome (){
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("customers", crudCustomer.customers);
        return modelAndView;
    }
    @GetMapping("/{id}")
    public ModelAndView showInformation(@PathVariable int id ){
        ModelAndView modelAndView = new ModelAndView("info");
        Customer customer = crudCustomer.findById(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping()
    public String updateCustomer(int id, Customer customer){
        crudCustomer.customers.set(crudCustomer.findById(id).getId(), customer);
        return "redirect:/customers";
    }

}
