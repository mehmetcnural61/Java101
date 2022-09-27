package Diziler.ArraySinifiveMetotları;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        int[] list= {1,2,3,4,55,-21,23};
        double[] list2={5,6,7,12,2};
        Arrays.fill(list2,10);//
        Arrays.sort(list); //=

        System.out.println(Arrays.toString(list));

        System.out.println(Arrays.binarySearch(list,4));//=
        System.out.println("***");


        System.out.println(Arrays.toString(list2));

        System.out.println("****");

        System.out.println(Arrays.toString(list)); //

        System.out.println("****");

        System.out.println(HelpArray2.search(list,55));

        System.out.println("-*-*-*-");

        int[] copy= Arrays.copyOf(list,4);
        System.out.println(Arrays.toString(list));




    }
}
