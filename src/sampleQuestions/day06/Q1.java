package sampleQuestions.day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {
    /*
    Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
 kazandığını gösteren bir method yazınız.

 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
   2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
   3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
   4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
   5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır ortalama
             kazançtan yüksekse o günleri return yap.
   6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
             ortalama kazançtan aşağıysa o günleri return yap.


     */

    static double ortKazanc=0;


    public static void main(String[] args) {

        List<String> gunler=new ArrayList<>(Arrays.asList("Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar"));

        List<Integer>gunlukKazanclar=new ArrayList<>(Arrays.asList(25,35,25,25,99,55,88));



        getOrtalamaKazanc(gunlukKazanclar, gunler);



        

    }

    private static void getOrtalamaninUstundeKazancGünleri(List<Integer>gunlukKazanclar,List<String> gunler) {
        int enYuksekKazanc=gunlukKazanclar.get(0);

        for (int i = 0; i <gunlukKazanclar.size() ; i++) {
            if (ortKazanc<gunlukKazanclar.get(i)){



            }

        }
    }

    private static void getOrtalamaKazanc(List<Integer>gunlukKazanclar,List<String> gunler) {


        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            ortKazanc+= (gunlukKazanclar.get(i))/7;


        }
        System.out.println(ortKazanc);
    }

}

