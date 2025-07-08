import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String direccion;
        int edad;
        int numtelefono;
        System.out.println(" el nombre es : ");
        nombre = teclado.nextLine();
        System.out.println(" la direccion es : ");
        direccion = teclado.nextLine();
        System.out.println(" la edad es : ");
        edad = teclado.nextInt();
        System.out.println(" el numero de telefono es : ");
        numtelefono = teclado.nextInt();
        System.out.println("el nombre es : "+nombre);
        System.out.println("la direccion es : "+direccion);
        System.out.println("la edad es : "+edad);
        System.out.println("el numero de telefono es : "+numtelefono);


    }
}
