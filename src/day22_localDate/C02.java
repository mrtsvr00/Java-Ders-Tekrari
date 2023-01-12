package day22_localDate;

import java.time.LocalTime;

public class C02 {
    public static void main(String[] args) {


        LocalTime zaman= LocalTime.now();
        System.out.println(zaman);//20:48:25.504273800

        System.out.println(zaman.withSecond(1).withNano(1));

        LocalTime basZamani= LocalTime.now();
        System.out.println("baslangic zamani : " + basZamani);

        for (int i = 1; i < 10000; i++) {
            System.out.println(i + " ");

        }
        LocalTime bitZamani= LocalTime.now();
        System.out.println("bitis zamani : " + bitZamani);
        System.out.println(bitZamani.getNano()-basZamani.getNano());


    }
}
