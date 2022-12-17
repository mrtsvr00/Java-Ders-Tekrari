package day20_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class T03 {
    public static void main(String[] args) {

        //Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        //- Kelimenin uzunlugu cift sayi ise ilk yarisini
        //- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        //yeni bir listeye ekleyip yazdirin.

        String[] cumle={"Java", "ogrenmek" ,"cok" ,"guzel"};

        List<String> kelimelerBirligi=new ArrayList<>();

        for (String each:cumle
             ) {
            if (each.length()%2==0) {
                kelimelerBirligi.add(each.substring(0, each.length() / 2));
            }else {
                kelimelerBirligi.add(each.substring(each.length() / 2));

        }

        }
        System.out.println(kelimelerBirligi);

    }
}
