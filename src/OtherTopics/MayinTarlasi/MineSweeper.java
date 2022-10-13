package OtherTopics.MayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumb, colNumb, size;
    int[][] map;
    int[][] board;
    boolean game = true;

    Random random = new Random();
    Scanner inp = new Scanner(System.in);

    MineSweeper(int rowNumb, int colNumb) {
        this.rowNumb = rowNumb;
        this.colNumb = colNumb;
        this.map = new int[rowNumb][colNumb];
        this.board = new int[rowNumb][colNumb];
        this.size = rowNumb * colNumb;
        //(rowNumber * colNumber)
    }


    public void run() {
        int row, col, success = 0;
        prepGame();
    //    print(map);
        System.out.println("Game Started !");
        while (game) {
            print(board);
            System.out.print("Row: ");
            row = inp.nextInt();
            System.out.print("Column: ");
            col = inp.nextInt();

            if (row < 0 || row >= rowNumb ) {
                System.out.println("Invalid Coordinate Try Again!");
                continue;
            }
            if (col < 0 || col >= colNumb ) {
                System.out.println("Invalid Coordinate Try Again !");
                continue;
            }
            if (map[row][col] != -1) {
                checkMine(row, col);
                success++;
                if (success == (size) - (size / 4)) {
                    System.out.println("Congratulations, You didn't press any Mine");
                    break;
                }
            } else {
                game = false;
                System.out.println("BooM ! Game Over");
            }

        }
    }

    public void checkMine(int row, int col) {
        if (map[row][col] == 0) {
            if ((col < colNumb - 1) && (map[row][col + 1] == -1)) {
                board[row][col]++;
            }
            if ((row < rowNumb - 1) && (map[row + 1][col] == -1)) {
                board[row][col]++;
            }
            if ((row > 0) && (map[row - 1][col] == -1)) {
                board[row][col]++;
            }
            if ((col > 0) && (map[row][col - 1] == -1)) {
                board[row][col]++;
            }
            if (board[row][col] == 0) {
                board[row][col] = 2;
            }
        }

    }

    //checkMine Alternative with For
   /* public void checkMine2(int r, int c) {
        if (map[r][c] == 0) {
            for (int i = (r - 1); i <= (r + 1); i++) {
                if (i < 0 || i == rowNumb) {
                    continue;
                }
                for (int j = (c - 1); j <= (c + 1); j++) {
                    if (j < 0 || j == colNumb) {
                        continue;
                    }
                    if (map[i][j] == -1) {
                        board[r][c]++;
                    }
                }
            }
            if (board[r][c] == 0) {
                board[r][c] = -2;
            }
        }
    }*/

    //generate Random Numbers
    public void prepGame() {
        int generateRow, generateCol, count = 0;
        //(elemanSayisi / 4)
        while (count != (size / 4)) {
            generateRow = random.nextInt(rowNumb);
            generateCol = random.nextInt(colNumb);
            if (map[generateRow][generateCol] != -1) {
                map[generateRow][generateCol] = -1;
                count++;
            }
        }


    }

    //multidimensional Array
    public void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] >= 0)
                    System.out.print(" ");
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
