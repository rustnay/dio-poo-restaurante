package me.dio.utils;

import me.dio.Cliente;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class ClienteDao {


    private final Set<Cliente> clientes = new HashSet<>();
    public Cliente criarCliente(Cliente cliente) {

        cliente.setId(UUID.randomUUID());
        this.clientes.add(cliente);
        return cliente;
    }

    public Set<Cliente> recuperarClientes() {
        return this.clientes;
    }

    public Cliente recuperarClientes(UUID id) {
        return this.clientes.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst().orElseThrow();
    }
}
