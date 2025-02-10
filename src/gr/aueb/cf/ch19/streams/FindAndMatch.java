package src.gr.aueb.cf.ch19.streams;

import java.util.List;
import java.util.Optional;

public class FindAndMatch {

    public static void main(String[] args) throws Exception {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        //Optional is a class/container for wrapping null.Avoid NPE
        Optional<String > query = names.stream()
                .filter(name -> name.equals("Alice"))
                .findFirst();

        if (query.isPresent()) {
            System.out.println("Firstname: " + query.get());
        }

        query.ifPresent(first -> System.out.println("Firstname" + first));

        String strFirstName = names.stream()
                .filter(name -> name.equals("Bob"))
                .findFirst().orElse(null);

        String strFirstName2 = names.stream()
                .filter(name -> name.equals("Bob"))
                .findFirst().orElseThrow(() -> new Exception("Alice not exists"));

        //Match
        boolean isBobExists = names.stream()
                .anyMatch(name -> name.equals("Bod"));

        boolean AllAreBob = names.stream()
                .allMatch(name -> name.equals("Bod"));

        boolean noneIsBob = names.stream()
                .noneMatch(name -> name.equals("Bod"));


    }
}
