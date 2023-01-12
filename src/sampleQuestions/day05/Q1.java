package sampleQuestions.day05;

import java.util.Arrays;

public class Q1 {

    //Soru-39)
    //Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve verilen bu (Arrayden) diziden minimum ve
    // maksimum sayıları yazdıran bir yöntem yazın
    //Örnek:
    //Input : {3,2,5,4,1,6}
    //Output :
    //min: 1
    //max: 6
    //Ipucu: sort yöntemni kullanabilirsiniz.

    public static void main(String[] args) {
        int []arr={3,2,5,4,1,6};

        Arrays.sort(arr);

        int min=arr[0];
        int max=arr[arr.length-1];

        System.out.println("minimum sayi : " + min + "\nmaximim sayi : " + max);

        }
    }






