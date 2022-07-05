package ContinueAndBreak;

public class Main2 {
    public static void main(String[] args) {
        int m=1;

        while ( m <= 10){
            m++;
            if (m % 2 == 0){
                continue;
            }
            System.out.println(m);

        }

    }
}
