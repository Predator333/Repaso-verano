import java.util.Scanner;
public class Ejercicio16 {
    Scanner teclado = new Scanner(System.in);
    double euros ;
    double cambio_pesos;
    double cambio_yenes;
    double cambio_dolares;
public void cambiar(){
    System.out.println("Introduzca el dinero en euros que quiere cambiar " );
    euros = teclado.nextDouble();
}

public void cambiar_cambio(){
    double cambio_pesos=euros*21.82;
    double cambio_yenes=euros*171.22;
    double cambio_dolares=euros*1.17;
    System.out.println("Introduzca si quiere pesos(p) yenes(y) dolares(d)");
    char divisa = teclado.next().charAt(0);
    switch(divisa){
        case 'p':
            System.out.println("Los euros " +euros + " son " +cambio_pesos + " pesos");
            break;
            case 'y':
                System.out.println("Los euros " +euros + " son " + cambio_yenes + " yenes");
                break;
                case 'd':
                    System.out.println("Los euros " +euros + " son " +cambio_dolares + " dolares");
                    break;
                    default:
                        System.out.println("Esa divisa no se puede realizar");
    }

    teclado.close();
}
public static void main(String[] args){
    Ejercicio16 ejercicio16 = new Ejercicio16();
    ejercicio16.cambiar();
    ejercicio16.cambiar_cambio();
    }
}
