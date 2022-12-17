package day13_doWhileLoop;

public class T03 {
    public static void main(String[] args) {

        ////Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
        //        //bulunuz, tamkare ise true değilse false yazdırınız.
        //        //Ornek : input : 16, output: 4

        int sayi=1;
        int tamKare=49;
        boolean sonuc=true;

       do {
           if (sayi*sayi==tamKare){
               System.out.println(sayi);
               sonuc=true;
               break;

           }else
               sayi++;

       }while(sayi*sayi<=tamKare);
        System.out.println(sonuc);

    }
}

