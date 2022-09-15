package Metotlar.UsHesabiOdev;

import java.awt.*;
import java.util.Scanner;

public class Main {

    static  int power(int numb1,int numb2) {
        int result = 1;
        for (int i = 1; i <= numb2; i++) {
            result *= numb1;
        }return result;
    }
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Taban Sayiyi Giriniz: ");
        int numb1= input.nextInt();
        System.out.print("Üs Sayiyi Giriniz: ");
        int numb2=input.nextInt();

        System.out.println("Sonuç: "+power(numb1,numb2));


    }
}
