package me.dio;

import me.dio.utils.FuncionarioDao;
import me.dio.utils.PedidoDao;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = Gerente.builder()
                .funcionarioDao(new FuncionarioDao())
                .cargo("GERENTE_GERAL")
                .cpf("12121212121")
                .senha("123")
                .nome("Joâo Carlos Alberto")
                .nomeUsuario("user")
                .salario(Double.valueOf("12000.00"))
                .endereco(Endereco
                        .builder()
                        .rua("Rua jose Silverio")
                        .cep("38000100")
                        .bairro("Pacaembu")
                        .cidade("Uberaba")
                        .complemento("casa")
                        .numero(100)
                        .telefone("33333333")
                        .build())
                .build();

        Funcionario funcionario = gerente.criaFuncionario(Funcionario
                .builder()
                .pedidoDao(new PedidoDao())
                .cargo("CHEFE_DE_COZINHA")
                .endereco(Endereco
                .builder()
                .rua("Rua jose Silverio")
                .cep("38000100")
                .bairro("Pacaembu")
                .cidade("Uberaba")
                .complemento("casa")
                .numero(100)
                .telefone("33333333")
                .build()
                )
                .salario(Double.valueOf("7500.00"))
                .nomeUsuario("user_coz")
                .nome("Mario de Andrade")
                .senha("432")
                .cpf("34343434341")
                .build()
        );

        gerente.listaFuncionarios();

        Pedido pedido = funcionario.editarPedidos(Pedido
                .builder()
                        .nfe(new PagamentoNFE())
                .itemPedido(ItemPedido
                        .builder()
                        .quantidade(3)
                        .valor(Double.valueOf("50.00"))
                        .build())
                .build()
        );
    }

}