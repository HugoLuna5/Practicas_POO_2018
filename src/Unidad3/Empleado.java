package Unidad3;

public class Empleado extends Persona{


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
    public Empleado(String nombre, String direccion, String fecha_de_nacimiento, String sexo){
        super(nombre,direccion, fecha_de_nacimiento, sexo);
    }
    public Empleado(){}

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
