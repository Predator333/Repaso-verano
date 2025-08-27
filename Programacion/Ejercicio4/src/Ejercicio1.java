import java.util.Scanner;
public class Ejercicio1 {
    Scanner teclado = new Scanner(System.in);
    int numero, total, positivos=0, negativos=0;
    public void sumar(){
        do{
            System.out.println("Ingrese un numero: ");
            numero = teclado.nextInt();
            if (numero!=9999) {
                    if (numero > 0) {
                        total+= numero;
                        positivos++;
                    } else {
                        total+= numero;
                        negativos++;
                    }
                }
        } while (numero!=9999);
    }
    public void imprimir(){
        System.out.println("El total es: " +total);
        System.out.println(" Tenemos esta cantidad de numeros positivos: " +positivos);
        System.out.println("Tenemos esta cantidad de numeros negativos: " +negativos);
    }
    public static void main(String[] args) {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        ejercicio1.sumar();
        ejercicio1.imprimir();
    }
}
