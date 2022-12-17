package day18_arraylist;

import java.util.ArrayList;
import java.util.List;

public class T05 {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);

        }

        System.out.println(sayilar.set(5, 12));
        int eskiDeger=sayilar.set(1, 9);
        System.out.println(eskiDeger);
        System.out.println(sayilar);


    }
}
