package day05_IfElseStatements;

import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {


        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Ucgenin uc kenar uzunlugunu giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3)
            System.out.println("Eskenar Ucgen");
        else
            System.out.println("Eskenar Ucgen Degil");

    }
}
