package sampleQuestions.day04;

import java.util.Arrays;

public class Q6 {
    //Soru 33-)
    //Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın (boşluklar ve özel karakterler dahil).
    //Örnek:
    //String str=''Kodlama harika.''
    //String arr[]: ".etaerg si gnidoC"
    //İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın
    public static void main(String[] args) {
        String str = "Kodlama harika.";
        String [] arr = str.split("");
        String tersi = "";
        for (int i = arr.length-1 ; i >= 0 ; i--) {
            tersi += arr[i];
        }
        System.out.println(tersi);

    }
}
