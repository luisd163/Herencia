package co.edu.uniquindio.poo;

import model.EmpleadoTiempoCompleto;
import model.Empresa;
import model.EmpleadoFreelance;
import model.EmpleadoPorHora;

public class App {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("UQ");
        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("Jose", "12132", 1000000);
        EmpleadoPorHora empleado2 = new EmpleadoPorHora("Juan", "7980", 80, 15000);
        EmpleadoFreelance empleado3 = new EmpleadoFreelance("Josue", "09876", 2, 1000000);

        empresa.crearEmpleadoTiempoCompleto(empleado1);
        empresa.crearEmpleadoPorHora(empleado2);
        empresa.crearEmpleadoFreelance(empleado3);

        empleado1.calcularSalario();
        empleado2.calcularSalario();
        empleado3.calcularSalario();
        
    }
}
