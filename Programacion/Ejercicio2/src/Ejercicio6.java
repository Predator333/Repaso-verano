/*
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese un numero: ");
        num1 = teclado.nextInt();
        if(num1>100&&num1<1000){
            System.out.println("El numero mayor que 100");
            int centenas = num1 / 100;
            int decenas=  ( num1/ 10) % 10;
            int unidades = num1 % 10;
            System.out.println("Centena: " + centenas);
            System.out.println("Decena: " + decenas);
            System.out.println("Unidad: " + unidades);
        }
        else{
            System.out.println("El numero es mayor que 1000 y menor que 100");

        }
    }
}
*/
import java.util.Scanner;
public class Ejercicio6 {
    Scanner teclado = new Scanner(System.in);
    int numero1;
    public void base(){
        System.out.print("Ingrese un numero: ");
        numero1 = teclado.nextInt();
    }
    public void almacen(){
        if(numero1>100&&numero1<1000){
            System.out.println("El numero mayor que 100");
            int centenas = numero1 / 100;
            int decenas=  ( numero1/ 10) % 10;
            int unidades = numero1 % 10;
            System.out.println("Centena: " + centenas);
            System.out.println("Decena: " + decenas);
            System.out.println("Unidad: " + unidades);
        }
        else{
            System.out.println("El numero es mayor que 1000 y menor que 100");

        }
    }
    public static void main(String[] args) {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        ejercicio6.base();
        ejercicio6.almacen();


    }
}