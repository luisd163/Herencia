package model;

import java.util.LinkedList;

public class Empresa {

    String nombre;
    LinkedList<Empleado> listaEmpleados;
    LinkedList<EmpleadoFreelance> listaEmpleadoFreelance;
    LinkedList<EmpleadoPorHora> listaEmpleadoPorHora;
    LinkedList<EmpleadoTiempoCompleto> listaEmpleadoTiempoCompleto;

    public Empresa (String nombre) {
        this.nombre = nombre;
        listaEmpleados = new LinkedList<>();
        listaEmpleadoFreelance = new LinkedList<>();
        listaEmpleadoPorHora= new LinkedList<>();
        listaEmpleadoTiempoCompleto = new LinkedList<>();

    }

        // Métodos //


    /**
     * Método que crea un empleado freelance
     * @param empleado empleado a crear
     * @return false si no se pudo crear, true si se creo correctamente
     */
    public boolean crearEmpleadoFreelance(EmpleadoFreelance empleado) {
        for (EmpleadoFreelance empleadoAux : listaEmpleadoFreelance) {
            if (empleadoAux != null) {
                if (empleadoAux.getIdentificacion().equals(empleado.getIdentificacion())) {
                    System.out.println("\nEl empleado ya esta registrado");
                    return false;
                }
            }
        }
        listaEmpleadoFreelance.add(empleado);
        System.out.println("\nEmpleado creado exitosamente");
        return true;
    }

    /**
     * Método que elimina un empleado freelance
     * @param empleado empleado a eliminar
     * @return false si no se pudo eliminar, true si se elimino correctamente
     */
    public boolean eliminarEmpleadoFreelance(EmpleadoFreelance empleado) {
        for (EmpleadoFreelance empleadoAux : listaEmpleadoFreelance) {
            if (empleadoAux != null) {
                if (empleadoAux.getIdentificacion().equals(empleado.getIdentificacion())) {
                    listaEmpleadoFreelance.remove(empleado);
                    System.out.println("\nEmpleado eliminado correctamente");
                    return true;
                }
            }
        }
        System.out.println("\nEl empleado ingresado no existe");
        return false;
    }

    /**
     * Método que actualiza un empleado freelance
     * @param nombre
     * @param identificacion
     * @param proyectosCompletados
     * @param pagoPorProyecto
     * @return false si no se pudo actualizar, true si se pudo actualizar
     */
    public boolean actualizarEmpleadoFreelance(String nombre, String identificacion, int proyectosCompletados, double pagoPorProyecto) {
        for (EmpleadoFreelance empleadoAux : listaEmpleadoFreelance) {
            if (empleadoAux != null) {
                if (empleadoAux.getIdentificacion().equals(identificacion)) {
                    empleadoAux.setIdentificacion(identificacion);
                    empleadoAux.setNombre(nombre);
                    empleadoAux.setPagoPorProyecto(pagoPorProyecto);
                    empleadoAux.setProyectosCompletados(proyectosCompletados);
                    System.out.println("\nEmpleado actualizado correctamente");
                    return true;
                }
            }
        }
        System.out.println("\nEl empleado ingresado no existe");
        return false;
    }


    /**
     * Método que crea un empleado por hora
     * @param empleado empleado a crear
     * @return false si no se pudo crear, true si se creo correctamente
     */
    public boolean crearEmpleadoPorHora(EmpleadoPorHora empleado) {
        for (EmpleadoPorHora empleadoAux : listaEmpleadoPorHora) {
            if (empleadoAux != null) {
                if (empleadoAux.getIdentificacion().equals(empleado.getIdentificacion())) {
                    System.out.println("\nEl empleado ya esta registrado");
                    return false;
                }
            }
        }
        listaEmpleadoPorHora.add(empleado);
        System.out.println("\nEmpleado creado exitosamente");
        return true;
    }

