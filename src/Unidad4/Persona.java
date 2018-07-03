package Unidad4;

public abstract class Persona {

    public String nombre;
    public String direccion;
    public String fecha_de_nacimiento;
    public String sexo;



    public Persona() {
    }

    public Persona(String nombre, String direccion, String fecha_de_nacimiento, String sexo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public abstract String toString();

    public abstract void equals();
    public abstract void imprimir();

}
