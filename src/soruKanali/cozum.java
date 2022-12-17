package soruKanali;

public class cozum {
   /*
        Soru 21-)
Bir aydaki gün sayısını bulmak için bir Java programı yazın
(Mülakat Sorusu / Interview Sorusu / Leak Year)
Örnek:
Bir ay numarası girin: 2
Bir yıl girin: 2016
Şubat 2016'da 29 gün vardır
ipucu:
Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir. Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!

        int ay=2;
        int yil = 2001;
        int kacGun=0;
        switch (ay){
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        kacGun=31;
        break;
        case 4: case 6: case 9: case 11:
        kacGun=30;
        break;
        case 2:
        if(artikMi(yil).equals("Artik yil")){
        kacGun=29;
        }else{
        kacGun=28;
        }
        break;
        }
        System.out.println(yil+" yilinda "+ay+". ay "+kacGun+" gun surmektedir");
        }public static String artikMi(int yil){
        String sonuc="";
        if ((yil % 4 == 0 && yil%100!=0 )|| yil%400==0){
        sonuc= "Artik yil";
        }else{
        sonuc="Artik yil degil";
        }
        return sonuc;



       Soru 22-) Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
Giriş :
30 ve 40
​
Beklenen Çıktı:
30 ve 40 için EBOB= 10
30 ve 40 için EKOK= 120
ipucu:
Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen ebob ve ekokunu hesaplamak uzere iki sayi giriniz");
        int sayi1=sc.nextInt();
        int sayi2=sc.nextInt();
        int ebob=1;
        int ekok=1;
        int kucukSayi=1;
        if(sayi1<sayi2){
        kucukSayi=sayi1;
        }else {
        kucukSayi=sayi2;
        }
        for (int i = 2; i <=kucukSayi ; i++) {
        if (sayi1 % i == 0 && sayi2 % i == 0) {
        ebob = i;
        }
        }
        ekok=(sayi1*sayi2)/ebob;
        System.out.println("sayilarin ebobu = " + ebob + " sayilarin ekoku = "+ekok);
        }
        }





*/


}