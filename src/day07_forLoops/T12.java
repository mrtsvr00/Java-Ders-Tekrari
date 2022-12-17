package day07_forLoops;

import java.util.Scanner;

public class T12 {
    public static void main(String[] args) {
        int i, j, k = 1;
        for (i = 1; i <= 5; i += 2) {
            for (j = 5; j >= 1; j--) {
                if (j > i)
                    System.out.print(" ");
                else
                    System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
