package org.salesforce;

import oracle.jdbc.internal.PDBChangeEvent;
import org.salesforce.model.pedido.Pedido;
import org.salesforce.model.pedido.StatusPedido;
import org.salesforce.service.DataRegional;
import org.salesforce.service.PedidoService;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Pedido pedido = new Pedido(1, 1, LocalDateTime.now(), StatusPedido.PENDENTE);
        DataRegional dataRegional = new DataRegional();
        PedidoService pedidoService = new PedidoService(dataRegional);
        pedidoService.inserirPedido(pedido);
    }
}