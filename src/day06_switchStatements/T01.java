package day06_switchStatements;

import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {


        //Soru 1- Kullanicidan bir rakam alip, rakami yaziyla yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen rakam giriniz");
        int rakam=scan.nextInt();

        switch (rakam){
            case 1 : System.out.println("Bir");break;
            case 2 : System.out.println("Iki");break;
            case 3 : System.out.println("Uc");break;
            case 4 : System.out.println("Dort");break;
            case 5 : System.out.println("Bes");break;
            case 6 : System.out.println("Alti");break;
            case 7 : System.out.println("yedi");break;
            case 8 : System.out.println("Sekiz");break;
            case 9 : System.out.println("Dokuz");break;
            case 0 : System.out.println("Sifir");break;
            default : System.out.println("Gecersiz Giris");

        }

    }
}
