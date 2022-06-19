package KullanicidanVeriAlma;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("A sayisini giriniz: ");
        a = input.nextInt();

        System.out.println(a);

        System.out.println("Bir Deger giriniz:");
        double b = input.nextDouble();
        System.out.println(b);

        System.out.println("Kelime veya Cumle Girin:");
        String str = input.nextLine();
        System.out.println(str);
    }
}
