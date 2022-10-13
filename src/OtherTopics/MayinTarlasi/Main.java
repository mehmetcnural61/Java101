package OtherTopics.MayinTarlasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int row, column;

        System.out.println("! Minesweeper Game Started !");
        System.out.println("Please enter the sizes you want to play");

        System.out.print("Enter the Row Number: ");
        row = inp.nextInt();
        System.out.print("Enter the Column Number: ");
        column = inp.nextInt();

        MineSweeper mineSweeper=new MineSweeper(row,column);

        mineSweeper.run();


    }
}
