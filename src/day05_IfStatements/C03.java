package day05_IfStatements;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        //sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%15==0)
            System.out.println("3 ve 5");
        if (sayi%5==0)
            System.out.println("5 ile ");
        if (sayi%3==0)
            System.out.println("3 ile ");

    }




}
