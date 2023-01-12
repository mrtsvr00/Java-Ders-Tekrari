package day19_Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T04 {
    public static void main(String[] args) {

        //Soru 4- Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci
        //sayisini bir list olarak donduren bir method olusturun.
        System.out.println(fibonacciDondur());


    }
    public static List<Integer> fibonacciDondur(){

        Scanner scan=new Scanner(System.in);
        System.out.println("Kac adet fibonacci sayisi istediginizi yaziniz");
        int n =scan.nextInt();

        List<Integer> fibonacciListesi=new ArrayList<>();

        if (n==0) {
            System.out.println("gecersiz giris");
            return null;
        }else if (n==1){
            fibonacciListesi.add(0);
            return fibonacciListesi;
        }else if (n==2){
            fibonacciListesi.add(0);
            fibonacciListesi.add(1);
            return fibonacciListesi;
        }else{
            int sayi1 = 0;
            int sayi2 = 1;
            int sayi3 = 1;

            fibonacciListesi.add(sayi1);
            fibonacciListesi.add(sayi2);



            for (int i = 0; fibonacciListesi.size() <= n; i++) {// // 0 1 1 2 3 5 8 13 21 34 55 89 144 .....

                fibonacciListesi.add(sayi3);

                sayi1=sayi2;
                sayi2=sayi3;
                sayi3=sayi1+sayi2;




            }
        }
        return fibonacciListesi;





    }
}
