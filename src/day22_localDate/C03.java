package day22_localDate;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class C03 {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now(ZoneId.of("Turkey"));
        System.out.println(ldt);
    }
}
