package day14_arrays;

import java.util.Arrays;

public class T01 {
    public static void main(String[] args) {

        int[] arr1 = {2,4,6,8,10};

        // array'in bir elementine ulasmak ve update etmek ist

        arr1[2]=5;
        System.out.println(Arrays.toString(arr1));
        // son elementi yazdirin

        System.out.println(arr1[arr1.length-1]);

        // array'in tum elementlerini yazdirin

        System.out.println(Arrays.toString(arr1));

        String [] arr= {"Ali", "Ulus","Nesrin"};

        // Bu array'in tum elementlerini aralarinda bir bosluk birakarak yazdiralim

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + ",");

        }

        System.out.println("");

        System.out.println(Arrays.toString(arr));






    }
}
