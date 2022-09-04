package Metotlar;

public class Tanitim {

    static  void  helloWorld(){
        System.out.println("Merhaba Dünya");
    }

    static int power (int base,int exp){
        int result=1;
        for(int i=1; i<= exp; i++){
            result *=base;
        }
        return result;
    }

    public static void main(String[] args) {

        int n1=2,n2=3;
        int case1= power(2,3);
        int case2=power(n1,n2);
        System.out.println(case1);
        System.out.println(case2);

        System.out.println("====");

        System.out.println(power(2,3));
        System.out.println(power(n1,n2));

        System.out.println("====");

        helloWorld();
        helloWorld();




        // f(x) = 2x+5
        // f(6) = 2x+6+5= 17
        //f(x,y,z) = 3x + 2y + 5z
        // f(2,3,4) = 3*2 + 2*3 + 5*4 = 26

        //alt , üst
  /*      int base =2,exp=3,result=1;
        for(int i=1; i <=exp; i++){
            result *=base;
        }
        System.out.println(result);

        base =4;
        exp=2;
        result=1;

        for(int i=1; i <=exp; i++){
            result *=base;
        }

        System.out.println(result);

*/


    }
}
