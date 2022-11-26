package day06_StringManipulations;

public class T02 {
    public static void main(String[] args) {
        //Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //input1 : “15.30 €” , input2 : “11.40 €”
        //output : 36.70 €

        String input1="15.30 $";
        String input2="11.40 $";


        String input3=input1.substring(6);//$
        System.out.println(input3);

        System.out.println(input1=input1.replace('.', 'h'));//15h30 $
        System.out.println(input2=input2.replace('.', 'h'));//11h40 $

        System.out.println(input1 = input1.replaceAll("\\W", ""));//15h30
        System.out.println(input2 = input2.replaceAll("\\W", ""));//11h40

        System.out.println(input1=input1.replace('h', '.'));//15.30
        System.out.println(input2=input2.replace('h', '.'));//11.40

        double ceviri1=Double.parseDouble(input1);//15.30
        System.out.println(input1);
        double ceviri2=Double.parseDouble(input2);//11.40
        System.out.println(input2);


        System.out.println((ceviri1+ceviri2) + " " + input3);//26.700000000000003 $




    }
}