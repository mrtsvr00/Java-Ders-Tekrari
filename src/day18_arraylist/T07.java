package day18_arraylist;

import java.util.ArrayList;
import java.util.List;

public class T07 {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(arr[i]);

        }

        System.out.println(sayilar);

        System.out.println(sayilar.indexOf(2));

        System.out.println(sayilar.indexOf(5));

        System.out.println(sayilar.lastIndexOf(3));

    }
}
