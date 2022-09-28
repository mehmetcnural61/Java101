package Diziler.PratikMaxMinBulma;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int[] list ={61,35,54,48,-14,28,-61};

        int max=list[0];
        int min=list[0];

        System.out.println(Arrays.toString(list));
        System.out.print("Sayinizi Giriniz: ");
        int numb=inp.nextInt();

        Arrays.sort(list);
        for (int i:list)    {
            if (i < numb){
                min=i;
            }
            if (i > numb){
                max=i;
                break;
            }
        }
        System.out.println("Girilen sayiden küçük en yakin sayi: "+min);
        System.out.println("Girilen sayiden büyük en yakin sayi: "+max);
    }
}
