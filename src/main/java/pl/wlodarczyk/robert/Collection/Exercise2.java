package pl.wlodarczyk.robert.Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Set<String> names = new HashSet<>();

        while (!"koniec".equals(name)) {
            names.add(name);
            name = scanner.next();
        }
        System.out.println(names);
    }
}

// 1. Stwórz aplikacje pobierającą imiona od użytkownika.
// 2. Następnie wyświetl te imiona bez powtórzeń
