package Diziler.CokBoyutluDiziler;

public class Main {
    public static void main(String[] args) {

        int[] list = new int[5];
        int[] list2 = {1, 2, 3, 4, 5};


        int[][] matris = {
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };
        System.out.println(matris[5][5]);

        System.out.println("====");

        int[][] matris2 = new int[3][4];
        // matris2[0][0],[0][1],...[0][n]
        int number1 = 1;
        //matris[i]
        for (int i = 0; i < matris2.length; i++) {
            for (int j = 0; j < matris2[i].length; j++) {
                matris2[i][j]=number1++;
            }
        }
        for (int i = 0; i < matris2.length; i++) {
            for (int j = 0; j < matris2[i].length; j++) {
                System.out.print(matris2[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
