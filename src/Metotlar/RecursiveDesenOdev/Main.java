package Metotlar.RecursiveDesenOdev;

import java.util.Scanner;

public class Main {


    public static void decIncByFive(int num) {
        System.out.print(num + " ");
        if (num <= 0) return;
        decIncByFive(num - 5);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();
        decIncByFive(sayi);
    }



}