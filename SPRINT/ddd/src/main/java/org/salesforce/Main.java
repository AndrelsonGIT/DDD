package org.salesforce;

import org.salesforce.model.pedido.Pedido;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Pedido pedido = new Pedido();
        LocalDateTime dataAtual =  LocalDateTime.now();
        pedido.setDataPedido(dataAtual);
        System.out.println(pedido.getDataPedido());
    }
}