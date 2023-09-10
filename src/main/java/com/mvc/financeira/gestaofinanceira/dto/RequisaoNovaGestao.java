package com.mvc.financeira.gestaofinanceira.dto;

import com.mvc.financeira.gestaofinanceira.models.Gestao;
import com.mvc.financeira.gestaofinanceira.models.TipoDeEntrada;

//classe DTO
public class RequisaoNovaGestao {

    private float valorEntrada;
    private float valorSaida;
    private float valorTotal;
    private String descricao;
    private TipoDeEntrada tipo;

    public float getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(float valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public float getValorSaida() {
        return valorSaida;
    }

    public void setValorSaida(float valorSaida) {
        this.valorSaida = valorSaida;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoDeEntrada getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeEntrada tipo) {
        this.tipo = tipo;
    }

    public Gestao toGestao() {
        Gestao gestao = new Gestao();

        gestao.setValorEntrada(this.valorEntrada);

        gestao.setValorSaida(this.valorSaida);

        gestao.setValorTotal(this.valorTotal);

        gestao.setDescricao(this.descricao);

        return gestao;

    }

    @Override
    public String toString() {
        return "RequisaoNovaGestao [valorEntrada=" + valorEntrada + ", valorSaida=" + valorSaida + ", valorTotal="
                + valorTotal + ", descricao=" + descricao + ", tipo=" + tipo + "]";
    }

}
