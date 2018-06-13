package pl.sda.kolekcje;

import java.util.*;

public class SetIterable {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("ola", "costam", 22);
        Osoba osoba1 = new Osoba("ola", "costam", 22);
        Osoba osoba2 = new Osoba("ola", "costam", 22);
        Osoba osoba3 = new Osoba("ala","sss",17);
        Osoba osoba4 = new Osoba("iii","Khg",15);



        List<Osoba>osoby = Arrays.asList(osoba, osoba1, osoba2, osoba3, osoba4);
        Set<Osoba>stringSet = new HashSet<>(osoby);

        Iterator<Osoba> iterator = stringSet.iterator();
        while(iterator.hasNext()){

            Osoba os = iterator.next();
            System.out.println(os);
//            if (os.equals(osoba3)|| os.equals(osoba4)){
            if (os.getWiek()<18){
                iterator.remove();
            }
        }

        System.out.println(stringSet);

    }
}
