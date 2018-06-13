package pl.sda.kolekcje;

        import java.util.ArrayList;
        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Random;

  class Zadanie2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //    - dodaj do listy 10 liczb losowych
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100));
        }

        //    - oblicz sumę elementów na liście (wypisz ją)
        double suma = 0.0;
//        for (int i = 0; i < list.size(); i++) {
//            suma+=list.get(i);
//        }
        for (Integer wartoscNaLiscie : list) {
            suma += wartoscNaLiscie;
        }
        System.out.println(suma);

        //     - oblicz średnią elementów na liście (wypisz ją)
        double srednia = suma / list.size();
        System.out.println(srednia);


        //    - podaj medianę elementów na liście (wypisz ją)
        ArrayList<Integer> kopia = new ArrayList<>(list);
        Collections.sort(kopia); // kopia jest posortowana, list nie

        if (kopia.size() % 2 == 0) {
            // parzystych rozmiarów
            int indexSrodkowego1 = kopia.size() / 2;
            int indexSrodkowego2 = kopia.size() / 2 - 1;

            double mediana = kopia.get(indexSrodkowego1) + kopia.get(indexSrodkowego2);
            mediana /= 2.0;
            System.out.println("Mediana: " + mediana);

        } else {
            // nieparzysty
            int indexSrodkowego = kopia.size();
            double mediana = kopia.get(indexSrodkowego);
            System.out.println("Mediana: " + mediana);
        }

        //    - znajdź największy oraz najmniejszy element na liście (znajdź go pętlą for, a następnie określ index posługując się metodą indexOf)

        Integer min = list.get(0);   /// 1 2 3 4 5 6 7
        Integer max = list.get(0);  ///
        for (Integer element : list) {

            // szukam najmniejszej wartosci
            if (min > element) {
                min = element;
            }
            // szukam najwiekszej wartosci
            if (max < element) {
                max = element;
            }
        }

        System.out.println("index min: " + list.indexOf(min));
        System.out.println("index max: " + list.indexOf(max));

        // znajdź największy oraz najmniejszy element na liście (znajdź go posługując się pętlą for) - wypisz indeks elementu
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == min) {
                System.out.println("index min: " + i);
            }
            if (list.get(i) == max) {
                System.out.println("index max: " + i);
            }
        }
    }
}
