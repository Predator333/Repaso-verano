import java.util.Scanner;
public class Ejercicio21 {
    Scanner teclado = new Scanner(System.in);
    int x,y;
    public void informacion(){
        System.out.println("Ingrese el valor de x: ");
        x = teclado.nextInt();
        System.out.println("Ingrese el valor de y: ");
        y = teclado.nextInt();
    }
    public void mostrar(){
        if(x>0 && y>0){
            System.out.println("Primer cuadrante");
        } else if(x<0 && y>0){
            System.out.println("Segundo cuadrante");
        } else if(x<0 && y<0){
            System.out.println("Tercer cuadrante");
        } else if(x>0 && y<0)  {
            System.out.println("Cuatro cuadrante");
        }
    }
    public static void main(String[] args) {
        Ejercicio21 ejercicio21 = new Ejercicio21();
        ejercicio21.informacion();
        ejercicio21.mostrar();

    }
}
