package OOP_WEEK_6.TASK1;


public class Main {
    public static void main(String[] args) {
        int[] values = {6, 5, 8, 7, 11};


        smallest(values);
    }



    public static int smallest(int[] array){
        int smallest = array[0];

        for (int i = 0; i < array.length ; i++){
            if (array[i] < smallest){
                smallest = array[i];
            }
        }

        System.out.println("Smallest in array is : " + smallest);
        return smallest;
    }
}