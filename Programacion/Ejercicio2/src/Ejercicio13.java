import java.util.Scanner;
public class Ejercicio13 {
Scanner teclado = new Scanner(System.in);
double saldo_inicial;
double saldo_final;
double cantidad;
public void recogida(){
    System.out.println("Ingrese el valor de saldo inicial: ");
    saldo_inicial = teclado.nextDouble();
    System.out.println("Ingrese el valor de cantidad: ");
    cantidad = teclado.nextDouble();
    System.out.println("Ingrese el valor de saldo final: ");
    saldo_final = teclado.nextDouble();

    }
    public void deduccion(){
  if(saldo_inicial < saldo_final){

  }
    }
}
