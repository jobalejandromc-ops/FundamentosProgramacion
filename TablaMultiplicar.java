package TrabajosDeProgramacion;
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n;
        int resultado;

        System.out.print("Ingresa un número: ");
        n = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
        }

    }
}
