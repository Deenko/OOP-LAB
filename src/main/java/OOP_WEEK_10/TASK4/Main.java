package OOP_WEEK_10.TASK4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Song> playlist = new ArrayList<>();
        playlist.add(new Song("Song1", "Artist1", "Rock"));
        playlist.add(new Song("Song2", "Artist2", "Pop"));
        playlist.add(new Song("Song3", "Artist3", "Rock"));
        playlist.add(new Song("Song4", "Artist4", "Hip Hop"));

        GenreFilterIterator iterator = new GenreFilterIterator(playlist, "Rock");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
