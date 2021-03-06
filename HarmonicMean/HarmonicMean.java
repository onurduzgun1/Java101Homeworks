package Java101Odevler.HarmonicMean;

public class HarmonicMean {
    static double HarmonicMeanCalc(int[] arr){
        double sum = 0, N = arr.length;
        for (int i = 0; i < N; i++) {
            sum += (1.0 / arr[i]);
        }
        return N / sum;
    }
    public static void main(String[] args) {
        int [] numbers = {34, 55, 60, 35, 250, 55, 83};
        System.out.println("Harmonic Mean = " + HarmonicMeanCalc(numbers));
    }
}
