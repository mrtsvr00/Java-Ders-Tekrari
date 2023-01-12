package day14_arrays;

public class T04 {
    public static void main(String[] args) {
        // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.

        int[] arr={3,-3,5,-7,-6,1,-2};
        System.out.println(pozitifDondur(arr));


    }
    public static int pozitifDondur(int []arr){
        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]>0){
                toplam+=arr[i];
            }

        }
     return toplam;
    }

}
