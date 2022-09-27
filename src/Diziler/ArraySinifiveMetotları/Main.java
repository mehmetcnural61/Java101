package Diziler.ArraySinifiveMetotları;

public class Main {
    public static void main(String[] args) {

        int[] list= {1,2,3,4,};
        int[] list2={5,6,7,12,2};
        double[] list3={1.1,2.2,3.3};

        HelpArray helper=new HelpArray();

        helper.print(list);
        System.out.println("---");
        helper.print(list2);
        System.out.println("---");
        helper.print(list3);
    }
}
