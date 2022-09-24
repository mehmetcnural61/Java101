package Diziler.DizilerinGenelMantıkları;

public class Main {
    public static void main(String[] args) {

        int a1=10;
        a1=20;
        int a2=20;

        int[] list=new int[10];
        list[0]=10;
        list[1]=20;
        list[2]=30;
        list[3]=20;
        System.out.println(list[1]);

        System.out.println("===");

        int[] list2=new int[10];
        for (int i=0; i< list2.length;i++){
            list2[i]=(i*10)+10;
            System.out.println(list2[i]);
        }

        System.out.println("===");

        int[] list3={10,20,30,40,50,60,70,80,90,100};
        System.out.println(list3[9]);

        for(int i=0; i< list3.length;i++){
            System.out.println(list3[i]);
        }



    }
}
