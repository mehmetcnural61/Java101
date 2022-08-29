package AsalSayiBulanOdev;

public class Main {
    public static void main(String[] args) {

        String asalSayilar = "";
        for (int i = 1; i <= 100; i++) {
            int sayac = 0;
            for (int m = i; m >= 1; m--) {
                if (i % m == 0) {
                    sayac ++;
                }
            }
            if (sayac == 2) {
                asalSayilar = asalSayilar + i + " ";
            }
        }
        System.out.println("1 ile 100 arasindaki Asal Sayilar: "+asalSayilar);
    }
}
