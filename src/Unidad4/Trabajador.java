package Unidad4;

import Unidad4.Persona;

public class Trabajador extends Persona {


    public double sueldo;
    public String puesto;
    public String antiguedad;


    /**
     * Constructor
     * @param nombre
     * @param direccion
     * @param fecha_de_nacimiento
     * @param sexo
     */
    public Trabajador(String nombre, String direccion, String fecha_de_nacimiento, String sexo){
        super(nombre,direccion, fecha_de_nacimiento, sexo);
    }

    @Override
    public String toString() {
        return "Hola soy el trabajador";
    }

    @Override
    public void equals() {
        System.out.println("Hola soy el trabajador usando el metodo equals");

    }

    @Override
    public void imprimir() {
        System.out.println("Hola soy el trabajador usando el metodo imprimir");

    }

    public Trabajador(){}

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }
}
