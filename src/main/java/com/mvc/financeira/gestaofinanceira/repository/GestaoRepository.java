package com.mvc.financeira.gestaofinanceira.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mvc.financeira.gestaofinanceira.models.Gestao;


public interface GestaoRepository extends JpaRepository<Gestao, Long> {


    
}
