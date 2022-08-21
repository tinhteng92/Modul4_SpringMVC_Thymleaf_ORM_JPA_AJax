package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Convert {

    @GetMapping ("/convert")
    public String showConvert(){
        return "convert";
    }

    @PostMapping ("/convert")
    public String convert(@RequestParam float rate, @RequestParam float usd, Model model){
        float result = rate * usd;
        model.addAttribute("result", result);
        return "/convert";
    }
}
