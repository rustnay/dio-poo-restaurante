package me.dio;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class Caixa {

    private Double valorReceita;
    private LocalDateTime dataAbertura;
    private LocalDateTime dataFechamento;
}
