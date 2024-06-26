package me.dio;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
public class Pedido {

    private UUID id;
    private LocalDateTime dataPedido;
    private Boolean status;
    private ItemPedido itemPedido;
    private Double valorTotal;
    private PagamentoNFE nfe;

    public void statusPedido() {

    }

}
