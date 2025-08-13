import java.util.Scanner;

public class Ejercicio9 {
    Scanner teclado = new Scanner(System.in);
    int n,n_correctas,porcentaje;
    public void recogida(){
        System.out.println(" numero de preguntas");
        n=teclado.nextInt();
        System.out.println(" numero de preguntas correctas");
        n_correctas=teclado.nextInt();
        porcentaje=(n_correctas*100)/n;
    }
    public void calculo(){
        porcentaje=(n_correctas*100)/n;
        System.out.println(" numero de preguntas correctas");
        if(porcentaje>=90){
            System.out.println(" Nivel avanzado");
        }
        else if(porcentaje>=75&&porcentaje<90){
            System.out.println(" Nivel intermedio");
        }
        else if(porcentaje>=50&&porcentaje<75){
            System.out.println(" Nivel básico");
        }
        else if (porcentaje<=50){
            System.out.println(" Fuera de nivel");
        }


    }
    public static void main(String[] args) {
        Ejercicio9 ejercicio9 = new Ejercicio9();
        ejercicio9.recogida();
        ejercicio9.calculo();
    }

}
