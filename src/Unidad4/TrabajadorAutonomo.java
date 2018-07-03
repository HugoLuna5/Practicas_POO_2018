package Unidad4;

public class TrabajadorAutonomo extends Persona {


    public double sueldo;
    public String puesto;
    public String antiguedad;
    public String estado;


    /**
     * Constructor
     * @param nombre
     * @param direccion
     * @param fecha_de_nacimiento
     * @param sexo
     */
    public TrabajadorAutonomo(String nombre, String direccion, String fecha_de_nacimiento, String sexo){
        super(nombre,direccion, fecha_de_nacimiento, sexo);
    }

    @Override
    public String toString() {
        return "Hola soy el trabajador autonomo";
    }

    @Override
    public void equals() {
        System.out.println("Hola soy el trabajador autonomo usando el metodo equals");

    }

    @Override
    public void imprimir() {
        System.out.println("Hola soy el trabajador autonomo usando el metodo imprimir");

    }

    public TrabajadorAutonomo(){}

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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}


