import java.util.Scanner;

public class Ciclo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Vocales o consonantes ===");
        System.out.println("Ingresa una letra y pulsa Enter. Para terminar, ingresa un espacio.");

        boolean continuar = true;
        while (continuar) {
            System.out.print("Letra: ");
            String entrada = sc.nextLine();

            if (entrada.length() > 0 && entrada.charAt(0) == ' ') {
                continuar = false;
            } else if (entrada.length() == 0) {
                System.out.println("No ingresaste nada.");
            } else {
                char c = Character.toLowerCase(entrada.charAt(0));
                if (!Character.isLetter(c)) {
                    System.out.println("'" + entrada.charAt(0) + "' no es una letra.");
                } else if ("aeiouáéíóúü".indexOf(c) >= 0) {
                    System.out.println("'" + entrada.charAt(0) + "' es una vocal.");
                } else {
                    System.out.println("'" + entrada.charAt(0) + "' es una consonante.");
                }
            }
        }

        System.out.println("Programa terminado.");
        sc.close();
    }
}
