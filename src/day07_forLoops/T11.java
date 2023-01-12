package day07_forLoops;

public class T11 {
    public static void main(String[] args) {
        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
        //kontrol edin ve sonucu yazdirin.

        int sayi=2;
        boolean bayrak=false;

        for (int i = 2; i <=sayi-1 ; i--) {
            if (sayi%i==0) {
                bayrak=true;
                break;

            }


        }
        System.out.println(bayrak);

        if (bayrak) System.out.println("Asal sayi degil");
        else System.out.println("Asal sayi");


    }
}
