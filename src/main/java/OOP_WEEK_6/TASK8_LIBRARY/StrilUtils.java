package OOP_WEEK_6.TASK8_LIBRARY;

public class StrilUtils {

    public static boolean included(String word, String searched){
        word = word.toUpperCase().trim();
        searched = searched.toUpperCase().trim();

        return word.contains(searched);
    }
}
