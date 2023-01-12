package day19_Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T06 {
    public static void main(String[] args) {


        //Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
        //tamsayilari bir liste olarak bize donduren bir method olusturun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Tam bolenlerini listelemek icin pozitif bir tam sayi girin");
        int sayi = scan.nextInt();
        if (sayi<=0){
            System.out.println("Gecersiz sayi");
        }else {
            List<Integer> tamBolenlerListesi = tamBolenlerListesiOlustur(sayi);
            System.out.println(tamBolenlerListesi);

        }
    }
    public static List<Integer> tamBolenlerListesiOlustur(int sayi){

        List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {

            if (sayi % i == 0) {
                tamBolenlerListesi.add(i);

            }

        }
        return tamBolenlerListesi;
    }

}

