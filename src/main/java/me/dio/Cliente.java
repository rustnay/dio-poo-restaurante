package me.dio;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Cliente {

    private UUID id;
    private Endereco endereco;
}
