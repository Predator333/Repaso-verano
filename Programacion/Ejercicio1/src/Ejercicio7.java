import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numhoras;
        double costehorario;
        System.out.println("Ingrese un numero de horas trabajadas");
        numhoras = teclado.nextInt();
        System.out.println("Ingrese un coste por hora trabajada");
        costehorario = teclado.nextDouble();
        double numhorascostehorario = numhoras * costehorario;
        System.out.println("el numhorascostehorario es: " + numhorascostehorario);

    }
}
