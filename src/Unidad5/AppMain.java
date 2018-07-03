package Unidad5;

import java.util.Scanner;

public class AppMain {




    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);


        try{
            char letra;
            System.out.println("Ingresa una letra");
            letra = t.next().charAt(0);

            opValidation op = new opValidation();

            op.validarLetras(letra);

        }catch (Exception e){
            System.err.println("Error: "+e.getMessage());
        }


    }
}
