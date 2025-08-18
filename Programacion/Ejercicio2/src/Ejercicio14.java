import java.util.Scanner;
public class Ejercicio14 {
    Scanner teclado = new Scanner(System.in);
    int goles_Visitantes;
    int goles_Locales;
    String resultado;
    public void almacenar(){
        System.out.println("los goles que ha marado el equipo visitante ");
        goles_Visitantes = teclado.nextInt();
        System.out.println("los goles que ha marado el equipo local");
        goles_Locales = teclado.nextInt();

    }
    public void resultado(){
        if(goles_Visitantes>goles_Locales){
            resultado = "El resultado es 2 ";
        } else if(goles_Visitantes<goles_Locales){
            resultado = "El resultado es 1 ";
        } else{
            resultado = " El resultado es X ";
        }
        System.out.println(resultado);


    }
    public static void main(String[] args) {
        Ejercicio14 ejercicio14 = new Ejercicio14();
        ejercicio14.almacenar();
        ejercicio14.resultado();
    }

}
