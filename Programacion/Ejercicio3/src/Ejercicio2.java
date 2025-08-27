import java.util.Scanner;
public class Ejercicio2 {
    Scanner teclado = new Scanner(System.in);
    int primero=0,segundo=1,suma,n, cont=2;
    public void almacenar(){
        System.out.println("Ingrese el primer numero");
        n=teclado.nextInt();
     }
     public void mostrar(){
        while(cont<n){
            suma=primero+segundo;
            System.out.print(" " +suma);
            primero=segundo;
            segundo=suma;
            cont++;
        }
     }
public static void main(String[] args) {
        Ejercicio2 ejercicio2 = new Ejercicio2();
        ejercicio2.almacenar();
        ejercicio2.mostrar();
}
}
