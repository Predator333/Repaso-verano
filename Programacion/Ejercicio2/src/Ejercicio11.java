import java.util.Scanner;

public class Ejercicio11 {
    Scanner teclado = new Scanner(System.in);
    int lectura_anterior;
    int lectura_actual;

    public void guardar(){
    System.out.println(" Calcule el numero de la anterior lectura: ");
    lectura_anterior = teclado.nextInt();
    System.out.println(" Calcule el numero de la lectura actual: ");
    lectura_actual = teclado.nextInt();
    }

    public void progreso(){
        double importe;
        int diferencia=lectura_actual-lectura_anterior;
        if(diferencia==0){
            importe=0.60;

        }
        else if(diferencia<=100){
            importe=0.60 + (diferencia*0.30);
        }
        else if(diferencia<=250){
            importe=0.60 + (100-diferencia*0.30) + (diferencia*0.20);
        }
        else{
           importe=0.60  + (100-diferencia*0.30) + (250-diferencia*0.20) + (diferencia*0.15) ;
        }
        System.out.println(importe);


    }
    public static void main(String[] args) {
        Ejercicio11 ejercicio11 = new Ejercicio11();
        ejercicio11.guardar();
        ejercicio11.progreso();

    }


    }















