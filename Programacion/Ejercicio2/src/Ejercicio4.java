/*
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        double precioSinIVA;
        double descuento=15.0;
        double IVA;
        System.out.println("Ingrese la cantidad");
        cantidad = sc.nextInt();
        System.out.println("Ingrese el precioSinIVA");
        precioSinIVA = sc.nextDouble();
        System.out.println("Ingrese el tipo de IVA");
        IVA = sc.nextDouble();
        double cantipreSinIVA=cantidad*precioSinIVA;
        double cantipreIVA=cantipreSinIVA*IVA/100;
        double totalfactura=cantipreSinIVA+cantipreIVA;
        System.out.println("El total de la factura total es: "+totalfactura);
        if(totalfactura>600) {
            double totalfacturades=totalfactura-(totalfactura*descuento)/100;
            System.out.println("El total de la factura excede de 600 tendra un 15% de descuento:" + totalfacturades);
        }
        else {
            System.out.println("El total de la factura no excede de 600 no tendra un 15% de descuento: " + totalfactura);
        }

        }

    }
*/
import java.util.Scanner;
public class Ejercicio4 {
    Scanner sc = new Scanner(System.in);
    int cantidad;
    double descuento=15.0;
    double precioSinIVA;
    double IVA;
    public void datos(){
        System.out.println("Ingrese la cantidad ");
        cantidad = sc.nextInt();
        System.out.println("Ingrese el descuento ");
        descuento = sc.nextDouble();
        System.out.println("Ingrese el precioSinIVA ");
        precioSinIVA = sc.nextDouble();
        System.out.println("Ingrese el IVA ");
        IVA = sc.nextDouble();
    }
    public void calcular(){
        double cantipreSinIVA=cantidad*precioSinIVA;
        double cantipreIVA=cantipreSinIVA*IVA/100;
        double totalfactura=cantipreSinIVA+cantipreIVA;
        System.out.println("El total de la factura total es: "+totalfactura);
        if(totalfactura>600) {
            double totalfacturades=totalfactura-(totalfactura*descuento)/100;
            System.out.println("El total de la factura excede de 600 tendra un 15% de descuento:" + totalfacturades);
        }
        else {
            System.out.println("El total de la factura no excede de 600 no tendra un 15% de descuento: " + totalfactura);
        }

    }
    public static void main(String[] args) {
        Ejercicio4 ejercicio4 = new Ejercicio4();
        ejercicio4.datos();
        ejercicio4.calcular();
    }
    }






