package day06_switchStatements;

import java.util.Scanner;

public class T04 {
    public static void main(String[] args) {


        //Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        //        ve girilen harfin karsiligini yazdirin.
        //        I : International S : Software T : Testing Q : Qualifications B: Board

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        switch (harf){
            case 'I' : System.out.println("International");break;
            case 'S' : System.out.println("Software");break;
            case 'T' : System.out.println("Testing");break;
            case 'Q' : System.out.println("Qualifications");break;
            case 'B' : System.out.println("Board");break;
            default : System.out.println("Gecersiz giris");
        }

    }
}