    /**
     * Método que elimina un empleado Por hora
     * @param empleado empleado a eliminar
     * @return false si no se pudo eliminar, true si se elimino correctamente
     */
    public boolean eliminarEmpleadoPorHora(EmpleadoPorHora empleado) {
        for (EmpleadoPorHora empleadoAux : listaEmpleadoPorHora) {
            if (empleadoAux != null) {
                if (empleadoAux.getIdentificacion().equals(empleado.getIdentificacion())) {
                    listaEmpleadoPorHora.remove(empleado);
                    System.out.println("\nEmpleado eliminado correctamente");
                    return true;
                }
            }
        }
        System.out.println("\nEl empleado ingresado no existe");
        return false;
    }

    /**
     * Método que actualiza un empleado por hora
     * @param nombre
     * @param identificacion
     * @param horasTrabajadas
     * @param salarioPorHora
     * @return false si no se pudo actualizar, true si se pudo actualizar
     */
    public boolean actualizarEmpleadoPorHora(String nombre, String identificacion, int horasTrabajadas, double salarioPorHora) {
        for (EmpleadoPorHora empleadoAux : listaEmpleadoPorHora) {
            if (empleadoAux != null) {
                if (empleadoAux.getIdentificacion().equals(identificacion)) {
                    empleadoAux.setIdentificacion(identificacion);
                    empleadoAux.setNombre(nombre);
                    empleadoAux.setHorasTrabajadas(horasTrabajadas);
                    empleadoAux.setSalarioPorHora(salarioPorHora);
                    System.out.println("\nEmpleado actualizado correctamente");
                    return true;
                }
            }
        }
        System.out.println("\nEl empleado ingresado no existe");
        return false;
    }

    /**
     * Método que crea un empleado tiempo completo
     * @param empleado empleado a crear
     * @return false si no se pudo crear, true si se creo correctamente
     */
    public boolean crearEmpleadoTiempoCompleto(EmpleadoTiempoCompleto empleado) {
        for (EmpleadoTiempoCompleto empleadoAux : listaEmpleadoTiempoCompleto) {
            if (empleadoAux != null) {
                if (empleadoAux.getIdentificacion().equals(empleado.getIdentificacion())) {
                    System.out.println("\nEl empleado ya esta registrado");
                    return false;
                }
            }
        }
        listaEmpleadoTiempoCompleto.add(empleado);
        System.out.println("\nEmpleado creado exitosamente");
        return true;
    }

    /**
     * Método que elimina un empleado tiempo completo
     * @param empleado empleado a eliminar
     * @return false si no se pudo eliminar, true si se elimino correctamente
     */
    public boolean eliminarEmpleadoTiempoCompleto(EmpleadoTiempoCompleto empleado) {
        for (EmpleadoTiempoCompleto empleadoAux : listaEmpleadoTiempoCompleto) {
            if (empleadoAux != null) {
                if (empleadoAux.getIdentificacion().equals(empleado.getIdentificacion())) {
                    listaEmpleadoTiempoCompleto.remove(empleado);
                    System.out.println("\nEmpleado eliminado correctamente");
                    return true;
                }
            }
        }
        System.out.println("\nEl empleado ingresado no existe");
        return false;
    }

    /**
     * Método que actualiza un empleado a tiempo completo
     * @param nombre
     * @param identificacion
     * @param salarioMensual
     * @return false si no se pudo actualizar, true si se pudo actualizar
     */
    public boolean actualizarEmpleadoTiempoCompleto(String nombre, String identificacion, double salarioMensual) {
        for (EmpleadoTiempoCompleto empleadoAux : listaEmpleadoTiempoCompleto) {
            if (empleadoAux != null) {
                if (empleadoAux.getIdentificacion().equals(identificacion)) {
                    empleadoAux.setIdentificacion(identificacion);
                    empleadoAux.setNombre(nombre);
                    empleadoAux.setSalarioMensual(salarioMensual);
                    System.out.println("\nEmpleado actualizado correctamente");
                    return true;
                }
            }
        }
        System.out.println("\nEl empleado ingresado no existe");
        return false;
    }

}
