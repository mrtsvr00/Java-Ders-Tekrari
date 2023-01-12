package day19_Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T03 {
    public static void main(String[] args) {

        ////Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
        //kismini list olarak bize donduren bir method olusturun

        List<String> isimListesi=T02.listeDondur();
        System.out.println(istenmeyenIsimleriSil(isimListesi));


    }
    public static List<String> istenmeyenIsimleriSil(List<String> isimListesi){

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen istemediginiz harfi giriniz");
        String istenmeyenHarf=scan.next().substring(0,1);

        List<String>yeniListe= new ArrayList<>();

        for (int i = 0; i <isimListesi.size() ; i++) {

            if (!isimListesi.get(i).contains(istenmeyenHarf)){
                yeniListe.add(isimListesi.get(i));
            }

        }
        return yeniListe;

    }
}
