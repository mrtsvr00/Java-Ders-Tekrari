package day12_methodOlusturma;

public class C02 {
    //Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    //Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    //isim bosluk soyisim seklinde bize donduren bir method olusturun
    //input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
    public static void main(String[] args) {

        String isim = "AHMET";
        String soyisim = "KARAHANLI";

        String yeniIsimSoyisim=isimDuzenle(isim, soyisim);
        System.out.println(yeniIsimSoyisim);


    }
    public static String isimDuzenle(String isim,String soyisim){
        String yeniIsimSoyisim=isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() + " " +
                               soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase();


        return yeniIsimSoyisim;


    }




}
