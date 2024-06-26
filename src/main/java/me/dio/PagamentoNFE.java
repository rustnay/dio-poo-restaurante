package me.dio;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class PagamentoNFE {

    private Double valor;
    private LocalDateTime dataPagamento;
    public void efetuarPagamento(Double valor, LocalDateTime dataPagamento) {
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        System.out.printf("Nota fiscal gerada com sucesso. Valor: R$%.2f \n", valor);

    }
}
