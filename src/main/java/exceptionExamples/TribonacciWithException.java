package exceptionExamples;

public class TribonacciWithException {



    public static void main(String[] args) {

        double[] s = new double[]{2, 1, 5};

        TribonacciWithException tribonacciex = new TribonacciWithException();

        try {
            System.out.println(tribonacciex.tribonacci(s, 10));
        } catch (Exception e) {
            System.err.println("Handled exception");
            System.out.println("Input array has incorrect value.");
        }

        System.out.println("after");

        double[] c = new double[]{0,1,1};

        try {
            System.out.println(tribonacciex.tribonacci(c, 10));
        } catch (Exception e) {
            System.err.println("Handled exception");
            System.out.println("Input array has incorrect value.");
        }
    }

    public double[] tribonacci(double[] s, int n) throws Exception {
        double result[] = new double[n];



        if (!ifCorrectInput(s)) throw new Exception();
        else {
            for (int i = 0; i < 3; i++) {
                result[i] = s[i];
            }
            for (int j = 3; j < n; j++) {
                double a, b, c;
                a = result[j - 3];
                b = result[j - 2];
                c = result[j - 1];
                result[j] = a + b + c;
            }
            return result;
        }
    }


    public boolean ifCorrectInput(double[] s) {
        if (s.length == 3) {
            if (s[0] <= s[1] && s[1] <= s[2])
                return true;
        }
        return false;
    }

}
