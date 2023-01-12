package day14_arrays;

import java.util.Arrays;

public class T22 {
    public static void main(String[] args) {
        // Verilen bir int array'de en kucuk ve en buyuk sayilari
        // yazdiran bir method olusturun

        int[] arr={3,8,1,5,2,9};
        enBuyukElementiYazdir(arr);

    }
    public static void enBuyukElementiYazdir(int[]arr){

        Arrays.sort(arr);

        System.out.println("En buyuk element : " + arr[arr.length-1]);
        System.out.println("En kucuk element : " + arr[0]);

        }

    }

