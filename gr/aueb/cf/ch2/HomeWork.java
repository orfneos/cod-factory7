package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Εκτύπωση και διάβασμα ακέραιας θερμοκρασίας από
 * Φαρενάιτ σε κλίματα Κελσίου.
 */
public class HomeWork {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Fahrenheit = 0;
        int Celsius = 0;

        System.out.println("Please insert integer: ");
        Fahrenheit = in.nextInt();
        Celsius = 5 * (Fahrenheit-32) / 9;

        System.out.printf("Το αποτέλεσμα είναι: %d", Celsius);

    }
}
