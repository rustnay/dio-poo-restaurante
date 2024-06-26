package me.dio;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Produto {

    private Double peso;
    private Integer quantidade;
    private String nome;
    private Double valor;
    private String descricao;
}
