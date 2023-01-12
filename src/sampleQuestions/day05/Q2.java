package sampleQuestions.day05;

public class Q2 {

    //Soru-40)
    //Bir diziyi (Array) parametre olarak kabul eden ve dizideki tüm elemanların toplamını döndüren bir method yazın
    // ve ardından sonucu main methodda yazdırın.
    //Örn:
    //girdi : {1,2,3,4,5,6,7,8}
    //çıkış: 36
    //ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün

    public static void main(String[] args) {

        int []arr={1,2,3,4,5,6,7,8};

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            toplam+=arr[i];

        }
        System.out.println(toplam);
    }
}
