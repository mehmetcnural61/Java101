package Diziler.OdevDizidekiElemanlariSiralama;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int newArray;
        System.out.print("Dizinin boyutu : ");
        newArray = input.nextInt();
        int[] array = new int[newArray];

        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ". Sayi : ");
            array[i] = input.nextInt();

        }
        Arrays.sort(array);
        System.out.println("Küçükten Büyüğe Sıralama: "+Arrays.toString(array));



        }
    }

