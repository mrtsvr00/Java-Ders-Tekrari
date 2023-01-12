package day20_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class T02 {
    public static void main(String[] args) {
        //Soru 2- Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
        //yazdiran bir method olusturun.

        Integer[] arr = {2, 3, 1, 3, 2, 2};

        kareleriniDondur(arr);

    }
    public static void kareleriniDondur(Integer[] arr){
        int toplam=0;

        for (Integer each:arr
             ) {

            toplam+=each*each;



        }
        System.out.println(toplam);


    }


}

