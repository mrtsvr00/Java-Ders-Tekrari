package day07_forLoops;

public class T08 {
    public static void main(String[] args) {
        //Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
        //tamsayilari yazdirin, sira
        //- 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        //- 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        //- hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz
        //yazdirin

        int sayi=30;

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%3==0 && sayi%5==0) {
                System.out.print("fizzBuzz");
                break;
            }else if (sayi%5==0) {
                System.out.print("buzz ");
                break;
            }else if (sayi%3==0){
                System.out.print("fizz ");
                break;
            }else {
                System.out.print(i + " ");

            }
        }
    }
}
