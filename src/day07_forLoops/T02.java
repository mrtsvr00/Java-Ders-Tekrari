package day07_forLoops;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        //dahil) 7 ila bolunebilen sayilari yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if (i%7==0) System.out.print(i + " ");


        }




    }
}
