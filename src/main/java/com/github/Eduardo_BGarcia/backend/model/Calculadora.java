package com.github.Eduardo_BGarcia.backend.model;

import lombok.Data;

@Data
public class Calculadora {
    private Integer valor1;
    private Integer valor2;
    private Integer resultado;

    Calculadora(){

    }

    Calculadora(Integer valor1, Integer valor2, Integer resultado){
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado = resultado;
    }
}
