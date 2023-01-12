package day22_localDate;

import java.time.LocalDate;
import java.time.Period;

public class C05 {
    public static void main(String[] args) {

        LocalDate dogumTarihi= LocalDate.of(1995, 8, 12);
        LocalDate bugun=LocalDate.now();

        Period yas=Period.between(dogumTarihi,bugun);
        System.out.println(yas);
        System.out.println();
    }
}
