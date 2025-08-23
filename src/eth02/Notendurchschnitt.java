package eth02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Notendurchschnitt {
    //    int defaultValue = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float inputNote;
        int counter = 1;

        ArrayList<Float> array = new ArrayList<>();

        System.out.println("Bitte geben Sie ihre Noten ein (0 für Eingabe beenden): ");

        do {
            System.out.printf("%d. Note: ", counter);
            inputNote = input.nextFloat();

            if (inputNote != 0) {
                array.add(inputNote);
                System.out.println("Noten: " + array.toString());
            }

            counter++;

        } while (inputNote != 0);
        {

            float summe = 0;
            for (int y = 0; y < array.size(); y++) {
                summe = summe + array.get(y);
            }
            float notenschnitt = summe / array.size();

            System.out.printf("Sie haben %d Noten eingegeben. Schnitt = %f", array.size(), notenschnitt);
        }
    }
}
