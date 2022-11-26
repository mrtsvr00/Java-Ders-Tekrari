package day12_whileLoop;

public class T02 {
    public static void main(String[] args) {
        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.


        int sayi=1453;
        int rakTop=0;
        int birlerBas=0;


        while (sayi>0){
            birlerBas=sayi%10;
            rakTop+=birlerBas;
            sayi=sayi/10;

        }
        System.out.println(rakTop);


    }
}
