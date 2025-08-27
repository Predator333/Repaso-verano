import java.util.Scanner;
public class Ejercicio2 {
    Scanner teclado = new Scanner(System.in);
    int numero, digitos=0;
    public void menu() {
        System.out.println("digame un numero: ");
        numero = teclado.nextInt();
    }
    public void calculo(){
        do{
            numero=numero/10;
            digitos++;
        } while(numero>0);
    }
    public void mostrar(){
        System.out.println("el numero tiene estos digitos: " + digitos);
    }
    public static void main(String[] args) {
        Ejercicio2 ejercicio2 = new Ejercicio2();
        ejercicio2.menu();
        ejercicio2.calculo();
        ejercicio2.mostrar();
    }
}
