package day05_NestedIfStatements;

import java.util.Scanner;

public class T04 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
        //“Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
        //gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
        //zamani” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String gun=scan.nextLine();

        if (gun.equalsIgnoreCase("cumartesi") || gun.equalsIgnoreCase("pazar")) System.out.println("Simdi dinlenme zamani");
        else if (gun.equalsIgnoreCase("pazartesi")) System.out.println("Simdi calisma zamani tatile 5 gun var");
        else if (gun.equalsIgnoreCase("sali")) System.out.println("Simdi calisma zamani tatile 4 gun var");
        else if (gun.equalsIgnoreCase("carsamba")) System.out.println("Simdi calisma zamani tatile 3 gun var");
        else if (gun.equalsIgnoreCase("persembe")) System.out.println("Simdi calisma zamani tatile 2 gun var");
        else System.out.println("Simdi calisma zamani tatile 1 gun var");




    }
}
