package Metotlar.RecursiveMetots;

public class Main {

    static int test(int n) {
        int result= 0;
        for (int i = 1; i<=n; i++){
            result +=1;
        }
        return result;
    }

    static  int f(int n){
        System.out.println("n => "+n);

        if (n==1){
            return 1;
        }
        int result = f(n - 1) + n;
        System.out.println("Result => "+ result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(f(3));


        // f(4) = f(3) + 4;
        // f(3) = f(2) + 3;
        // f(2) = f(1) + 2;
        //f(n) = f(n-1) + n;

    }
}

