package gr.aueb.cf.ch9;

import java.io.File;

public class CreateFolderExample {
    public static void main(String[] args) {
        String folderPath = "C:/tmp/";

        File folder = new File(folderPath);

        if (!folder.exists()) {
            if (folder.mkdirs()) {
                System.out.println("Ο φάκελος δημιουργήθηκε με επιτυχία: " + folderPath);
            } else {
                System.out.println("Αδυναμία δημιουργίας του φακέλου: " + folderPath);
            }
        } else {
            System.out.println("Ο φάκελος ήδη υπάρχει: " + folderPath);
        }
    }

}
