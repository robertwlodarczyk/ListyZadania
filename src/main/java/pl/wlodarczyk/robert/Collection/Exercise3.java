package pl.wlodarczyk.robert.Collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Map<Integer, Map<Exercise3Language, String>> map = new HashMap<>();

        Map<Exercise3Language, String> one = new HashMap<>();

        one.put(Exercise3Language.ENG, "ONE");
        one.put(Exercise3Language.PL, "JEDEN");
        one.put(Exercise3Language.ES, "UNO");
        map.put(1, one);

        Map<Exercise3Language, String> two = new HashMap<>();

        two.put(Exercise3Language.ENG, "TWO");
        two.put(Exercise3Language.PL, "DWA");
        two.put(Exercise3Language.ES, "DOS");
        map.put(2, two);

        Map<Exercise3Language, String> three = new HashMap<>();

        three.put(Exercise3Language.ENG, "THREE");
        three.put(Exercise3Language.PL, "TRZY");
        three.put(Exercise3Language.ES, "TRES");
        map.put(3, three);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę i język: " + Arrays.toString(Exercise3Language.values()));
        int number = scanner.nextInt();
        Exercise3Language exercise3Language = Exercise3Language.valueOf(scanner.next());

        System.out.println(map.get(number).get(exercise3Language));


    }
}

// 1. Stwórz mape która przechowuje liczby i ich pisemny odpowiednik. (od 1 do 3)
// 2. Kiedy użytkownik zapyta o jakś liczbę do wyświetli się jej odpowiednik jako tekst
// np. pytam o 1, wyświetla się „jeden”

// Stwórz enum który zawiera skróty języków ( PL, ENG, ES)
// Stwórz taką strukturę która umożliwia przechowywanie tłumaczeń liczb z poprzedniego zadania na każdy z tych języków.
// Zmodyfikuj zadanie tak aby użytkownik mógł podac liczbę i język w jakim chciałby uzyskać wynik.
// Użytkownik powinien posiadać możliwość zapytania o możliwe językiStwórz enum który zawiera skróty języków ( PL, ENG, ES)
// Stwórz taką strukturę która umożliwia przechowywanie tłumaczeń liczb z poprzedniego zadania na każdy z tych języków.
// Zmodyfikuj zadanie tak aby użytkownik mógł podac liczbę i język w jakim chciałby uzyskać wynik.
// Użytkownik powinien posiadać możliwość zapytania o możliwe języki