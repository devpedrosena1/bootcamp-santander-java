package com.example.pedidos.controller;

import com.example.pedidos.facade.PedidoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoFacade pedidoFacade;

    @GetMapping
    public String fazerPedido(@RequestParam String tipoFrete) {
        return pedidoFacade.realizarPedido(tipoFrete);
    }
}
