package MaxMinOdev;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Kaç tane sayi gireceksiniz :");
    int n = input.nextInt();
    int max = 0, min = 0;

    for (int i = 1; i <= n; i++) {

        System.out.print(i + ". Sayiyi giriniz : ");
        int number = input.nextInt();

        if (i == 1) {
            max = number;
            min = number;

        }
        if (number > max) {
            max = number;

        }
        if (number < min) {
            min = number;

        }

    }
    System.out.println("En buyuk sayi: " + max);
    System.out.println("En kucuk sayi: " + min);


    }

}

