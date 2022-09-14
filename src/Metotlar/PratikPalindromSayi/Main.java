package Metotlar.PratikPalindromSayi;



public class Main {

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber= 0,lastNumber;
        while (temp !=0){
            System.out.println("=======");
            System.out.println("Sayi => "+ temp);

             lastNumber=temp % 10;
            System.out.println("Son Basamak => "+lastNumber);

             reverseNumber = (reverseNumber * 10 )+lastNumber;
            System.out.println("Yeni Sayi => "+reverseNumber);

             temp /=10;
            System.out.println("Yeni Temp => "+temp);
        }
        System.out.println("===");
        if (number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        System.out.println(isPalindrom(101));

         // isPalindrom(247);
        // 7 * 10 = 70+4 = 74
        // 74 * 10 = 740 + 2 = 742

    }
}
