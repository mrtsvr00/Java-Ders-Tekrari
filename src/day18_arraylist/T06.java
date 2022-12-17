package day18_arraylist;

import java.util.ArrayList;
import java.util.List;

public class T06 {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);

        }
        sayilar.remove(2);
        System.out.println(sayilar);

        System.out.println(sayilar.remove(5));

        Integer silinecekObje=4;
        sayilar.remove(silinecekObje);
        System.out.println(sayilar);

        silinecekObje=3;

        while(sayilar.contains(silinecekObje)){
            sayilar.remove(silinecekObje);


        }

        System.out.println(sayilar);

        silinecekObje=10;

        System.out.println(sayilar.remove(silinecekObje));

        sayilar.remove(20);//IndexOutOfBoundsException


    }
}
