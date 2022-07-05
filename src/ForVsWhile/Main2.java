package ForVsWhile;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
    int sayi2;

        do{
            System.out.print("Sayi Giriniz: ");
            sayi2=input.nextInt();
        }
        while (sayi2 > 0);
    }
}
