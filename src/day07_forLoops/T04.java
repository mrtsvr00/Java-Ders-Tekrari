package day07_forLoops;

public class T04 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucuk olsa da program calissin

        int basDeger=0;
        int bitDeger=6;
        int toplamDeger = 0;



            for (int i = basDeger; i <=bitDeger ; i++) {
                if (basDeger<=bitDeger){
                toplamDeger+=i;
                System.out.print(toplamDeger + " ");
            }
            }
    }
}
