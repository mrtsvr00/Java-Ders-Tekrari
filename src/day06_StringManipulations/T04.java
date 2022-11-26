package day06_StringManipulations;

public class T04 {
    public static void main(String[] args) {


        //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        //duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        //basariyla kaydedildi" yazdirin
        //- ilk harf kucuk harf olmali
        //- son karakter rakam olmali
        //- sifre bosluk icermemeli
        //- uzunlugu en az 10 karakter olmali

        String sifre="Dhs sjcgh";
        int bayrak=0;


        if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z') {
        }else System.out.println("ilk harf kucuk olmali");
        bayrak++;

        if (sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9'){
        }else System.out.println("son karakter rakam olmali");
        bayrak++;

        if (!(sifre.contains(" "))){
        }else System.out.println("sifre bosluk icermemeli");
        bayrak++;

        if (sifre.length()>=10){
        }else System.out.println("uzunlugu en az 10 karakter olmali");
        bayrak++;

        if (bayrak==0) System.out.println("sifre basariyla kaydedildi");



    }
}
