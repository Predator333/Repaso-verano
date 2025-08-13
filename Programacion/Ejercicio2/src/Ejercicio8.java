import java.util.Scanner;

public class Ejercicio8 {
    Scanner teclado = new Scanner(System.in);
    int num1;
    public void informacion() {
        System.out.println("Ingrese el numero 1: ");
        num1 = teclado.nextInt();

    }
    public void calcular(){
        int cifras = String.valueOf(Math.abs(num1)).length();
        if(cifras == 1){
            System.out.println("El numero 1 tiene 1 cifra");
        }
        else if(cifras == 2){
            System.out.println("El numero 1 tiene 2 cifra");
        }
        else if(cifras == 3){
            System.out.println("El numero 1 tiene 3 cifra");
        }
        else{
            System.out.println("Error el numero 1 tiene mas de 3 cifras");
        }
    }
    public static void main(String[] args) {
        Ejercicio8 ejercicio8 = new Ejercicio8();
        ejercicio8.informacion();
        ejercicio8.calcular();

    }


    }

