package com.example.Controller;

import java.util.List;

import com.example.Animal;
import com.example.Cliente;
import com.example.Repositorios.RepoClientes;


public class ControllerCliente {
    private RepoClientes repoClientes;

    public ControllerCliente() {
        repoClientes = RepoClientes.obtenerInstancia();
    }

    public void registrarCliente(String nombre, String apellido, String estadoCivil, String email,
                             String telefono, String ocupacion, String mascotas,
                             List<Animal> animalesAdoptados) {

        Cliente cliente = new Cliente(nombre, apellido, estadoCivil, email, telefono, ocupacion, mascotas, animalesAdoptados);
        repoClientes.agregarCliente(cliente);

        System.out.println("Cliente registrado exitosamente.");
    }

    public void actualizarCliente(Cliente cliente) {
        // Lógica para actualizar el cliente en el repositorio
        System.out.println("Cliente actualizado exitosamente.");
    }

    public void eliminarCliente(Cliente cliente) {
        // Lógica para eliminar el cliente del repositorio
        repoClientes.eliminarCliente(cliente);
        System.out.println("Cliente eliminado exitosamente.");
    }

    public List<Cliente> getClientes() {
        return repoClientes.getClientes();
    }
}
