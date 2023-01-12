package sampleQuestions.day04;

public class Q9 {
    //Soru 36-)
    //Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
    // ( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
    //Örnek:
    //inputarr[]=   {1,2,3,4,5,6,7}
    //output:         4
    //İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz. Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir,
    // Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)
    //------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        int arr[]=   {1,2,3,4,5,6,7,8};

        System.out.println(ortaElemaniDondur(arr));


    }
    public static int ortaElemaniDondur(int[]arr){

        int ortaElemani=arr[0];

        for (int i = 0; i < arr.length; i++) {
            ortaElemani=arr[arr.length/2];

        }

        return ortaElemani;

    }
}
