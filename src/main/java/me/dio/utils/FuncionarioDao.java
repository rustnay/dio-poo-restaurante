package me.dio.utils;

import me.dio.Funcionario;

import java.util.HashSet;
import java.util.Set;

public class FuncionarioDao {

    private final Set<Funcionario> funcionarios = new HashSet<>();
    private Integer matricula = 0;
    public Funcionario criarFuncionario(Funcionario funcionario) {
        this.matricula ++;
        funcionario.setMatricula(matricula);
        this.funcionarios.add(funcionario);
        return funcionario;
    }

    public Set<Funcionario> recuperarFuncionarios() {
        return this.funcionarios;
    }

    public Funcionario recuperarFuncionario(Integer matricula) {
        return this.funcionarios.stream()
                .filter(f -> f.getMatricula().equals(matricula))
                .findFirst().orElseThrow();
    }
}
