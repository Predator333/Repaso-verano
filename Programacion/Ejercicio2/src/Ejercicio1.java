/*
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.println("El valor del num1 es: ");
        num1 = teclado.nextInt();
        System.out.println("El valor del num2 es: ");
        num2 = teclado.nextInt();
        if (num1 > num2) {
            System.out.println("Si el num1 es mayor que el num2: " + num1);
            int suma= num1 + num2;
            int diferencia= num1 - num2;
            System.out.println("La suma del num1 y del num2 es: " + suma);
            System.out.println("La diferencia del num1 es: " + diferencia);
        } else  {
            System.out.println("Si el num2 es mayor que el num1: " + num2);
            int producto= num2 * num1;
            System.out.println("El producto del num1 y del num2 es: " + producto);
            int division= num2 / num1;
            System.out.println("La division del num1 y del num2 es: " + division);



        }



    }
}
*/
import java.util.Scanner;

public class Ejercicio1 {
    Scanner teclado = new Scanner(System.in);
    int num1,num2;

    public void ingresarnum(){
        System.out.println("Ingrese el primer numero");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = teclado.nextInt();
    }
    public void ejecutar() {
        if (num1 > num2) {
            System.out.println("Si el num1 es mayor que el num2: " + num1);
            int suma = num1 + num2;
            int diferencia = num1 - num2;
            System.out.println("La suma del num1 y del num2 es: " + suma);
            System.out.println("La diferencia del num1 es: " + diferencia);
        } else {
            System.out.println("Si el num2 es mayor que el num1: " + num2);
            int producto = num2 * num1;
            System.out.println("El producto del num1 y del num2 es: " + producto);
            int division = num2 / num1;
            System.out.println("La division del num1 y del num2 es: " + division);

        }
    }
    public static void main(String[] args) {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        ejercicio1.ingresarnum();
        ejercicio1.ejecutar();

    }
}
