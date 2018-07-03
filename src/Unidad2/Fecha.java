package Unidad2;

public class Fecha {


    public int mes;
    public int dia;
    public int año;


    public Fecha() {
    }

    public Fecha(int mes, int dia, int año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }


    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }


    public void setDia(int nuevoDia) {
        dia = nuevoDia;
    }

    public void setMes(int nuevoMes) {
        mes = nuevoMes;
    }

    public void setAño(int nuevoAño) {
        año = nuevoAño;
    }


    public void reiniciar(int d, int m, int a) {
        dia = d;
        mes = m;
        año = a;

    }


    public void adelantar(int d, int m, int a) {
        dia = d;
        mes = m;
        año = a;
    }


    public void normalizar() {

        if (1 <= año && 12 <= mes && dia <=validarDias(dia)) {

        }

    }

    public int validarDias(int numMes) {

        int numDias = 0;
        switch (numMes) {
            case 1:
                numDias = 31;
                break;
            case 2:
                numDias = 28;
                break;
            case 3:
                numDias = 31;
                break;
            case 4:
                numDias = 30;
                break;
            case 5:
                numDias = 31;
                break;
            case 6:
                numDias = 30;
                break;
            case 7:
                numDias = 31;
                break;
            case 8:
                numDias = 31;
                break;
            case 9:
                numDias = 30;
                break;
            case 10:
                numDias = 31;
                break;
            case 11:
                numDias = 30;
                break;
            case 12:
                numDias = 31;
                break;
        }


        return numDias;
    }


    public void imprimir() {
        System.out.printf("%d/%d/%d", dia, mes, año);
    }

}