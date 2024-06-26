package me.dio;

import lombok.experimental.SuperBuilder;
import me.dio.utils.PedidoDao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@SuperBuilder
public class Funcionario extends Pessoa {

    private PedidoDao pedidoDao;
    public void listarPedidos() {

    }

    public Pedido editarPedidos(Pedido pedido) {
        pedido.setId(UUID.randomUUID());
        pedido.setNfe(pedido.getNfe());
        pedido.setDataPedido(LocalDateTime.now());
        pedido.setStatus(Boolean.TRUE);
        pedido.setValorTotal(pedido.getItemPedido().getValor() * pedido.getItemPedido().getValor());
        Pedido pedidoFeito = pedidoDao.criarPedido(pedido);
        pedidoFeito.getNfe().efetuarPagamento(pedidoFeito.getValorTotal(), pedidoFeito.getDataPedido());
        System.out.printf("Pedido do tipo básico com ID %s realizado com sucesso, valor R$%.2f", pedidoFeito.getId(), pedidoFeito.getValorTotal());
        return pedidoFeito;
    }

    @Override
    public String toString() {
        return "Funcionario{} " + super.toString();
    }
}
