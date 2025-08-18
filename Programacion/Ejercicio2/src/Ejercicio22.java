import java.util.Scanner;
public class Ejercicio22 {
    Scanner teclado = new Scanner(System.in);
    int annos;
    double sueldo;
    public void informacion(){
        System.out.println("Ingrese los annos de ambiguedad del operario");
        annos = teclado.nextInt();
        System.out.println("Ingrese la sueldo del operario");
        sueldo = teclado.nextDouble();
    }
    public void calculo(){
        if(sueldo<300&&annos>=10){
            System.out.println("Otorgarle un 20% mas de aumento en su sueldo " + sueldo*1.20 );
            sueldo*=1.20;
        } else if(sueldo<300&&annos<10){
            System.out.println("Otorgarle un 5% mas de aumento en su sueldo " + sueldo*1.05);
            sueldo*=1.05;
        } else {
            System.out.println(" Si el sueldo es mayor o igual 300 se queda como esta sin aumentos " + sueldo);
        }
    }
    public static void main(String[] args) {
        Ejercicio22 ejercicio22 = new Ejercicio22();
        ejercicio22.informacion();
        ejercicio22.calculo();
    }

}
