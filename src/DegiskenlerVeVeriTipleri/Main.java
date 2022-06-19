package DegiskenlerVeVeriTipleri;

public class Main {
  /*Referans noktamız burdan başla */
  public static void main(String[] args) {
      //int numberOne = 5;
        int numberOne ,numberTwo =2 ,numberThree ;
        numberOne = 5;
        numberThree = numberOne+numberTwo;
      System.out.println("Sayi 1 ve Sayi 2 Toplami:  "+numberThree);
      System.out.println("Sayimiz: "+numberOne+" ve "+numberTwo);

      int kisaKenar=10,uzunKenar=20;
      int alan =kisaKenar*uzunKenar;
      int cevre = 2 * (kisaKenar+uzunKenar);
      System.out.println("Alan:"+alan);
      System.out.println("Cevre:"+cevre);
    }
}
