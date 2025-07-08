import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double baseimponible;
        double descuento;
        int IVA;
        System.out.println("la baseimponible es:");
        baseimponible = teclado.nextDouble();
        System.out.println("el descuento es:");
        descuento = teclado.nextDouble();
        System.out.println("el IVA es:");
        IVA = teclado.nextInt();
        double bimponibledesc=baseimponible*descuento/100;
        double bimponibleIVA=baseimponible*IVA/100;
        double totalfactura = bimponibledesc + bimponibleIVA;
        System.out.println("El totalfactura es:"+totalfactura);





    }
}
