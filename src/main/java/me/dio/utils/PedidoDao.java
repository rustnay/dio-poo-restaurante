package me.dio.utils;

import me.dio.Pedido;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class PedidoDao {

    private final Set<Pedido> pedidos = new HashSet<>();
    public Pedido criarPedido(Pedido pedido) {

        pedido.setDataPedido(LocalDateTime.now());
        this.pedidos.add(pedido);
        return pedido;
    }

    public Set<Pedido> recuperarPedidos() {
        return this.pedidos;
    }

    public Pedido recuperarPedido(UUID id) {
        return this.pedidos.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst().orElseThrow();
    }
}
