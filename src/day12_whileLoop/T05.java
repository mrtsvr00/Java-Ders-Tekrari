package day12_whileLoop;

public class T05 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
        //kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
        //olusturun.

        int sayi=5;
        int us=2;
        usHesapla(sayi, 2);



    }
    public static void usHesapla(int sayi,int us){
        int sonuc=1;

        while(us>0){
            sonuc*=sayi;
            us--;

        }
        System.out.println(sonuc);

    }
}
