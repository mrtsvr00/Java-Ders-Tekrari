package day07_forLoops;

public class T03 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        int basDeger=20;
        int bitDeger=5;
        int toplamDeger = 0;

        for (int i = basDeger; i <=bitDeger ; i++) {
            if (basDeger <= bitDeger){
                toplamDeger += i;
                System.out.print(toplamDeger + " ");
            }else
                System.out.print("uyari");
        }

    }
}
