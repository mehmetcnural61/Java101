package Metotlar.PratikPalindromSayi;

import java.util.Scanner;

public class Odev {
    static boolean isPalindrome(int number){
        int temp = number, reverseNumber = 0, lastNumb;

        while (temp != 0){
            lastNumb = temp % 10 ;
            reverseNumber = (reverseNumber * 10) + lastNumb ;
            temp /= 10 ;
        }
        if (number == reverseNumber) {
            System.out.println(number + " is a palindrome number !");
            return true;
        } else {
            System.out.println(number + " is not a palindrome number !");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        isPalindrome(number);
    }
}
