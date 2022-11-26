package day12_methodOlusturma;

public class C03 {

    //Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
    //olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
    //sonuclarini donduren bir method olusturun.

    public static void main(String[] args) {
        int sayi=55;
        System.out.println(asalSayimi(sayi));
        System.out.println(asalSayimi(65));


    }

    public static String asalSayimi(int sayi){
        String sonuc="";
        for (int i = 2; i <= sayi-1 ; i++) {

            if (sayi%i==0) {
                sonuc = "Asal degil";
                break;
            }

        }
        if (!sonuc.equals("Asal degil")) {
            System.out.println("Asal sayi");
        }


        return sonuc;
    }
}
