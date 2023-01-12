package sampleQuestions.day01;

public class S07 {
    //Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
    //(Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
    //ipuclari:
    //Data Casting konusuna bakiniz. Auto Widening ve Explicit Narrowing konularini hatirlayalim.
    public static void main(String[] args) {

        double sayi=(short)54.565665656565;
        System.out.println(sayi);
        float sayi1=(short)56565.56565f;
        System.out.println(sayi1);
        long sayi2=(short)565662665;
        System.out.println(sayi2);

    }
}
