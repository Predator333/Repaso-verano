import java.util.Scanner;
public class Ejercicio18 {
    Scanner teclado = new Scanner(System.in);
    int valor1, valor2, valor3, resultado;
    public void tener(){
        System.out.println("Ingrese el valor1: ");
        valor1 = teclado.nextInt();
        System.out.println("Ingrese el valor2: ");
        valor2 = teclado.nextInt();
        System.out.println("Ingrese el valor3: ");
        valor3 = teclado.nextInt();
    }
    public void pensar(){
       int suma= valor1 + valor2;
       resultado = suma * valor3;
       if(valor1==valor2&&valor2==valor3){
           System.out.println("La suma de " +valor1 + " y " + valor2 + " es " +suma +" multiplicando por " + valor3 + " es " +resultado );
       }
       else {
           System.out.println("Los numeros no son iguales");
            }
    }
    public static void main(String[] args) {
        Ejercicio18 ejercicio18 = new Ejercicio18();
        ejercicio18.tener();
        ejercicio18.pensar();
    }
}




