import java.util.Random;
import java.util.Scanner;

public class Ciclo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int secreto = aleatorio.nextInt(100) + 1;
        int intentos = 0;
        int suposicion = 0;

        System.out.println("=== Adivina el número ===");
        System.out.println("Pensé un número entre 1 y 100.");

        while (suposicion != secreto) {
            System.out.print("Tu suposición: ");
            suposicion = sc.nextInt();
            intentos++;
            if (suposicion > secreto) {
                System.out.println("Demasiado alta.");
            } else if (suposicion < secreto) {
                System.out.println("Demasiado baja.");
            }
        }

        System.out.println("¡Correcto! Adivinaste el número " + secreto + " en " + intentos + " intento(s).");
        sc.close();
    }
}
