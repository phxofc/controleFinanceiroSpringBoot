package com.mvc.financeira.gestaofinanceira.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Gestao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private float valor;
    @Enumerated(EnumType.STRING)
    private TipoDeEntrada tipo;

    private float valorEntrada;
    private float valorSaida;
    private String descricao;
    private float valorTotal;

    public Gestao() {
    }

    public Gestao(float valor, TipoDeEntrada tipo, float valorEntrada, float valorSaida, String descricao,
            float valorTotal) {
        this.valor = valor;
        this.tipo = tipo;
        updateValoresEntradaSaida();
        this.descricao = descricao;
        this.valorTotal = valorTotal;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
        updateValoresEntradaSaida();

    }

    public TipoDeEntrada getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeEntrada tipo) {
        this.tipo = tipo;
        updateValoresEntradaSaida();

    }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
        
    }

    private void updateValoresEntradaSaida() {
        if (tipo == TipoDeEntrada.ENTRADA) {
            valorEntrada = valor;
            valorSaida = 0.0f; // Ou qualquer valor padrão que você queira para SAIDA
        } else if (tipo == TipoDeEntrada.SAIDA) {
            valorSaida = valor;
            valorEntrada = 0.0f; // Ou qualquer valor padrão que você queira para ENTRADA
        }

    }

    @Override
    public String toString() {
        return "Gestao [id=" + id + ", valor=" + valor + ", tipo=" + tipo + ", valorEntrada=" + valorEntrada
                + ", valorSaida=" + valorSaida + ", descricao=" + descricao + ", valorTotal=" + valorTotal + "]";
    }

}
