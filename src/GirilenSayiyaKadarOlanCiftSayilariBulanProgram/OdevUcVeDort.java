package GirilenSayiyaKadarOlanCiftSayilariBulanProgram;

import java.util.Scanner;

public class OdevUcVeDort {
    public static void main(String[] args) {

        int number, counter = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        number = input.nextInt();

        double total = 0, average;


        for (int i = 0; i <= number ; i++){
            if((i % 3 == 0) && (i % 4 == 0)){
                System.out.println("Divisible by 3 and 4 : " + i);
                total += i;
                counter++;
            }
        }

        System.out.println("Total : " + total);
        average = total / counter;
        System.out.println("Averaage : " + average);

        input.close();

    }
}

