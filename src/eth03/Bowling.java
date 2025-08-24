package eth03;

import java.util.Arrays;
import java.util.Scanner;

public class Bowling {
    public static void main(String[] args) {
        int[] summen = new int[3];
        int[][] resultate = new int[5][3];

//        System.out.println(Arrays.deepToString(resultate));
        Scanner inputZahl = new Scanner(System.in);

        // Resultat Eingabe
        for (int i = 0; i < resultate.length; i++) {
            for (int j = 0; j < resultate[i].length; j++) {
                System.out.printf("Gebe das Resultat vom Spieler %d in Runde %d an: ", i + 1, j + 1);
                int eingabeZahl = inputZahl.nextInt();
                resultate[i][j] = eingabeZahl;
            }
        }

        // Summen ausrechnen
        for (int spieler = 0; spieler < resultate[0].length; spieler++) { // Iteriere über Spieler
            int summe = 0;
            for (int runde = 0; runde < resultate.length; runde++) { // Iteriere über Runden
                summe += resultate[runde][spieler];
            }
            summen[spieler] = summe;
        }


        // Ausgabe
        System.out.println("--------------------");
        System.out.println("            Spieler ");
        System.out.println("--------------------");
        System.out.println("            1  2  3 ");
        System.out.println("--------------------");

        for (int i = 0; i < resultate.length; i++) {
            System.out.printf(" %d.Runde    %d  %d  %d %n", i + 1, resultate[i][0], resultate[i][1], resultate[i][2]);
        }

        System.out.println("--------------------");
        System.out.printf("Summen      %d  %d  %d ", summen[0], summen[1], summen[2]);
    }
}
