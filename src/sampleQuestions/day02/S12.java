package sampleQuestions.day02;

public class S12 {
    //Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
    //Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım
    //
    //Ipucu:  IF/Else kullanabilirsiniz.
    //Örnek:
    //İki tamsayı girin:
    //25  veya  4567986321453
    //46   veya 123456
    //Konsolda Çıktı :
    //Sayıların toplamı: 71  veya  Fazla Yüklenme (edited)
    public static void main(String[] args) {

        double sayi1=4567986321453.0;
        int sayi2=25;

        double toplam=sayi1+sayi2;
        String toplamStr=""+toplam;

        if (toplamStr.length()>=10) System.out.println("sayilarin toplami : " + toplam +" Fazla Yüklenme");


    }


}
