package me.dio;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class Pessoa {

    private String nome;
    private String cpf;
    private Integer matricula;
    private String nomeUsuario;
    private String cargo;
    private Double salario;
    private Boolean status;
    private String senha;

    private Endereco endereco;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", matricula=" + matricula +
                ", nomeUsuario='" + nomeUsuario + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", status=" + status +
                ", senha='" + senha + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
