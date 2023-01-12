package day12_whileLoop;

public class T03 {
    public static void main(String[] args) {
        //Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        //donduren bir method olusturun.

        String str="Java candir";


        System.out.println(terseCevir(str));


    }
    public static String terseCevir(String str){
        int index=str.length()-1;
        String tersStr="";

        while(index>=0){
            tersStr+= str.charAt(index);

            index--;
        }
      return tersStr;
    }
}
