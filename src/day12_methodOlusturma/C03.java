package day12_methodOlusturma;

public class C03 {

    //Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
    //olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
    //sonuclarini donduren bir method olusturun.

    public static void main(String[] args) {
        int sayi=55;

        asalSayimi(sayi);




    }
    public static void asalSayimi(int sayi){
        String sonuc="asal";

        for (int i = 2; i < sayi ; i++) {

            if (sayi%i==0){
                sonuc="asal degil";
                break;

            }

        }
        if (sonuc!="asal degil") System.out.println("asal");
        else System.out.println("asal degil");
        }

    }

