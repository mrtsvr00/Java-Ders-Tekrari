package day02_variables_scanner;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {

        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int temp;

        temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;

        System.out.println("sayi1 : " + sayi1 +
                           "\nsayi2 : " + sayi2);





    }
}
