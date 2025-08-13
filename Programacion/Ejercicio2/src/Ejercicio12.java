import java.util.Scanner;

public class Ejercicio12 {
    Scanner teclado = new Scanner(System.in);
    double dinero;
    public void informacion() {
        System.out.println("¿Cuantos dinero tienes?");
        dinero = teclado.nextDouble();
    }

    public void calculo() {
        int m_50_ctn = 0;
        int m_20_ctn = 0;
        int m_10_ctn = 0;
        int m_5_ctn = 0;
        int m_2_ctn = 0;
        int m_1_ctn = 0;

        do {
            if (dinero >= 0.50) {
                m_50_ctn++;
                dinero = dinero - 0.50;
            } else if (dinero >= 0.20) {
                m_20_ctn++;
                dinero = dinero - 0.20;
            } else if (dinero >= 0.10) {
                m_10_ctn++;
                dinero = dinero - 0.10;
            } else if (dinero >= 0.05) {
                m_5_ctn++;
                dinero = dinero - 0.05;
            } else if (dinero >= 0.02) {
                m_2_ctn++;
                dinero = dinero - 0.02;
            } else {
                m_1_ctn++;
                dinero = dinero - 0.01;
            }
        } while(dinero>=0.00);
            System.out.println("Muestre el resultado del dinero calculado");
            System.out.println("Monedas de 50 centimos: "+m_50_ctn);
            System.out.println("Monedas de 20 centimos: "+m_20_ctn);
            System.out.println("Monedas de 10 centimos: "+m_10_ctn);
            System.out.println("Monedas de 5 centimos: "+m_5_ctn);
            System.out.println("Monedas de 2 centimos: "+m_2_ctn);
            System.out.println("Monedas de 1 centimos: "+m_1_ctn);

    }
    public static void main(String[] args) {
        Ejercicio12 ejercicio12 = new Ejercicio12();
        ejercicio12.informacion();
        ejercicio12.calculo();

    }


    }




