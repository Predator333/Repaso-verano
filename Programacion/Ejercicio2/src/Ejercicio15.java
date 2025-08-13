import java.util.Scanner;
public class Ejercicio15 {
    Scanner teclado = new Scanner(System.in);
    int mes;
    public void recursos(){
      System.out.println("Ingrese mes del año: ");
        mes = teclado.nextInt();
    }
    public void calculo(){
        switch (mes){
            case 1:
             System.out.println("enero");
             break;
             case 2:
                 System.out.println("febrero");
                 break;
                 case 3:
                     System.out.println("marzo");
                     break;
                     case 4:
                         System.out.println("abril");
                         break;
                         case 5:
                             System.out.println("mayo");
                             break;
                             case 6:
                                 System.out.println("junio");
                                 break;
                                 case 7:
                                     System.out.println("julio");
                                     break;
                                     case 8:
                                         System.out.println("agosto");
                                         break;
                                         case 9:
                                             System.out.println("septiembre");
                                             break;
                                             case 10:
                                                 System.out.println("octubre");
                                                 break;
                                                 case 11:
                                                     System.out.println("noviembre");
                                                     break;
                                                     case 12:
                                                         System.out.println("diciembre");
                                                         break;
            default:
                System.out.println("Introduce un numero entre 1 y 12");

        }
        teclado.close();
    }
    public static void main(String[] args) {
        Ejercicio15 ejercicio15 = new Ejercicio15();
        ejercicio15.recursos();
        ejercicio15.calculo();

    }
}
