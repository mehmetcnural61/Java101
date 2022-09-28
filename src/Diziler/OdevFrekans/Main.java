package Diziler.OdevFrekans;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] list = {61, 20, 61, 10, 61, 20, 5, 20 ,35 ,35 ,10 , 201 ,361};
        int[] frequency = new int[list.length];

        System.out.println(Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            frequency[i] = 1;
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    frequency[i]++;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    list[j] = 0;
                }
            }
        }


        for(int i=0;i<list.length;i++){
            if(frequency[i]>=1){
                if(list[i]!=0){
                    System.out.println(list[i]+" sayisi "+frequency[i]+" kez tekrar edildi");
                }
            }
        }
    }
}
