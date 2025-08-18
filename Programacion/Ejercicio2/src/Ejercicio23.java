import java.util.Scanner;
public class Ejercicio23 {
    Scanner teclado = new Scanner(System.in);
    int num1, num2, num3;
    int mayor, menor;

    public void almacenar(){
        System.out.println("Ingrese el numero 1: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el numero 2: ");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el numero 3: ");
        num3 = teclado.nextInt();

    }
    public void evaluar(){
      mayor = num1;
      menor = num1;
      if( num2>mayor){
          mayor = num2;
      }
      if( num3>mayor){
          mayor = num3;
      }
      if (num2<menor){
          menor = num2;
      }
      if (num3<menor){
          menor = num3;
      }
      System.out.println("El mayor es: "+mayor);
      System.out.println("El menor es: "+menor);

    }
    public static void main(String[] args) {
        Ejercicio23 ejercicio23 = new Ejercicio23();
        ejercicio23.almacenar();
        ejercicio23.evaluar();
    }
}
