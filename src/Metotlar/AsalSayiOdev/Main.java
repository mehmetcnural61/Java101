package Metotlar.AsalSayiOdev;
import java.util.Scanner;
public class Main {

    static void prime(int numb,int i) {
        if (i == numb) {
            System.out.print(numb + " it's a  Prime ");
            return;
        } else if (numb % i == 0) {
            System.out.print(numb + "  not a Prime");
            return;
        }

        prime(numb, i + 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int sayi=input.nextInt();
        prime(sayi,2);

    }
}
