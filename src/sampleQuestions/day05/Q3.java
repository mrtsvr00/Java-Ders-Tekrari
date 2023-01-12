package sampleQuestions.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Q3 {

    //Soru 41-)
    //Parametre olarak 2 Int Array kabul eden ve 2 Arrayi yeni bir Arraye ekleyen ve yazdıran bir method yazın.
    //		 * Input1={1,2,3,4}
    //		 * Input2={5,6}
    //		 * Çıktı={1,2,3,4,5,6}

    public static void main(String[] args) {

        int []Input1={1,2,3,4};
        int []Input2={5,6};

        tekArrayDondur(Input1, Input2);
    }

    public static void tekArrayDondur(int []Input1,int []Input2){


        List<Integer>yeniArrayList=new ArrayList<>();

        for (int i = 0; i < Input1.length; i++) {
            yeniArrayList.add(Input1[i]);
        }
        for (int i = 0; i < Input2.length ; i++) {
            yeniArrayList.add(Input2[i]);

        }
        Object[] arr =yeniArrayList.toArray();

        System.out.println(Arrays.toString(arr));



    }
}
