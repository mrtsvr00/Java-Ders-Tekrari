package day07_forLoops;

public class T07 {
    public static void main(String[] args) {
        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        int sayi=1231111;
        int birlerBas=0;
        int rakamlarTop=0;
        String sayistr=""+sayi;

        for (int i = 0; i < sayistr.length() ; i++) {
            birlerBas=sayi%10;
            rakamlarTop=rakamlarTop+birlerBas;
            sayi=sayi/10;

        }
        System.out.println(rakamlarTop);
    }
    }


