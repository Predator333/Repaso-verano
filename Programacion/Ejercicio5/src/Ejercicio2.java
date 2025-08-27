import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
    int n_filas=9;
        for(int f_actual=1;f_actual<=n_filas;f_actual++){
            for(int es=1;es<=(n_filas-f_actual);es++){
                System.out.print(" ");
            }
            for(int asteriscos=1;asteriscos<=f_actual;asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
