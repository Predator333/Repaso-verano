import java.util.Scanner;
public class Ejercicio19 {
    Scanner teclado = new Scanner(System.in);
    int num1,num2,num3;
    public void mates(){
        System.out.print("Ingrese el valor del numero1: ");
        num1 = teclado.nextInt();
        System.out.print("Ingrese el valor del numero2: ");
        num2 = teclado.nextInt();
        System.out.print("Ingrese el valor del numero3: ");
        num3 = teclado.nextInt();

    }
    public void ejecutar(){
        if(num1<10&&num2<10&&num3<10){
            System.out.println("Todos los numeros son menores de 10");
        }
        else{
            System.out.println("Error");
        }
    }
    public static void main(String[] args){
        Ejercicio19 ejercicio19 = new Ejercicio19();
        ejercicio19.mates();
        ejercicio19.ejecutar();

    }
}
