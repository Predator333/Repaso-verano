

/*
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota1, nota2, nota3,promedio;
        System.out.println("Ingrese la primera nota: ");
        nota1 = teclado.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        nota2 = teclado.nextInt();
        System.out.println("Ingrese la tercera nota: ");
        nota3 = teclado.nextInt();
        promedio = (nota1 + nota2 + nota3) / 3;
        if(promedio>=7){
            System.out.println("APTO");
        }
        else{
            System.out.println("NO APTO");
            }

        }



    }
*/
import java.util.Scanner;
public class Ejercicio2 {
    Scanner teclado = new Scanner(System.in);
    int nota1, nota2, nota3, promedio;
    public void ingresar(){
        System.out.println("Ingresar la primera nota: ");
        nota1 = teclado.nextInt();
        System.out.println("Ingresar la segunda nota: ");
        nota2 = teclado.nextInt();
        System.out.println("Ingresar la tercera nota: ");
        nota3 = teclado.nextInt();
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio de la nota es: " + promedio);

    }
    public void ejecutar(){
        if(promedio>=7){
            System.out.println("APTO");
        }
        else{
            System.out.println("NO APTO");
        }

    }
    public static void main(String[] args) {
        Ejercicio2 ejercicio2 = new Ejercicio2();
        ejercicio2.ingresar();
        ejercicio2.ejecutar();

    }



}






