package OOP_WEEK_6.TASK3;

public class Main {
    public static void main(String[] args) {


        int[] values = {6, 5, 8, 7, 11, 1, 15, 256, 3, 48, 12, 11};

        indexOfTheSmallestStartingFrom(values, 0);
    }

    public static void indexOfTheSmallestStartingFrom(int[] array, int startingFrom){
        int currentNumber = 0;
        int smallest = array[startingFrom];
        int index = 0;


        for (int i = startingFrom; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
                currentNumber = i;
            }
        }

        System.out.println("Index of the smallest starting from: " + startingFrom + " is " + currentNumber);
    }
}
