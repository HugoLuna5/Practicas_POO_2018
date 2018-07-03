package Unidad2;

public class Test {
    public static void main(String[] args) {
        Fecha f;
        f = new Fecha();
        f.dia = 12;
        f.mes = 5;
        f.año = 2018;

        System.out.printf("Hoy es día: %d/%d/%d",f.dia, f.mes, f.año);
    }
}
