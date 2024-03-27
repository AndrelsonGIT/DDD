package org.salesforce.model.pedido;

import java.time.LocalDateTime;

public class Pedido {
    private int idPedido;

    private int idUsuario;

    private LocalDateTime dataPedido;

    private StatusPedido statusPedido;

    public Pedido() {
    }

    public Pedido(int idPedido, int idUsuario, LocalDateTime dataPedido, StatusPedido statusPedido) {
        this.idPedido = idPedido;
        this.idUsuario = idUsuario;
        this.dataPedido = dataPedido;
        this.statusPedido = statusPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }
}
