package SayilariBuyuktenKucugeSiralama;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int a,b,c;

    Scanner input=new Scanner(System.in);

        System.out.println("Birinci Sayiyi Giriniz: ");
        a=input.nextInt();
        System.out.println("İkinci Sayiyi Giriniz: ");
        b=input.nextInt();
        System.out.println("Ucuncu Sayiyi Giriniz: ");
        c=input.nextInt();

        if ((a > b) && ( a > c)){
            if ((b > c)){
                System.out.println("a > b > c");
            }else {
                System.out.println("a > c > b");
            }
        } else if ((b > a)&& (b > c)) {
            if (a > c) {
                System.out.println("b > a > c");
            }else {
                if (a > b ){
                    System.out.println("c > a > b");
                }else {
                    System.out.println("c > b > a");
                }
            }
        }

    }
}
