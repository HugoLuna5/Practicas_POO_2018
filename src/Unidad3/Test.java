package Unidad3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test {

    public static Scanner t;


    public static ArrayList<Estudiante> stud = new ArrayList<>();
    public static ArrayList<Empleado> uspe = new ArrayList<>();


    public static void main(String[] args) {

        t = new Scanner(System.in);

        try {

            System.out.println("Ingrese el tipo de persona que quiere registrar: \n 1)Estudiante \n2)Empleado \n3)Estudiante - Empleado ");
            int resp = t.nextInt();
            System.out.println("¿Cuantas personas desea agregar?");
            int result = t.nextInt();


            switch (resp) {
                case 1:
                    for (int i = 0; i < result; i++) {
                        addEstudiante();

                    }
                    break;
                case 2:
                    for (int i = 0; i < result; i++) {
                        addEmpleado();

                    }

                    break;
                case 3:
                    for (int i = 0; i < result; i++) {
                        addEstudiante();
                        addEmpleado();

                    }
                    break;
            }
            show();
            showEmpleado();


        } catch (Exception e) {
            System.err.println("Ocurrio un error: " + e.getMessage());
        }

    }


    public static void addEstudiante() {

        Estudiante estudiante = new Estudiante();


        System.out.println("Ingresa el nombre del estudiante");
        estudiante.setNombre(t.nextLine());
        System.out.println("Ingresa la direccion del estudiante");
        estudiante.setDireccion(t.nextLine());
        System.out.println("Ingresa la fecha de nacimiento del estudiante");
        estudiante.setFecha_de_nacimiento(t.nextLine());
        System.out.println("Ingresa el sexo del estudiante");
        estudiante.setSexo(t.nextLine());
        System.out.println("Ingresa el grupo del estudiante");
        estudiante.setGrupo(t.next().charAt(0));
        System.out.println("Ingresa el numero de control del estudiante");
        estudiante.setNumControl(t.nextLine());

        stud.add(estudiante);

    }

    public static void addEmpleado() {
        Empleado empleado = new Empleado();



            System.out.println("Ingresa el nombre del empleado");
            empleado.setNombre(t.nextLine());
            System.out.println("Ingresa la direccion del empleado");
            empleado.setDireccion(t.nextLine());
            System.out.println("Ingresa la fecha de nacimiento del empleado");
            empleado.setFecha_de_nacimiento(t.nextLine());
            System.out.println("Ingresa el sexo del empleado");
            empleado.setSexo(t.nextLine());
            System.out.println("Ingresa el sueldo del empleado");
            empleado.setSueldo(t.nextDouble());
            System.out.println("Ingresa el puesto del empleado");
            empleado.setPuesto(t.nextLine());
            System.out.println("Ingresa la antiguedad del empleado");
            empleado.setAntiguedad(t.nextLine());

            uspe.add(empleado);

    }

    public static void show(){

        Collections.sort(stud, new Comparator<Estudiante>() {
            public int compare(Estudiante obj1, Estudiante obj2) {
                return obj1.getNombre().compareTo(obj2.getNombre());
            }
        });

        for(Estudiante temp: stud){
            System.out.println(temp.getNombre());
        }
    }

    public static void showEmpleado(){

        Collections.sort(uspe, new Comparator<Empleado>() {
            public int compare(Empleado obj1, Empleado obj2) {
                return obj1.getNombre().compareTo(obj2.getNombre());
            }
        });

        for(Empleado temp: uspe){
            System.out.println(temp.getNombre());
        }
    }
}
