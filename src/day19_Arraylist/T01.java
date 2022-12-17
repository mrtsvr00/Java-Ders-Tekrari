package day19_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class T01 {
    public static void main(String[] args) {

        //Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.

        System.out.println(tekrarsizSayilar());


    }
    public static List<Integer> tekrarsizSayilar(){

        int []arr={2,5,3,6,98,2,4,5,6,8,5,2,1,4,2,3,2,4,1,2};

        List<Integer>tekrarsizListe=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (!tekrarsizListe.contains(arr[i])){
                tekrarsizListe.add(arr[i]);
            }

        }
        return tekrarsizListe;

    }
}
