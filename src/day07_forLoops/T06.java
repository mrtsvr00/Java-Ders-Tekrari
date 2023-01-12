package day07_forLoops;

public class T06 {
    public static void main(String[] args) {


        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        int sayi=6;
        int faktoriyel=1;
        System.out.print(sayi+ "! = ");

        for (int i = sayi; i >=1; i--) {
            faktoriyel*=i;

            System.out.print(i + " * ");

        }
        System.out.println( " = " + faktoriyel);


    }
}
