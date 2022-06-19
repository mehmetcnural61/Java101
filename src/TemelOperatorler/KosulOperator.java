package TemelOperatorler;

public class KosulOperator {
    public static void main(String[] args) {

        int a=5, b=1,c=5;
        boolean kosul1 = a==c;
        boolean kosul2 = a>=b;
        boolean sonuc1 = kosul1 || kosul2;

        String str =sonuc1 ? "Dogru" : "Değil";
        String str2 = a==c ? "Dogru" : "Değil";
        int result = sonuc1 ? 1 : 0 ;

        System.out.println(str);
        System.out.println(str2);
        System.out.println(result);

        int m=12,n=-5;
        System.out.println(m%n);


    }
}
