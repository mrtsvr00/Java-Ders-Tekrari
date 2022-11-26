package day07_forLoops;

public class T10 {
    public static void main(String[] args) {
        //Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip
        //kaydedin.

        String str="Jav";
        String tersStr="";

        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+=str.substring(i,i+1);


        }
        System.out.println(tersStr);





    }
}
