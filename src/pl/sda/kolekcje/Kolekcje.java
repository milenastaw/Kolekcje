package pl.sda.kolekcje;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Kolekcje {
    public static void main(String[] args) {
//        int[] integers = new int[4];
//        liczba = scanner.nextInt();

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList();

        for (int i = 0; i < 5; i++) {
            int wczytana = sc.nextInt();
            lista.add(wczytana);
        }

        Random generator = new Random();
        for (int i = 0; i < 5; i++) {
            int wygenerowana = generator.nextInt();
            lista.add(wygenerowana);
        }

        System.out.println(lista);


    }
}
