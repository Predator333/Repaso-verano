import java.util.Scanner;
public class Ejercicio13 {
Scanner teclado = new Scanner(System.in);
double saldo=0.00;
double cantidad=0.00;
public void operacion(){
    System.out.println("pulse I para ingresar dinero en su saldo o R para reintegrar dinero en su saldo");
    String operacion=teclado.nextLine().toUpperCase();
    if(operacion.equals("I")){
        System.out.println("Ingrese la cantidad a ingresar");
        cantidad=teclado.nextDouble();
        saldo=saldo+cantidad;
        System.out.println("Su saldo es: "+saldo);
    }  else if(operacion.equals("R")){
        System.out.println("Ingrese la cantidad a reintegrar");
        cantidad=teclado.nextDouble();
        saldo=saldo-cantidad;
        System.out.println("Su saldo es: "+saldo);
    } else {
        System.out.println("Error");
    }

}
public static void main(String[] args) {
    Ejercicio13 ejercicio13 = new Ejercicio13();
    ejercicio13.operacion();

}



  }



