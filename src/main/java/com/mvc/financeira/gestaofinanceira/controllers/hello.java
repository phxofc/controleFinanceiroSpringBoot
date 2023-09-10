package com.mvc.financeira.gestaofinanceira.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class hello {
    
    @GetMapping("/hello")
    //via spring
    public String helloWord(Model model){

        model.addAttribute("nome","pedro");
        return "helloWord.html"; //spring retorna o html que tá em template
    }

     @GetMapping("/helloTeste")
    //via spring
    public ModelAndView helloTeste(Model model){
        ModelAndView mv = new ModelAndView("helloWord");

        mv.addObject("nome","pedro");
        return mv; //spring retorna o html que tá em template
    }

}
