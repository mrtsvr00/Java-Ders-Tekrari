package day05_TernaryOperator;

public class T01_5Soru {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa  “Sayi 5’in tam kati” yazdirin.

        int sayi=12;

        System.out.println(sayi%5==0 ? "5`in tam kati" : "5 in tam kati degil");

        //Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
        int kenar1=5;
        int kenar2=5;
        int kenar3=5;

        System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "Eskenar ucgen" : "Eskenar ucgen degil");

        //Soru 3- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin

        char harf='h';
        System.out.println(harf>='A' && harf<='Z' ? harf : (char)(harf-32));

        //Soru 4- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den kucukse “Maalesef kaldin” yazdirin.

        int not=60;

        System.out.println(not>=50 ? "Sinifi Gectin" : "Maalesef kaldin");


        //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin


        int sayi1=50;
        int sayi2=65;
        System.out.println(sayi1<sayi2 ? sayi2 : sayi1);

        //Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        int sayi3=-56;

        sayi3=sayi3<0 ? sayi3*-1 : sayi3;
        System.out.println(sayi3);


    }
}
