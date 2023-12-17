package OOP_WEEK_6.TASK5;

public class Main {
    public static void main(String[] args) {
        int[] values = {1, 4, 8, 9, 11};
        binarySearch(values, 11);
    }


    public static void binarySearch(int[] array, int searchedNumber){

        int left = 0;

        int right = array.length - 1;


        while (left <= right){
        int middlePos = (left + right) / 2;
        int middleNumber = array[middlePos];

        if (searchedNumber == middleNumber){
            System.out.println("Number found : " + searchedNumber);
            break;
        }if (searchedNumber < middleNumber){
                right = middlePos - 1;
            } else if (searchedNumber > middleNumber) {
            left = middlePos +1;
            } else if (searchedNumber < middleNumber){
                System.out.println("Number not found !");
            } else {
                System.out.println("Gay");
            }
        }
    }
}
