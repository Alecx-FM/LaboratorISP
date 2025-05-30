package ro.ulbs.paradigme.lab9;

import java.util.*;
import java.util.stream.*;
import java.util.Random;
import java.util.stream.Collectors;

public class Liste {

    public static void main(String[] args) {
         /*
        Random random = new Random();
        List<Integer> Lista = random.ints(10, 5, 26)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Lista originala: " + Lista);

        int sum = Lista.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("a) Suma elementelor: " + sum);

        int max = Lista.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

        int min = Lista.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);

        System.out.println("b) Valoarea maxima: " + max + ", Valoarea minima: " + min);

        List<Integer> filteredList = Lista.stream()
                .filter(n -> n >= 10 && n <= 20)
                .collect(Collectors.toList());

        System.out.println("c) Lista filtrata [10..20]: " + filteredList);

        List<Double> doubleList = Lista.stream()
                .map(Double::valueOf)
                .collect(Collectors.toList());

        System.out.println("d) Lista Double: " + doubleList);

        boolean contains12 = Lista.stream()
                .anyMatch(n -> n == 12);

        System.out.println("e) Lista contine valoarea 12: " + contains12);
        */

        // Exercițiul 2
        /*
        List<Integer> ListaData = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

        List<Integer> squaredDistinct = ListaData.stream()
                .map(n -> n * n)       // Square each number
                .distinct()            // Keep only distinct values
                .collect(Collectors.toList());

        System.out.println("Lista originala: " + ListaData);
        System.out.println("Lista cu patratele: " + squaredDistinct);
        */
        // Exercițiul 3
        String text = "Acesta este un program scris cu java 8 si expresii lambda";
        List<String> words = Arrays.asList(text.split(" "));
        List<String> longWords = words.stream()
                .filter(w -> w.length() >= 5)
                .collect(Collectors.toList());
        System.out.println("Cuvant >=5 charactere: " + longWords);
        System.out.println("Numar: " + longWords.size());
        List<String> sorted = new ArrayList<>(longWords);
        sorted.sort(Comparator.naturalOrder());
        System.out.println("Sortare: " + sorted);
        Optional<String> startsWithP = longWords.stream()
                .filter(w -> w.startsWith("p"))
                .findFirst();
        System.out.println("Cuvant care incepe cu 'p': " + startsWithP.orElse("None"));
    }
}