import java.util.Scanner;

public class Ejercicio10 {
    Scanner teclado = new Scanner(System.in);
    String nombre;
    int horas_trabajadas;
    double salario_bruto;
    double tasas;
    double tarifaporhora;
    double salario_neto;
    public void privado(){
        System.out.println("Ingrese el nombre del trabajador: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese el horas trabajadas: ");
        horas_trabajadas = teclado.nextInt();
        System.out.println("La tarifaporhora: ");
        tarifaporhora = teclado.nextDouble();
    }
    public void calculo(){
        if(horas_trabajadas <=35 ){
            salario_bruto=horas_trabajadas*tarifaporhora;
        }
        else{
            salario_bruto=(horas_trabajadas*tarifaporhora) *1.25;
        }
        if(salario_bruto>90){
            tasas=40.00 *0.25 + (salario_bruto-90.00)*0.45;

        }
        else if(salario_bruto>50){
            tasas=(salario_bruto-50)*0.25;
        }
        else{
            tasas=0;
        }
        salario_neto=salario_bruto-tasas;

    }
    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Salario Bruto: "+salario_bruto);
        System.out.println("Tasas: "+tasas);
        System.out.println("Salario Neto: "+salario_neto);

    }
    public static void main(String[] args) {
        Ejercicio10 ejercicio10 = new Ejercicio10();
        ejercicio10.privado();
        ejercicio10.calculo();
        ejercicio10.mostrar();
    }

}
