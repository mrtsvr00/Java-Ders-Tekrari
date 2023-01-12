package day22_localDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class c04 {
    public static void main(String[] args) {

        LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(ldt.format(format1));

        DateTimeFormatter format2=DateTimeFormatter.ofPattern("MM.dd.yyyy EEEE");
        System.out.println(ldt.format(format2));

        DateTimeFormatter format3=DateTimeFormatter.ofPattern("HH:mm a");
        System.out.println(ldt.format(format3));



    }
}
