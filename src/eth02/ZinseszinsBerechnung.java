package eth02;

import java.util.Scanner;

public class ZinseszinsBerechnung {
    public static void main(String[] args) {
        // Konstanten definieren
        final float zinssatz = 0.02f;

        // Variablen definieren
        int anzJahre = 0;
        float kontostand = 2000;

        // Scanner erstellen
        Scanner inputJahre = new Scanner(System.in);
        System.out.print("Bitte geben sie die Anzahl Jahre ein: ");
        anzJahre = inputJahre.nextInt();

        System.out.println("Zinssatz liegt bei: " + zinssatz * 100 + " %");

        for (int i = 1; i <= anzJahre; i++) {
            float jahreszins = kontostand * zinssatz;
            kontostand = kontostand + jahreszins;

            System.out.printf("Im %d. Jahr gibt es %.2f Fr Zins. Neuer Kontostand: %.2f Fr%n", i, jahreszins, kontostand);
        }
    }
}
