package ArmstrongSayilariBulanProgram;

import java.util.Scanner;

public class BirSayiSonBasBulma {
    public static void main(String[] args) {

        // 2451 %10 = 1

        //üs Alma
/*
        int sub =2,sup=3;
        int result =1;

        for (int i=1; i<=sup; i++){
            result *=sub;
        }
        System.out.println(result);
 */
        Scanner input =new Scanner(System.in);
        System.out.print("Sayi Giriniz:");
        int number=input.nextInt();
        int basNumber=0, tempNumber=number;
        int basValue;
        int result=0;
        int basPow; //üst alma pow=ingilizce

        while (tempNumber !=0 ){
            tempNumber/=10;
            basNumber++;
        }
        tempNumber=number;
        System.out.println("Basamak Sayisi: "+basNumber);

        while (tempNumber !=0){
            basValue=tempNumber %10;
            basPow=1;
            // 1*1*1*1 = 1^4
            for (int i=1; i<=basNumber; i++){
                basPow *=basValue;
            }
            result +=basPow;
            tempNumber /=10;

        }
        if (result ==number){
            System.out.println(number+" sayisi bir Armstrong sayidir !");
        }else {
            System.out.println(number+" sayisi bir Armstrong sayi değildir !");
        }

    }
}
