package Diziler.ArraySinifiveMetotları;

public class HelpArray {
    void print(int[]arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
        void print(double[]arr){
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println("]");
    }
}
