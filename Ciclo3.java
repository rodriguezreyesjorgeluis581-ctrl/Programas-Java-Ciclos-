import java.util.Scanner;

public class Ciclo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Contar letras 'a' en una palabra ===");
        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine();

        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = Character.toLowerCase(palabra.charAt(i));
            if (letra == 'a') {
                contador++;
            }
        }

        System.out.println("La letra 'a' aparece " + contador + " vez/veces en \"" + palabra + "\".");
        sc.close();
    }
}
