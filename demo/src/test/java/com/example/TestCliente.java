package com.example;

import com.example.Controller.ControllerCliente;
import com.example.Repositorios.RepoClientes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.mockito.Mockito;

public class TestCliente {
    
    @After
    public void tearDown() {
        RepoClientes.getInstance().getClientes().clear(); ; // Limpia el repositorio de clientes después de cada test
    }
    
    @Test
    public void testRegistrarCliente() {
        // Arrange
        RepoClientes repoClientes = RepoClientes.getInstance();
        ControllerCliente controllerCliente = new ControllerCliente();
        List<Animal> animalesAdoptados = new ArrayList<>();
        Cliente cliente = new Cliente("John", "Doe", "Soltero", "john.doe@example.com",
                "123456789", "Programador", "Perro", animalesAdoptados);

        // Act
        controllerCliente.registrarCliente(cliente.getNombre(), cliente.getApellido(), cliente.getEstadoCivil(),
                cliente.getEmail(), cliente.getTelefono(), cliente.getOcupacion(), cliente.getMascotas(),
                cliente.getAnimalesAdoptados());

        // Assert
        List<Cliente> clientesRegistrados = repoClientes.getClientes();
        assertEquals(1, clientesRegistrados.size());
    }

    @Test
    public void testEliminarCliente() {
        // Crear instancia del RepoClientes
        RepoClientes repoClientes = RepoClientes.getInstance();

        // Crear instancia simulada de RepoClientes utilizando Mockito
        RepoClientes repoClientesMock = Mockito.spy(repoClientes);

        // Crear instancia del ControllerCliente con el RepoClientes simulado
        ControllerCliente controllerCliente = new ControllerCliente();

        Cliente cliente1 = new Cliente("John", "Doe", "Soltero", "john@example.com", "123456789", "Empleado", "Perro", new ArrayList<Animal>());

        // Agregar los clientes utilizando el ControllerCliente
        controllerCliente.registrarCliente("John", "Doe", "Soltero", "john@example.com", "123456789", "Empleado", "Perro", new ArrayList<Animal>());
        controllerCliente.registrarCliente("Jane", "Smith", "Casado", "jane@example.com", "987654321", "Estudiante", "Gato", new ArrayList<Animal>());

        // Eliminar el cliente1
        controllerCliente.eliminarCliente(cliente1);

        // Verificar que el cliente1 fue eliminado correctamente
        List<Cliente> clientesActuales = repoClientesMock.getClientes();
        assertEquals(1, clientesActuales.size());
        assertFalse(clientesActuales.contains(cliente1));
    }
}
