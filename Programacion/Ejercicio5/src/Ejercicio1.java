import java.util.Scanner;
public class Ejercicio1 {
    Scanner teclado = new Scanner(System.in);
    int positivos, negativos, mult15, sumpares, valor;
    public void guardar(){
        for(int f=0; f<10; f++){
            System.out.println("Ingrese un valor: ");
            valor = teclado.nextInt();
            if(valor>0){
                positivos++;
            } else
                negativos++;
            if(valor%15==0){
                mult15++;
            }
            if(valor%2==0){
                sumpares=sumpares+valor;
            }
        }
    }
    public void mostrar(){
        System.out.println(" Hay esta cantidad de positivo: "+positivos);
        System.out.println(" Hay esta cantidad de negativo: "+negativos);
        System.out.println(" Hay esta  cantidad de  mult15: "+mult15);
        System.out.println(" la suma de los pares da esto: "+sumpares);
    }
    public static void main(String[] args) {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        ejercicio1.guardar();
        ejercicio1.mostrar();

    }
}
