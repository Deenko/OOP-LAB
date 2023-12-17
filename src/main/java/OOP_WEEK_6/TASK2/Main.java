package OOP_WEEK_6.TASK2;

public class Main {
    public static void main(String[] args) {

        int[] values = {6, 5, 8, 7, 11};
        indexOfTheSmallest(values);

    }

    public static int indexOfTheSmallest(int[] array){
        int smallest = array[0];
        int currentIndex = 0;

        for (int i = 0; i < array.length ; i++){
            if (array[i] < smallest){
                smallest = array[i];
                currentIndex = i;
            }
        }

        System.out.println("Smallest number is: " + smallest + " \nAnd it's index is: " + currentIndex);
        return 0;
    }
}
