import java.util.Scanner;

public class Ejercicio7 {
    Scanner teclado = new Scanner(System.in);
    int num;

    public void ingresarnumero(){
        System.out.print("Ingrese un numero: ");
        num = teclado.nextInt();
    }
    public void verificar(){
        if(num==0){
            System.out.println("el numero es nulo");
        }
        else if(num<0){
            System.out.println("el numero es negativo");
        }
        else {
            System.out.println("el numero es positivo");
        }
    }
    public static void main(String[] args) {
        Ejercicio7 ejercicio7 = new Ejercicio7();
        ejercicio7.ingresarnumero();
        ejercicio7.verificar();

    }



}
