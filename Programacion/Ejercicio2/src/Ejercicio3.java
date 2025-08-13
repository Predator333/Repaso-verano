/*
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;

        System.out.println("Ingrese un numero: ");
        num1 = teclado.nextInt();
        if (num1 > 0 && num1 < 99)
        {
            System.out.println("Es correccto");
        }
        else{
            System.out.println("Es incorrecto");
        }



    }

    }
*/
import java.util.Scanner;
public class Ejercicio3 {
    Scanner teclado = new Scanner(System.in);
    int numero1;
    public void introducir() {
        System.out.println("Ingrese un numero: ");
        numero1 = teclado.nextInt();
    }
    public void transmitiendo(){
        if (numero1 > 0 && numero1 < 99)
        {
            System.out.println("Es correccto");
        }
        else{
            System.out.println("Es incorrecto");
        }
    }
}


