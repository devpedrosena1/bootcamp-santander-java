package com.example.pedidos.facade;

/**
 *
 * url swagger <http://localhost:8080/swagger-ui.html>
 * @autor devpedrosena1
 *
 */

import com.example.pedidos.service.EstoqueService;
import com.example.pedidos.service.NotificacaoService;
import com.example.pedidos.strategy.FreteStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PedidoFacade {

    private final EstoqueService estoqueService;
    private final NotificacaoService notificacaoService;
    private final Map<String, FreteStrategy> estrategiasFrete;

    @Autowired
    public PedidoFacade(
            EstoqueService estoqueService,
            NotificacaoService notificacaoService,
            Map<String, FreteStrategy> estrategiasFrete
    ) {
        this.estoqueService = estoqueService;
        this.notificacaoService = notificacaoService;
        this.estrategiasFrete = estrategiasFrete;
    }

    public String realizarPedido(String tipoFrete) {
        estoqueService.reservarItem();

        FreteStrategy frete = estrategiasFrete.get(tipoFrete);
        if (frete == null) return "Frete inválido!";

        double valor = frete.calcular(10.0);
        notificacaoService.enviarConfirmacao();
        return "Pedido realizado! Frete: R$ " + valor;
    }
}
