package day06_switchStatements;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki basamakli bir sayi giriniz");
        int sayi=scan.nextInt();

        switch (sayi){
            case 10 : System.out.println("on");break;
            case 20 : System.out.println("yirmi");break;
            case 30 : System.out.println("otuz");break;
            case 40 : System.out.println("kirk");break;
            case 50 : System.out.println("elli");break;
            case 60 : System.out.println("altmis");break;
            case 70 : System.out.println("yetmis");break;
            case 80 : System.out.println("seksen");break;
            case 90 : System.out.println("doksan");break;
            default : System.out.println("gecersiz giris");

        }

    }
}
