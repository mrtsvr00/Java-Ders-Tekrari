package day12_methodOlusturma;

public class C01 {
    //Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
    //baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
    //bir method olusturun.
    //- kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
    //mesaji verin
    //- kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
    //yazdirin.




    public static void main(String[] args) {
        String str = "cemito cemito";
        int basIndexi=5;
        int bitIndexi=9;

        stringYazdir(str,2,3);
        stringYazdir(str,5,9);

    }

    public static void stringYazdir(String input, int basIndexi,int bitIndexi){
        if (basIndexi>bitIndexi) System.out.println("hatali giris");
        else if (input.length()<=bitIndexi) System.out.println("hatali giris");
        else
            for (int i = basIndexi; i < bitIndexi; i++) {
                System.out.print(input.charAt(i));


            }
        System.out.print("");


    }


    }




