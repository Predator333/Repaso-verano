import java.util.Scanner;

public class Ejercicio12 {
    Scanner teclado = new Scanner(System.in);
    double dinero;
    int dinero_cent;

    public void informacion() {
        System.out.println("¿Cuantos dinero tienes?");
        dinero = teclado.nextDouble();
        dinero_cent = (int) Math.round(dinero * 100);
    }

    public void calculo() {
        int m_50_ctn = 0;
        int m_20_ctn = 0;
        int m_10_ctn = 0;
        int m_5_ctn = 0;
        int m_2_ctn = 0;
        int m_1_ctn = 0;

        while (dinero_cent > 0) {
            if (dinero_cent >= 50) {
                m_50_ctn++;
                dinero_cent = dinero_cent - 50;
            } else if (dinero_cent >= 20) {
                m_20_ctn++;
                dinero_cent = dinero_cent - 20;
            } else if (dinero_cent >= 10) {
                m_10_ctn++;
                dinero_cent = dinero_cent - 10;
            } else if (dinero_cent >= 5) {
                m_5_ctn++;
                dinero_cent = dinero_cent - 5;
            } else if (dinero_cent >= 2) {
                m_2_ctn++;
                dinero_cent = dinero_cent - 2;
            } else {
                m_1_ctn++;
                dinero_cent = dinero_cent - 1;
            }

        }
        System.out.println("Muestre el resultado del dinero calculado");
        System.out.println("Monedas de 50 centimos: " + m_50_ctn);
        System.out.println("Monedas de 20 centimos: " + m_20_ctn);
        System.out.println("Monedas de 10 centimos: " + m_10_ctn);
        System.out.println("Monedas de 5 centimos: " + m_5_ctn);
        System.out.println("Monedas de 2 centimos: " + m_2_ctn);
        System.out.println("Monedas de 1 centimos: " + m_1_ctn);

    }

    public static void main(String[] args) {
        Ejercicio12 ejercicio12 = new Ejercicio12();
        ejercicio12.informacion();
        ejercicio12.calculo();

    }
}







