package gr.aueb.cf.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * Διαβάζει από ένα αρχείο δεδομένα
 */
public class NamesScanning {

    public static void main(String[] args) {
        String inFilePath = "C:temp/names.txt";
        String outFilePath = "C:temp/names-formatted.txt";
        String line;
        String[] tokens;
        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            while ((line = reader.readLine()) != null) {
                tokens = (line.split(",+\\s*"));
//                ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" }, \n", tokens[0], tokens[1], tokens[2]);
                prinFormatted(ps, tokens);
                prinFormatted(System.out, tokens);
            }

        }catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void prinFormatted(PrintStream ps, String[] tokens) {
        ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" }, \n", tokens[0], tokens[1], tokens[2]);
    }
}
