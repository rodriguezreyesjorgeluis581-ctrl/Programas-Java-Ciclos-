import java.util.Scanner;

public class Ciclo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        System.out.println("=== Calculadora básica ===");
        do {
            System.out.println("\nElige una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();

            if (opcion < 1 || opcion > 4) {
                System.out.println("Opción no válida.");
            } else {
                System.out.print("Primer número: ");
                double a = sc.nextDouble();
                System.out.print("Segundo número: ");
                double b = sc.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.printf("%.2f + %.2f = %.2f%n", a, b, a + b);
                        break;
                    case 2:
                        System.out.printf("%.2f - %.2f = %.2f%n", a, b, a - b);
                        break;
                    case 3:
                        System.out.printf("%.2f x %.2f = %.2f%n", a, b, a * b);
                        break;
                    case 4:
                        if (b == 0) {
                            System.out.println("Error: no se puede dividir entre cero.");
                        } else {
                            System.out.printf("%.2f / %.2f = %.2f%n", a, b, a / b);
                        }
                        break;
                }
            }

            System.out.print("¿Deseas continuar? (s/n): ");
            continuar = sc.next();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Hasta luego.");
        sc.close();
    }
}
