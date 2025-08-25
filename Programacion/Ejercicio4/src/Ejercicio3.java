import java.util.Scanner;
public class Ejercicio3 {
    Scanner teclado = new Scanner(System.in);

    public void circulo(){
        int radio;
        System.out.println("digame el radio del Circulo");
        radio = teclado.nextInt();
        double area = Math.PI * radio * radio;
        System.out.println("El area del Circulo es: " + area);
    }

    public void rectangulo(){
        int base, altura;
        System.out.println("digame la base del Rectangulo");
        base = teclado.nextInt();
        System.out.println("digame la altura del Rectangulo");
        altura = teclado.nextInt();
        System.out.println("El area del Rectangulo es: " + base*altura);
    }

    public void triangulo(){
        int base, altura;
        System.out.println("digame la base del Triangulo");
        base = teclado.nextInt();
        System.out.println("digame la altura del Triangulo");
        altura = teclado.nextInt();
        System.out.println("El area del Triangulo es: " + base*altura/2);
    }

    public void menu() {
        int opcion;
        do {
            System.out.println("1. Circulo");
            System.out.println("2. Rectangulo");
            System.out.println("3. Triangulo");
            System.out.println("0. Exit");
            System.out.println("eliga una opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    circulo();
                    break;
                case 2:
                    rectangulo();
                    break;
                case 3:
                    triangulo();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 0);
    }

    public static void main(String[] args) {
        Ejercicio3 ejercicio3 = new Ejercicio3();
        ejercicio3.menu();
    }

}


