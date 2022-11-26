package day02_variables_scanner;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {


        // Soru 8 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
        //        //degerlerini degistirin(swap)

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki tamsayi giriniz");
        int sayi1=scan.nextInt();//10 kum
        int sayi2=scan.nextInt();//20 su

        sayi2=sayi1+sayi2;//30 kum+su
        sayi1=sayi2-sayi1;//20 kum+su-kum=su
        sayi2=sayi2-sayi1;//10 kum+su-su=kum
        System.out.println("sayi1 swap degeri : " + sayi1 + " " + "\nsayi2 swap degeri : " + sayi2);

    }
}
