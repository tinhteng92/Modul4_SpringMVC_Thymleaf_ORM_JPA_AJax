package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.Library;

@Controller
public class Home {

    @Autowired
    Library library;

    @GetMapping("/index")
    public String showDictionary(){
        return "index";
    }

    @PostMapping("/index")
    public String translate (@RequestParam String txtSearch, Model model) {
        String result = library.dictionary.get(txtSearch);
        if (result != null) {
            model.addAttribute("result", result);
        } else {
            model.addAttribute("result", "Not found");
        }
        return "index";
    }

}
