import java.util.Scanner;
public class Ejercicio1 {
    Scanner teclado = new Scanner(System.in);
    int num, contador=1;
    double total=0.0;
    public void pedirnumeros(){
        System.out.println("Ingrese un numero: ");
        num = teclado.nextInt();
        }
    public void metodo(){
        while(contador<=num) {
            total = total + 1.0 / contador;
            contador++;
        }
        System.out.println("Muestrame el total: " + total);
        }
    public static void main(String[] args) {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        ejercicio1.pedirnumeros();
        ejercicio1.metodo();
    }



}
