package me.dio;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ItemPedido {

    private Integer quantidade;
    private Double valor;
}
