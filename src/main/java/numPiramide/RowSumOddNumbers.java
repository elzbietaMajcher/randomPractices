package numPiramide;

public class RowSumOddNumbers {

    public static int rowSumOddNumbers2(int num){
        return (int) Math.pow(num,3); // short version
    }

    public static int rowSumOddNumbers(int num) {

        int sum = 0;
        if (num == 1) return 1;
        else {
            int[] numToSum = findAllRowNum(num);
            for (int i = 0; i < num; i++) {
                sum = sum + numToSum[i];
            }
        }
        return sum;
    }

    public static int[] findAllRowNum(int num) {
        int[] numToSum = new int[num];
        int firstNum = findFirstRowNum(num);
        for (int i = 0; i < num; i++) {
            numToSum[i] = firstNum + (i * 2);
        }
        return numToSum;
    }


    public static int findFirstRowNum(int num) {
        int firstNum = 1;
        int multiplier = num;
        for (int i = 1; i < multiplier; i++) {
            firstNum = firstNum + (2 * i);
        }
        return firstNum;
    }

    private static boolean correctValue(int i) {
        return i > 0;
    }
}
