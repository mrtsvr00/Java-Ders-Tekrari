package sampleQuestions.day04;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    //Soru 31-)
    //Kullanıcıdan Arrayin uzunlugunu isteyin.
    //Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
    //İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("kac kaakterli bir array olsun");
        int karakterUzunlugu=scan.nextInt();

        int []arr=new int[karakterUzunlugu];



        for (int i = 0; i <karakterUzunlugu ; i++) {
            System.out.println("array icin eleman tamsayi giriniz");
            arr[i]=scan.nextInt();


        }
        System.out.println(Arrays.toString(arr));




    }
}
