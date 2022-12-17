package day13_arrays;

import java.util.Arrays;

public class T26 {
    public static void main(String[] args) {

        String str= "java gercekten cok cok guzel";
        // verilen str'da kac tane e harfi oldugunu bulunuz

        String []eArrayi=str.split("e");
        System.out.println(Arrays.toString(eArrayi));
        System.out.println(eArrayi.length);


        String [] tumKarakterlerArr=str.split("");
        System.out.println(Arrays.toString(tumKarakterlerArr));

        int sayac=0;

        for (int i = 0; i < tumKarakterlerArr.length; i++) {

            if (tumKarakterlerArr[i].equals("e")){
                sayac++;
            }

        }
        System.out.println("e sayisi : " + sayac);



    }
}
