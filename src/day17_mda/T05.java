package day17_mda;

import java.util.Arrays;

public class T05 {
    public static void main(String[] args) {
        //        //Soru 5- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
        //        //toplaminini yazdiran bir method olusturun


        int[][] arr = {{3, 1, 2, 4}, {1, 2}, {3, 4, 5}, {10}, {2, 7}};

        sonElementTopla(arr);


    }

    public static void sonElementTopla(int[][] arr) {

        int toplam = 0;
        int [] toplamArrayi=arr[0];

        for (int i = 0; i < arr.length; i++) {

            toplam += arr[i][(arr[i].length-1)];





        }
        System.out.println(toplam);

    }
}