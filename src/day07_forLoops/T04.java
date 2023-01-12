package day07_forLoops;

public class T04 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucuk olsa da program calissin

        int basDeger=4;
        int bitDeger=3;
        int toplamDeger = 0;

        if (basDeger<=bitDeger){

            for (int i = basDeger; i <=bitDeger ; i++) {
                toplamDeger += i;
            }
                System.out.print(toplamDeger + " ");

        }else {
            for (int i = basDeger; i >=bitDeger ; i--) {
                toplamDeger += i;
            }
                System.out.print(toplamDeger + " ");

        }
    }
}
