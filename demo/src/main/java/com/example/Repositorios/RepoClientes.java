package com.example.Repositorios;

import java.util.ArrayList;
import java.util.List;

import com.example.Cliente;

public class RepoClientes {
    private static RepoClientes instancia;
    private List<Cliente> clientes;

    private RepoClientes() {
        clientes = new ArrayList<>();
    }

    public static RepoClientes obtenerInstancia() {
        if (instancia == null) {
            instancia = new RepoClientes();
        }
        return instancia;
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void eliminarCliente(Cliente cliente) {
        RepoClientes repoClientes = RepoClientes.getInstance();
        List<Cliente> clientes = repoClientes.getClientes();
    
        for (Cliente c : clientes) {
            if (c.getNombre().equals(cliente.getNombre()) &&
                c.getApellido().equals(cliente.getApellido()) &&
                c.getEstadoCivil().equals(cliente.getEstadoCivil()) &&
                c.getEmail().equals(cliente.getEmail()) &&
                c.getTelefono().equals(cliente.getTelefono()) &&
                c.getOcupacion().equals(cliente.getOcupacion()) &&
                c.getMascotas().equals(cliente.getMascotas())) {
                clientes.remove(c);
                System.out.println("Cliente eliminado exitosamente.");
                return;
            }
        }
    
        System.out.println("El cliente no existe en la lista.");
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public static RepoClientes getInstance() {
        if (instancia == null) {
            instancia = new RepoClientes();
        }
        return instancia;
    }

    // Otros métodos y funcionalidades relacionadas con la gestión de clientes
}
