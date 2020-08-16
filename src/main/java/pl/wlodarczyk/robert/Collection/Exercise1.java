package pl.wlodarczyk.robert.Collection;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(21);
        list1.add(56);
        list2.add(23);
        list2.add(43);
        list2.add(34);

        System.out.println(list1);
        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            list3.add(list1.get(i) + list2.get(i));

        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.println("element z kolekcji 1 " + list1.get(i)
                    + " element z kolekcji 2 " + list2.get(i)
                    + " element z kolekcji 3 " + list3.get(i));

        }


    }
}


// 1. Stwórz 2 kolekcje zawierające liczby, kolekcje muszą mieć tą samą długość
// 2. Stwórz trzecią kolekcje zawierające liczby będące sumą liczb z 2 poprzednich kolekcji o odpowiednim indeksie.
// 3. Wyświetl te kolekcje w formie element z kolekcji 1 „+” element z kolekcji 2 „=” element z kolekcji 3