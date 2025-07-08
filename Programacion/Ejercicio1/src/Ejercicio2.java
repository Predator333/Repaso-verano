import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int X;
        int Y;
       System.out.println("Ingrese el valor de X: ");
       X = teclado.nextInt();
       System.out.println("Ingrese el valor de Y: ");
       Y = teclado.nextInt();
       int suma = X + Y;
       System.out.println("La suma de X e Y es:  " + suma);
       int resta = X - Y;
       System.out.println("La resta de X e Y es:  " + resta);
       int multiplicacion = X * Y;
      System.out.println("La multiplicacion de X e Y es " + multiplicacion);
      int division = X / Y;
      System.out.println("La division de X e Y es " + division);






    }
}
