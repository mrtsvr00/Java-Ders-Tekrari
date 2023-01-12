package day14_arrays;

import java.util.Arrays;

public class T03 {
    public static void main(String[] args) {

        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.

        int[] arr = {2,4,6,8};

        int [] yeniArr=ikiArtir(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int []ikiArtir(int[]kahtaliMici){

        for (int i = 0; i < kahtaliMici.length; i++) {
            kahtaliMici[i]=kahtaliMici[i] + 2;



        }
        return kahtaliMici;

    }
}
