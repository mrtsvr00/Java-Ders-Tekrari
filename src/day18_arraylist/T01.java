package day18_arraylist;

import java.util.ArrayList;
import java.util.List;

public class T01 {
    public static void main(String[] args) {

        List<Integer>sayilar=new ArrayList<>();
        System.out.println(sayilar);

        System.out.println(sayilar.add(10));//true
        System.out.println(sayilar);

        sayilar.add(20);

        System.out.println(sayilar);//[10, 20]

        sayilar.add(1,15);
        System.out.println(sayilar);//[10, 15, 20]

        sayilar.add(0,44);
        System.out.println(sayilar);

        List<Integer> eklenecekListe=new ArrayList<>();
        eklenecekListe.add(3);
        eklenecekListe.add(5);

        System.out.println(sayilar.addAll(eklenecekListe));
        System.out.println(sayilar);

        sayilar.addAll(1,eklenecekListe);
        System.out.println(sayilar);
    }
}
