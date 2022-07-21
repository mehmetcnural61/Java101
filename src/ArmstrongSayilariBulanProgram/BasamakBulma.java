package ArmstrongSayilariBulanProgram;

public class BasamakBulma {
    public static void main(String[] args) {
        int a=2451, basamakSayisi=0, numberCounter=0  ;

 // Basamak Bulma
        //2451 /10 = 245
        //245 /10 = 24
        //24 /10 = 2
        //2 /10 =0
        //0 /10=0

        System.out.println("Sayimiz :"+a);
        while (a !=0){
            a= a/ 10;
            // a/=10;
            System.out.println(a);
            numberCounter++;
        }
        System.out.println("Sayimizin Basamak Sayisi: "+numberCounter);
    }
}
