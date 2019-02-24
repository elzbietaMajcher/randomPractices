package reducingNumbersKata;

import java.util.stream.Collectors;

public class ReduceNumbers {

    public static void main(String[] args) {

        int num = 942;
        int result = reduce(num);
        System.out.println(result);


        int[] numbers = new int[]{1,2,3,4};
        String numberFromInt = String.valueOf(numbers);
        System.out.println(numberFromInt.toString());
    }


    public static int reduce(int num) {
        int reduceNum = 0;
        String[] c = String.valueOf(num).split("");
        if (c.length == 1)return Integer.valueOf(c[0]);
        else {
            for (int i = 0; i <c.length ; i++) {
             reduceNum = reduceNum + Integer.valueOf(c[i]);
            }
        }
        return reduce(reduceNum);
    }

    public int squareDigits(int num) {
        String[] c = String.valueOf(num).split("");
        String[] result = new String[c.length];
        String resultNumber="";
        for (int i = 0; i<c.length; i++){
            result[i] = String.valueOf((int)Math.pow(Integer.valueOf(c[i]),2));
            resultNumber = resultNumber + result[i];
        }
        int resultInteger = Integer.valueOf(resultNumber);
        return Integer.valueOf(resultNumber);
    }

    public int squareDigits2(int n) {
        String result = "";

        while (n != 0) {
            int digit = n % 10 ;
            result = digit*digit + result ;
            n /= 10 ;
        }

        return Integer.parseInt(result) ;
    }

    public int squareDigits3(int n) {
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }


    public int squareDigits4(int n) {
        if (n < 10) return n * n;
        else {
            int h = squareDigits4(n / 10);
            int l = n % 10;
            return Integer.parseInt(h + "" + l * l);
        }
    }

}
