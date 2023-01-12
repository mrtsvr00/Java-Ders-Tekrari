package sampleQuestions.day04;

import java.util.Arrays;

public class Q8 {
    //Soru 35-)
    //Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
    //		--> toCharArray() yöntemini kullanmayın
    //Örnek:
    //		String isim:    Yakup
    //		char arr[]:     [Y,a,k,u,p]
    //İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin.
    // Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin

    public static void main(String[] args) {
        String isim=   "Yakup";

        arrayDondur(isim);




    }
    public static void arrayDondur(String isim){

        String[] arr=isim.split("");

        char[]yeniArr=new char[isim.length()];

        for (int i = 0; i < yeniArr.length ; i++) {
            yeniArr[i]=isim.charAt(i);




        }
        System.out.println(Arrays.toString(yeniArr));
    }
}
