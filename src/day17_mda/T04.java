package day17_mda;

public class T04 {
    public static void main(String[] args) {
        // Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        // method olusturun.

        int[][] arr = {{3, 1, 2, 4}, {1, 2}, {3, 4, 5}, {10}, {2, 7}};

        System.out.println(carpimDondur(arr));


    }
    public static int carpimDondur(int[][]arr) {
        int carpim = 1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                carpim *= arr[i][j];

            }
        }
        return carpim;
    }


}






