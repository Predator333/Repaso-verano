import java.util.Scanner;
public class Ejercicio20 {
    Scanner teclado = new Scanner(System.in);
    int num1, num2, num3;
    public void fisica(){
        System.out.print("Ingrese el numero1: ");
        num1 = teclado.nextInt();
        System.out.print("Ingrese el numero2: ");
        num2 = teclado.nextInt();
        System.out.print("Ingrese el numero3: ");
        num3 = teclado.nextInt();
    }
    public void bucle(){
        if(num1>10&&num2>10&&num3>10){
            System.out.println("Todos los numeros son correctos");
        }
        else{
            System.out.println("Alguno de los números es menor a diez");

        }
    }
    public static void main(String[] args) {
        Ejercicio20 ejercicio20 = new Ejercicio20();
        ejercicio20.fisica();
        ejercicio20.bucle();

    }

}
