package com.github.Eduardo_BGarcia.backend.service;

import org.springframework.stereotype.Service;
import com.github.Eduardo_BGarcia.backend.model.Calculadora;

@Service
public class HelloService {

    public Calculadora somar(Calculadora calculadora) {
        calculadora.setResultado(calculadora.getValor1() + calculadora.getValor2());
        return calculadora;
    }
}
