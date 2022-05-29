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
        model.addAttribute("content", CaesarCipher.getText());
        return "index";
    }

    @PostMapping("/")
    public String postIndex(@RequestParam String text, @RequestParam String confirm, Model model){
        model.addAttribute("text", CaesarCipher.run(text, confirm));
        return "redirect:/";
    }
}
