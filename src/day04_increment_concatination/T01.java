package day04_increment_concatination;

public class T01 {
    public static void main(String[] args) {


        int a=10;
        int b=20;
        String str1="";
        String str2=" ";
        String str3="-";

        System.out.println(a+b);//30

        System.out.println(str1+a+b);//"1020"

        System.out.println(a+str2+b);//"10 20"

        System.out.println(a+b+str3);//"30-"

        System.out.println(str1+a*b);//"200"

        System.out.println(str2+(a+b));//" 30"

        //System.out.println(str1-a); + disinda hicbir islem String le kullanilamaz.
    }
}
