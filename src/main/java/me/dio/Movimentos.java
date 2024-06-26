package me.dio;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class Movimentos {

    private LocalDateTime hora;
    private Double valor;
}
