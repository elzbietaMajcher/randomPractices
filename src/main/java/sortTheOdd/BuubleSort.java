package sortTheOdd;

public class BuubleSort {
    public static int[] sortArray(int[] array) {
        int t;
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length-1; j >= i ; j--) {
                if (array[j-1] > array[j]){
                t = array[j-1];
                array[j-1] = array[j];
                array[j] = t;
                }
            }
        }
        return array;
    }
}
