package sortTheOdd;

public class Kata {
    public static void main(String[] args) {
        String given= "amamy throw Some Ada";
        String out = given.replaceAll("[AaEeIiOoUu]", "");
        System.out.println(out);

    }
//    You have an array of numbers.
//    Your task is to sort ascending odd numbers but even numbers must be on their places.
//
//    Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.
//
//            Example
//
//    sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]

    public static int[] sortArray(int[] array) {
        int size = array.length;
        int t;
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                if (checkIfOdd(array[i])) {
                    for (int j = i + 1; j < size; j++) {
                        if (checkIfOdd(array[j]) && array[i] > array[j]) {
                                t = array[i];
                                array[i] = array[j];
                                array[j] = t;
                        }
                    }
                }
            }
        }
        return array;
    }

    public static boolean checkIfOdd(int i) {
        if (i % 2 != 0 && i!=0) return true;
        return false;
    }
}