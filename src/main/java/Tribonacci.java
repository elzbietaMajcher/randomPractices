public class Tribonacci {
    public Tribonacci() {
    }


    public static void main(String[] args) {

        double[] s = new double[]{2, 1, 5};

        Tribonacci tribonacci = new Tribonacci();

        System.out.println(tribonacci.tribonacci(s, 10));


    }

    public double[] tribonacci(double[] s, int n) {
        double result[] = new double[n];

        if (ifCorrectInput(s)) {
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
        else {
            System.out.println("Input array has incorrect values.");
        }return result;
    }


    public boolean ifCorrectInput(double[] s) {
        if (s.length == 3) {
            if (s[0] <= s[1] && s[1] <= s[2])
                return true;
        }
        return false;
    }

}
