package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/save")
public class Home {


    @GetMapping()
    public ModelAndView showHome (){
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }


    @PostMapping()
    public ModelAndView updateCustomer(@RequestParam("condiment") String[]condiment){
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("condiment", condiment);
        return modelAndView;
    }

}
