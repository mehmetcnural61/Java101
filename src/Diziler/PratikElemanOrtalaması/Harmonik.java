package Diziler.PratikElemanOrtalaması;

public class Harmonik {
    public static void main(String[] args) {

        int[] numbs = {1,2,3,4,5};
        double sum=0.0;
        for(int i=0; i<numbs.length; i++){
            sum = sum + 1.0/numbs[i];
        }
        System.out.println("Harmonic Avg : " + numbs.length / sum);
    }
}
