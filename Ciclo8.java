import java.util.Scanner;

public class Ciclo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Media de números positivos ===");
        System.out.println("Ingresa números uno por uno. Para terminar, ingresa un número negativo.");

        double suma = 0;
        int cantidad = 0;
        double numero = 0;

        while (numero >= 0) {
            System.out.print("Número: ");
            numero = sc.nextDouble();
            if (numero >= 0) {
                suma += numero;
                cantidad++;
            }
        }

        if (cantidad == 0) {
            System.out.println("No se ingresaron números positivos.");
        } else {
            System.out.printf("Números ingresados: %d%n", cantidad);
            System.out.printf("Media: %.2f%n", suma / cantidad);
        }
        sc.close();
    }
}
