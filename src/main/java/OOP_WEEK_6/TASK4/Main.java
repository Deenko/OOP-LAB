package OOP_WEEK_6.TASK4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {6, 5, 8, 7, 11};

        swap(values, 0, 1);

        System.out.println(Arrays.toString(values));

    }

    public static void swap(int [] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }
}
