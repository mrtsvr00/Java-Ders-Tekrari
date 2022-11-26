package day12_whileLoop;

public class T03 {
    public static void main(String[] args) {
        //Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        //donduren bir method olusturun.

        String str="Java candir";
        String tersStr=stringiCevir(str);
        System.out.println(tersStr);


    }

    public static String stringiCevir(String str){
        String tersstr="";
        int index=str.length()-1;
        while (index>=0){
            tersstr+=str.substring(index,index+1);
            index--;
        }
        return tersstr;



    }
}
