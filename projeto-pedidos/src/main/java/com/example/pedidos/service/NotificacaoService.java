package com.example.pedidos.service;

import org.springframework.stereotype.Service;

@Service
public class NotificacaoService {

    public void enviarConfirmacao() {
        System.out.println("Notificação enviada com sucesso!");
    }

}
