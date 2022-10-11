package OtherTopics.PratikSayiTahminOyunu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /** İki farklı şekilde random int sayı oluşturduk double to int !
         *
         int number= (int)(Math.random()*100);
         System.out.println(number);

         Random random=new Random();
         int number2= random.nextInt(100);
         System.out.println(number2);

         */

        Random random = new Random();
        int number = random.nextInt(100);

        Scanner inp = new Scanner(System.in);
        int gameRight = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin=false;
        boolean isWrong=false;
        System.out.println(number);

        while (gameRight < 5) {
            System.out.print("Tahmininizi Giriniz: ");
            selected = inp.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasinda bir değer giriniz !");
                if (isWrong){
                    gameRight++;
                    System.out.println("Çok fazla hatali giriş yaptiniz.Kalan Hak:"+(5-gameRight));

                }else {
                    isWrong=true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir!");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler,doğru tahmin ! Tahmin ettiğiniz sayi " + number);
                isWin=true;
                break;
            } else {

                System.out.println("Hatali bir sayi girdiniz !");
                if (selected > number) {
                    System.out.println(selected + " sayisi,gizli sayidan büyüktür.");
                } else {
                    System.out.println(selected + " sayisi,gizli sayidan küçüktür.");
                }
                wrong[gameRight] = selected;
                gameRight++;
                System.out.println("Kalan hakkiniz: " + (5 - gameRight));
            }

        }
        if (!isWin){
            System.out.println("Kaybettiniz!! :(");
            if (!isWrong){
                System.out.println("Tahminleriniz: "+ Arrays.toString(wrong));
            }
        }

    }
}
