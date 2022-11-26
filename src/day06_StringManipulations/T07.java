package day06_StringManipulations;

public class T07 {
    public static void main(String[] args) {
        /*
        kullanicidan bir mail alin
        - mail @ icermiyorsa "gecersiz mail"
        - mail @gmail.com icermiyorsa, "mail gmail olmali"
        - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.
         */

        String mail="muratsever0000@gmail.com";

        if (!(mail.contains("@")))
            System.out.println("gecersiz mail");


        if (!(mail.endsWith("@gmail.com")))
            System.out.println("mailde yazim hatasi var");


        if (!(mail.contains("@gmail.com")))
            System.out.println("mail gmail olmali");


    }
}
