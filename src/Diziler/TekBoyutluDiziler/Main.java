package Diziler.TekBoyutluDiziler;

public class Main {
    public static void main(String[] args) {

        double[] list1=new double[5];
        list1[0]=4.1;

        System.out.println(list1[0]);

        String[] weekDays = new String[]
                { "Pazartesi", "Salı", "Çarşamba",
                        "Perşembe", "Cuma", "Cumartesi", "Pazar" };

        for (int i = 0; i <= (weekDays.length-1); i++) {
            System.out.println(weekDays[i]);
        }

    }
}
