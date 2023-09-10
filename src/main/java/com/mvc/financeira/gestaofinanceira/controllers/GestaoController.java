package com.mvc.financeira.gestaofinanceira.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.financeira.gestaofinanceira.models.Gestao;
import com.mvc.financeira.gestaofinanceira.models.TipoDeEntrada;
import com.mvc.financeira.gestaofinanceira.repository.GestaoRepository;
import jakarta.persistence.*;


@Controller
public class GestaoController {
    
    @Autowired
    private GestaoRepository gestaoRepository;

    @Autowired
    private EntityManager entityManager;

    @GetMapping("/")
    public ModelAndView index(){

        List<Gestao> gestoes = this.gestaoRepository.findAll();
        double somaValoresEntrada = calcularSomaValoresEntrada();
        double somaValoresSaida = calcularSomaValoresSaida();
        double subValorTotal = calcularValorTotal();


        ModelAndView mv = new ModelAndView("index");

        mv.addObject("gestoes", gestoes);
        mv.addObject("tipoDeEntrada", TipoDeEntrada.values());
        mv.addObject("somaValoresEntrada", somaValoresEntrada);
        mv.addObject("somaValoresSaida",somaValoresSaida );
        mv.addObject("subValorTotal",subValorTotal );

        return mv;
    }

    @PostMapping("/create")

    public String create(Gestao gestao){


    this.gestaoRepository.save(gestao);


        return "redirect:/";
    }



    @PostMapping("/delete")

    public String delete(@RequestParam Long id){

        Gestao gestao = gestaoRepository.findById(id).orElse(null);

        if(gestao != null){
            this.gestaoRepository.delete(gestao);
        }

        

        return "redirect:/";
    }





    private double calcularSomaValoresEntrada() {
        jakarta.persistence.Query query = entityManager.createQuery("SELECT SUM(valorEntrada) FROM Gestao");
        Double resultado = (Double) query.getSingleResult();
        return resultado != null ? resultado : 0.0;
    }

     private double calcularSomaValoresSaida() {
        jakarta.persistence.Query query = entityManager.createQuery("SELECT SUM(valorSaida) FROM Gestao");
        Double resultado = (Double) query.getSingleResult();
        return resultado != null ? resultado : 0.0;
    }

     private double calcularValorTotal() {
        jakarta.persistence.Query query = entityManager.createQuery("SELECT SUM(valorEntrada- valorSaida) FROM Gestao");
        Double resultado = (Double) query.getSingleResult();
        return resultado != null ? resultado : 0.0;
    }


   

   

    
        }



