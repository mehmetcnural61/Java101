package Metotlar.GelismisHesapMakinesi;

import java.util.Scanner;

public class Main {

    static int sum(int numb1,int numb2){
        int result = numb1+numb2;
        System.out.println("Toplam : "+result);
        return result;
    }

    static  int minus(int numb1, int numb2){
        int result= numb1-numb2;
        System.out.println("Çıkarma: "+result);
        return result;
    }

    static  int multiple(int numb1,int numb2){
        int result = numb1 * numb2;
        System.out.println("Çarpma: "+result);
        return result;
    }

    static int divided(int numb1,int numb2){
        if (numb2 == 0){
            System.out.println("İkinci sayı 0'dan farklı olmalı");
            return 0;
        }
        int result = numb1 / numb2;
        System.out.println("Bölme: "+result);
        return result;
    }

    static  int power(int numb1,int numb2) {
        int result = 1;
        for (int i = 1; i <= numb2; i++) {
            result *= numb1;
        }return result;
    }

    static  int mod(int numb1,int numb2){
        return numb1 % numb2;
    }

    static void calc(int numb1,int numb2){
        System.out.println("Çevresi: "+(2*(numb1+numb2)));
        System.out.println("Alan: "+ numb1*numb2);
    }

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        while(true) {
            System.out.println(menu);
            System.out.println("===");
            System.out.print("Bir İşlem Seçiniz: ");
            select = input.nextInt();
            if (select == 0 ){
                break;
            }
            System.out.print("Birinci Sayiyi Giriniz: ");
            int numb1= input.nextInt();
            System.out.print("İkinci Sayiyi Giriniz: ");
            int numb2=input.nextInt();


            switch (select){
                case 1:
                    sum(numb1,numb2);
                    break;
                case 2:
                    minus(numb1,numb2);
                    break;
                case 3:
                    multiple(numb1,numb2);
                    break;
                case 4:
                    divided(numb1,numb2);
                    break;
                case 5:
                    System.out.println("Üs Hesabı: "+power(numb1,numb2));
                case 6:
                    System.out.println("Mod İşlemi: "+mod(numb1,numb2));
                case 7:
                    calc(numb1,numb2);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz ! ");

            }


        }
        System.out.println("Have a nice day ..");
    }

}
