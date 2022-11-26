package day06_switchStatements;

import java.util.Scanner;

public class T05 {
    public static void main(String[] args) {


        //Soru 5- Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz");
        int gunNo= scan.nextInt();

        switch (gunNo){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 : System.out.println("HaftaIci");break;
            case 6 :
            case 7 : System.out.println("HaftaSonu");break;
            default : System.out.println("Gecersiz Giris");
        }

    }
}
