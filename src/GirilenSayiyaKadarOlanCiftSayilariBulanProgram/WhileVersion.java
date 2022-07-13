package GirilenSayiyaKadarOlanCiftSayilariBulanProgram;

import java.util.Scanner;

public class WhileVersion {
    public static void main(String[] args) {
        int sayi;
        int i=1;
        Scanner input=new Scanner(System.in);

        System.out.print("Sayiyi Giriniz: ");
        sayi=input.nextInt();

        while (i <= sayi ){
            i++;
            if (i % 2 == 0){
                System.out.println(i);

            }
        }

    }
}
