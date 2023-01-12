package day22_localDate;

import java.time.LocalDate;

public class C01 {
    public static void main(String[] args) {


        LocalDate tarih= LocalDate.now();
        System.out.println(tarih);
        System.out.println(tarih.getDayOfWeek());

        System.out.println(tarih.withYear(2015));

        System.out.println(tarih.minusWeeks(4));

        System.out.println(tarih.plusMonths(3));

        LocalDate tarih1=LocalDate.of(1977,02,22);
        LocalDate tarih2=LocalDate.of(1955,05,02);

        System.out.println(tarih1.isBefore(tarih2));
    }
}
