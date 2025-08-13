/*
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        System.out.print("Ingrese un numero: ");
        num1 = teclado.nextInt();
        if(num1%2==0&&num1>0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }


    }
}
*/
import java.util.Scanner;
public class Ejercicio5 {
    Scanner teclado = new Scanner(System.in);
    int num1;
    public void mostrar(){
        System.out.println("Ingrese un numero");
        num1 = teclado.nextInt();
    }
    public void ejecutar(){
        if(num1%2==0&&num1>0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }

    }
    public static void main(String[] args) {
        Ejercicio5 ejercicio5 = new Ejercicio5();
        ejercicio5.mostrar();
        ejercicio5.ejecutar();
    }
    }
