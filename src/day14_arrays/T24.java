package day14_arrays;

import java.util.Arrays;

public class T24 {
    public static void main(String[] args) {


        int[] arr = {1,8,9,3,7,2,5,8,1};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 8));
        System.out.println(Arrays.binarySearch(arr, 100070));
    }
}
