import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileAPP {

    public static void main(String[] args) {
        File fdIn = new File("C:/tmp/file6.txt");
        File fdOut = new File("C:/tmp/file6out.txt");

        try (Scanner in = new Scanner(fdIn);
             PrintWriter pw = new PrintWriter(fdOut, StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] tokens = line.split(" ");

                for (String token : tokens) {
                    System.out.printf("%s ", token);
                    pw.print(token + " ");
                }
                pw.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

