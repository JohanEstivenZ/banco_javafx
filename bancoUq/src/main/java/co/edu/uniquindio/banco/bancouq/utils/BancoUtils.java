package co.edu.uniquindio.banco.bancouq.utils;

import co.edu.uniquindio.banco.bancouq.model.Banco;
import co.edu.uniquindio.banco.bancouq.model.Cliente;
import co.edu.uniquindio.banco.bancouq.model.Empleado;

public class BancoUtils {

    public static Banco inicializarDatos() {
        Banco banco = new Banco();

        Cliente cliente = new Cliente();
        cliente.setNombre("juan");
        cliente.setApellido("arias");
        cliente.setCedula("125454");
        cliente.setDireccion("Armenia");
        cliente.setCorreo("uni1@");
        cliente.setFechaNacimiento("12454");
        cliente.setTelefono("125444");
        banco.getListaClientes().add(cliente);

        cliente = new Cliente();
        cliente.setNombre("Pedro");
        cliente.setApellido("Perez");
        cliente.setCedula("77787");
        cliente.setDireccion("Pererira");
        cliente.setCorreo("uni2@");
        cliente.setFechaNacimiento("12454");
        cliente.setTelefono("125444");
        banco.getListaClientes().add(cliente);

        cliente = new Cliente();
        cliente.setNombre("Alberto");
        cliente.setApellido("Arias");
        cliente.setCedula("12555");
        cliente.setDireccion("Pererira");
        cliente.setCorreo("uni3@");
        cliente.setFechaNacimiento("12454");
        cliente.setTelefono("125444");
        banco.getListaClientes().add(cliente);


        Empleado empleado = new Empleado();
        empleado.setNombre("juan");
        empleado.setApellido("arias");
        empleado.setCedula("125454");
        empleado.setFechaNacimiento("12454");
        banco.getListaEmpleados().add(empleado);

        empleado = new Empleado();
        empleado.setNombre("Ana");
        empleado.setApellido("alzate");
        empleado.setCedula("125454");
        empleado.setFechaNacimiento("12454");
        banco.getListaEmpleados().add(empleado);

        empleado = new Empleado();
        empleado.setNombre("Pedro");
        empleado.setApellido("perez");
        empleado.setCedula("125454");
        empleado.setFechaNacimiento("12454");
        banco.getListaEmpleados().add(empleado);
        System.out.println("Información del banco creada");
        return banco;
    }
}
