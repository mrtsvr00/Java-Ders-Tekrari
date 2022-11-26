package day02_variables_scanner;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
        //yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin uzun ve kisa knar uzunluklarini giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();

        System.out.println("Dikdortgen Alani : " + kenar1*kenar2);



    }
}
