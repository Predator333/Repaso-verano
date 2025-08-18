import java.util.Scanner;
public class Ejercicio23 {
    Scanner teclado = new Scanner(System.in);
    int num1, num2, num3;

    public void almacenar(){
        System.out.println("Ingrese el numero 1: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el numero 2: ");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el numero 3: ");
        num3 = teclado.nextInt();

    }
    public void evaluar(){
        int suma= num1+num2+num3;
        System.out.println("La suma de los numeros es:" + suma);
        if(num1>num2){

        }




    }
}
