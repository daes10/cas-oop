package eth01;

import java.util.Scanner;

public class BremswegBerechnung {

    public static void main(String[] args) {
        float result = getCalculation();

        System.out.println("Der Anhaltsweg ist: " + result + " m lang.");
        System.out.println("Gerundet: ~ " + java.lang.Math.round(result) + " m");
    }

    private static float getCalculation() {
        Scanner input = new Scanner(System.in);

        System.out.print("Bitte eine Zahl eingeben: ");
        float inputSpeed = input.nextFloat();

        return BremswegBerechnung.getStoppingDist(inputSpeed);
    }

    private static float getReactionDist(float speed) {
        return 3 * (speed / 10);
    }

    private static float getBrakingDist(float speed) {
        return (speed / 10) * (speed / 10);
    }

    private static float getStoppingDist(float speed) {
        return getReactionDist(speed) + getBrakingDist(speed);
    }
}

