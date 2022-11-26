package day06_StringManipulations;

public class T08 {
    public static void main(String[] args) {


        /*
        Soru 1 : Kullanicidan bir String ve aranacak metin alin. String’in aranan metni
        icerip icermedigini indexOf( ) method’u kullanarak yazdirin.
        Soru 2 : Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
        icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin.
        - String aranan metni icermiyor
        - Aranan metin String’de sadece 1 kere kullanilmis
        - Aranan metin String’de sadece 1’den fazla kullanilmis
         */

        String cumle = "Java cok guzeldir cok.";
        String metin = "cok";

        if (!(cumle.contains(metin)))
            System.out.println("String aranan metni icermiyor");
        else {
            int ilkIndex = cumle.indexOf(metin);
            int ikinciIndex = cumle.indexOf(cumle.indexOf(metin), cumle.lastIndexOf(metin));

            if (ikinciIndex == -1)
                System.out.println("sadece 1 kere kullanilmis");
            else
                System.out.println("sadece 1’den fazla kullanilmis");
            }

        }
    }
