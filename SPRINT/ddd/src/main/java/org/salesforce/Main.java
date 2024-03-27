package org.salesforce;

import org.salesforce.model.pedido.Pedido;
import org.salesforce.service.DataRegional;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Pedido pedido = new Pedido();
        LocalDateTime dataAtual =  LocalDateTime.now();
        DataRegional dataRegional = new DataRegional();


        System.out.println(dataRegional.converterParaFormatoBrasileiro(dataAtual));
    }
}