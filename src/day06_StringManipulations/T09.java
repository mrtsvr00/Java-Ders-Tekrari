package day06_StringManipulations;

public class T09 {
    public static void main(String[] args) {


        /*
        Kullanicidan bir String ve aranacak metin alin. String’in aranan metni
        icerip icermedigini lastIndexOf( ) method’u kullanarak yazdirin.
        Soru 2 : Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
        icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini
        yazdirin
        - String aranan metni icermiyor
        - Aranan metin String’de sadece 1 kere kullanilmis
        - Aranan metin String’de sadece 1’den fazla kullanilmis

         */
        String cumle= "Java cok guzeldir cok.";
        String metin= "cok";
        int ilkIndex=cumle.indexOf(metin);
        int sonIndex=cumle.lastIndexOf(metin);

        if (ilkIndex==-1) System.out.println("String aranan metni icermiyor");
        else if (ilkIndex==sonIndex) System.out.println("Aranan metin String’de sadece 1 kere kullanilmis");
        else System.out.println("Aranan metin String’de sadece 1’den fazla kullanilmis");
    }
}
