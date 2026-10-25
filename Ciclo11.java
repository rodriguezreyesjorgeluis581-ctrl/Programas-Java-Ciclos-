import java.util.Scanner;

public class Ciclo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Secuencia de cuadrados ===");
        System.out.print("Ingresa un número entero positivo: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Error: el número debe ser positivo.");
        } else {
            System.out.println("Cuadrados del 1 al " + n + ":");
            int i = 1;
            do {
                System.out.println(i + " al cuadrado = " + (i * i));
                i++;
            } while (i <= n);
        }
        sc.close();
    }
}
