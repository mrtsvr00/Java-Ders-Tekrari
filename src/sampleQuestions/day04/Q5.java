package sampleQuestions.day04;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    //Soru 32-)
    //Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
    //İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin...

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen arrayin lenghtini giriniz");
        int lenght=scan.nextInt();

        int []arrReverse=new int[lenght];

        for (int i = lenght-1; i >=0 ; i--) {
            System.out.println("lutfen arrayin icine sayi giriniz");
            arrReverse[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(arrReverse));

    }
}
