package day20_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class T02 {
    public static void main(String[] args) {
        //Soru 2- Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
        //yazdiran bir method olusturun.

        Integer [] arr={2,3};
        System.out.println(karelerToplami(arr));


    }
    public static int karelerToplami(Integer [] arr ){

        int toplam=0;


        for (Integer each:arr
             ) {
            toplam+=each*each;


        }
        return toplam;

    }
}
