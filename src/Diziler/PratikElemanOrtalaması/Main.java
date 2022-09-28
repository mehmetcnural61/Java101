package Diziler.PratikElemanOrtalaması;

public class Main {
    public static void main(String[] args) {

        int[] list={15,6,7,12,9,10};
        double sum=0;

        for (int i = 0; i < list.length; i++) {
            sum+=list[i];
        }

        double avg=sum/ list.length;
        System.out.println(avg);

    }
}
