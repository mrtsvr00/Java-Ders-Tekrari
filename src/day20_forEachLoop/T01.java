package day20_forEachLoop;

import java.util.*;

public class T01 {
    public static void main(String[] args) {
        //Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.

        Integer [] arr={2,3,4,6,3,4,6,1,8,5,4};

        List<Integer>tekrarsizListe=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizListe.contains(arr[i])){
                tekrarsizListe.add(arr[i]);
            }

        }

        Collections.sort(tekrarsizListe);


        Integer []yeniArray=tekrarsizListe.toArray(new Integer[0]);
        //Object []yeniArray=tekrarsizListe.toArray();

        System.out.println(Arrays.toString(yeniArray));





    }
}
