package Diziler.DizilerinGenelMantıkları;

public class Main2 {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
/////////////////
    static int[] reverse(int[] list3) {
        int[] reverse = new int[list3.length];
        for (int i=0,j=list3.length -1;i< list3.length;i++,j--){
            reverse[i]=list3[j];
        }
        return reverse;
    }
    static void printArrays(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void main(String[] args) {

        int[] list = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        double[] list2 = {1.1, 2.2, 3.3};
        printArray(list2);

//////////////

        System.out.println("===");

        int[] newListe=reverse(list);
        printArray(newListe);


    }
}
