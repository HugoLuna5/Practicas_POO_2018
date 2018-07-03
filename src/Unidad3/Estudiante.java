package Unidad3;

public class Estudiante extends Persona {


    private char grupo;
    private String numControl;

    /**
     * Constructor
     * @param nombre
     * @param direccion
     * @param fecha_de_nacimiento
     * @param sexo
     */
    public Estudiante(String nombre, String direccion, String fecha_de_nacimiento, String sexo){
        super(nombre,direccion, fecha_de_nacimiento, sexo);
    }

    public Estudiante()
    {}

    /**
     * Metodos de la clase
     */


    /**
     * Getter grupo
     * @return
     */
    public char getGrupo() {
        return grupo;
    }


    /**
     * setter grupo
     * @param grupo
     */
    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }


    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }
}
