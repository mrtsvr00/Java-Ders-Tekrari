package day20_forEachLoop;

public class T04 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        //kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        String cumle="Java ogrenmek cok guzel";
        String harf="e";

        String []cumleArr=cumle.split("");
        int sayac=0;

        for (String each:cumleArr
             ) {
            if (each.equals("e")){
                sayac++;


            }

        }
        if (sayac==0) System.out.println("harf cumlede kullanilmamis");
        else System.out.println(sayac + " kere kullanilmis");



    }
}
