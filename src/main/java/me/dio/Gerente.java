package me.dio;

import lombok.experimental.SuperBuilder;
import me.dio.utils.ClienteDao;
import me.dio.utils.FuncionarioDao;

import java.util.Set;

@SuperBuilder
public class Gerente extends Pessoa {

    private FuncionarioDao funcionarioDao;
    private ClienteDao clienteDao;
    public void listaFuncionarios() {
        Set<Funcionario> funcionarios = funcionarioDao.recuperarFuncionarios();
        funcionarios.forEach(System.out::println);
    }

    public void listaCliente() {

        Set<Cliente> clientes = clienteDao.recuperarClientes();
        clientes.forEach(System.out::println);
    }

    public Funcionario criaFuncionario(Funcionario funcionario) {
        Funcionario funcionarioCriado = funcionarioDao.criarFuncionario(funcionario);
        System.out.printf("Funcionário %s e matrícula %s criado com sucesso, pelo gerente %s. \n",
                funcionarioCriado.getNome(),
                funcionarioCriado.getMatricula(),
                this.getNome()
        );

        return funcionario;
    }
}
