package OOP_WEEK_6.TASK6;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 5, 6, 7, 2 , 15 , 63 , 14};

        printElegantly(array);
    }



    public static void printElegantly(int[] array){
        for (int i = 1; i < array.length; i++){
            if (i == array.length - 1){
                System.out.println(array[i]);
            } else {
                System.out.println(array[i] + ", ");
            }
        }

    }
}
