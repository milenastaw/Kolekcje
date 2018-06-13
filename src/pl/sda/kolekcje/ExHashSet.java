package pl.sda.kolekcje;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExHashSet {
    public static void main(String[] args) {
        Integer[] tablica = new Integer[]{10, 12, 10, 3, 4, 12, 12, 300, 12, 40, 55};
        Set<Integer> zbiór = new HashSet<>();
        for (Integer elementTablicy : tablica) {
            zbiór.add(elementTablicy);
        }

        System.out.println(zbiór.size());
        zbiór.remove(12);
        zbiór.remove(10);    ////  usuwa wszystkie 10 i 12

        for (Integer element : zbiór) {
            System.out.println(element);
        }
    }
    public static boolean czyZawieraDuplikaty(String slowo) {
        // odfiltrować / usunąć wszystkie spacje
        slowo = slowo.replaceAll(" ", "");
        // zmieniamy na same małe litery
//        slowo = slowo.toLowerCase();
        String[] litery = slowo.split("");
        Set<String> zbior = new HashSet<>(Arrays.asList(litery));
        // weryfikujemy czy przed dodaniem liter do zbioru i po ich dodaniu
        // mamy dalej tak samo wielkie zbiory
        // czy tablica jest tego samego rozmiaru co zbiór
        return zbior.size() == litery.length;
    }



    }



