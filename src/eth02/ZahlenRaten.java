package eth02;

import java.util.Scanner;

public class ZahlenRaten {
    public static void main(String[] args) {
        int magicZahl = 38;
        boolean erraten = false;
        int zaehler = 1;

        Scanner inputZahl = new Scanner(System.in);

        System.out.println("Gesucht ist eine Zahl zwischen 1 und 100.");

        do {
            System.out.println("raten Sie!");
            int zahl = inputZahl.nextInt();

            if (zahl > magicZahl) {
                System.out.println("zu gross");
                ++zaehler;
            } else if (zahl < magicZahl) {
                System.out.println("zu klein");
                ++zaehler;
            } else {
                System.out.printf("Erraten! %d mal geraten.%n", zaehler);
                erraten = true;
            }

        } while (!erraten);

        inputZahl.close();
    }
}
