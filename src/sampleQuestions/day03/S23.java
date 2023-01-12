package sampleQuestions.day03;

public class S23 {
    public static void main(String[] args) {

        //Soru 23-)
        //Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın. Method bize çıktıyı döndürsün.
        //Örnek:
        //Girdi: 6
        //Çıktı: 6!=65432*1=720
        //ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
        int sayi=6;

        System.out.println(faktoriyel(sayi));


    }
    public static int faktoriyel(int sayi){
        int faktoryel=1;

        for (int i = sayi; i > 1 ; i--) {
            faktoryel*=i;

        }
        return faktoryel;

    }
}
