import java.util.Scanner;
public class Ejercicio17 {
    Scanner teclado = new Scanner(System.in);
    int dia,mes,anno;
    public void fecha(){
        System.out.print("Dia: ");
        dia = teclado.nextInt();
        System.out.print("Mes: ");
        mes = teclado.nextInt();
        System.out.print("Ano: ");
        anno = teclado.nextInt();

    }
    public void elegir(){
        if(dia==25&& mes==12){
            System.out.println("Es Navidad");
        }
        else{
            System.out.println("No es navidad");
        }



    }
    public static void main(String[] args) {
        Ejercicio17 ejercicio17 = new Ejercicio17();
        ejercicio17.fecha();
        ejercicio17.elegir();
    }

}
