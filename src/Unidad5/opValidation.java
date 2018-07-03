package Unidad5;


import java.util.regex.Pattern;

public class opValidation {

    public opValidation() {
    }




    public void validarLetras(char letra){

        try{

            this.valLetra(letra);
            this.valLetraChar(letra);

            System.out.println("Caracter ingresado correctamente");

        }catch(Excepcion excepcion){
            System.err.println(""+excepcion.getMessage());
        }


    }



    public void valLetra(char letra)throws Excepcion{
        boolean l = Pattern.matches("^[a-zA-Z]*$", String.valueOf(letra));
        if(!l){
            throw new Excepcion("El dato ingresado no es una letra.\nIngresa una letra en MAYUSCULA");

        }


    }
    public void valLetraChar(char letra)throws Excepcion{

        String letraS= String.valueOf(letra).toLowerCase();//guarda la letra en mayuscula
        String letraS2 = String.valueOf(letra);//guarda la letra como la ingreso el usuario


        if (letraS.equals(letraS2)){
            throw new Excepcion("El caracter ingresado esta en miniscula.\nDebe ser ingresado en MAYUSCULA");

        }


    }



}
