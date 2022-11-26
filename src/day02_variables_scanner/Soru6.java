package day02_variables_scanner;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {


        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen dairenin yaricapini giriniz");
        double yaricap= scan.nextDouble();

        System.out.println("Dairenin Cevresi : " + 2*3*yaricap +
                           "\nDairenin Alani : " + 3*yaricap*yaricap);



    }
}
