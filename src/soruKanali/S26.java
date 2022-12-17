package soruKanali;

public class S26 {
    public static void main(String[] args) {


        //Soru 26-)
        //Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
        //NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
        //Örnek:
        //Giriş :6
        //Çıkış: 6 Mükemmel Sayıdır
        //Giriş :7
        //Çıkış:7 Mükemmel Sayı Değildir
        //ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile bu soruyu çözebilirsiniz :wink:



        int sayi=16;
        int toplam=0;

        for (int i = sayi-1; i >= 1; i--) {
            if (sayi%i==0){
                toplam+=i;

            }

        }
        if (toplam==sayi) System.out.println("mukemmel sayi");
        else System.out.println("mukemmel sayi degil");
    }
}
