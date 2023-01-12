package day07_forLoops;

import java.util.Scanner;

public class T08 {
    public static void main(String[] args) {
        //Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
        //tamsayilari yazdirin, sira
        //- 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        //- 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        //- hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz
        //yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi<=0) {
            System.out.println("hatali");
        }else{

            for (int i = 1; i <=sayi ; i++) {


                if (sayi%3==0 && sayi%5==0) {
                    System.out.println("fizzBuzz");
                    break;
                }else if (sayi%3==0) {
                    System.out.println("fizz");
                    break;
                }else if (sayi%5==0) {
                    System.out.println("buzz");
                    break;
                }else{
                    System.out.print(i + " ");
                }

        }



        }

    }
        }
