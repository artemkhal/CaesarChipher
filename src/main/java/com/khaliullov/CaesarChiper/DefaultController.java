package com.khaliullov.CaesarChiper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DefaultController {

    @GetMapping("/")
    public String index(Model model){
        return "index";
    }

    @PostMapping("/")
    public String postIndex(@RequestParam String text, @RequestParam boolean flag, Model model){
        model.addAttribute("code", CaesarCipher.run(text, flag));
        return "index";
    }
}
