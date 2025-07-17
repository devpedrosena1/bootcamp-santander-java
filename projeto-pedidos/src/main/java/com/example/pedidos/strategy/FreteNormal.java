package com.example.pedidos.strategy;

import org.springframework.stereotype.Component;

@Component("freteNormal")
public class FreteNormal implements FreteStrategy {

    @Override
    public double calcular(double peso) {
        return peso * 1.5;
    }

}
