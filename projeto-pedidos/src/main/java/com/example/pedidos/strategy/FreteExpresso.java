package com.example.pedidos.strategy;

import org.springframework.stereotype.Component;

@Component("freteExpresso")
public class FreteExpresso implements FreteStrategy {

    @Override
    public double calcular(double peso) {
        return peso * 3.0;
    }

}
