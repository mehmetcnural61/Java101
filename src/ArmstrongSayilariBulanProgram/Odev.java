package ArmstrongSayilariBulanProgram;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {

        int top=0,adet=0;

        Scanner input= new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        int number= input.nextInt();


        while (number != 0)
        {
            top += (number%10);
            number/=10;
            ++adet;
        }


        System.out.println("Basamak Toplami: "+top);

    }
}
