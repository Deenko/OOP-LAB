package OOP_WEEK_10.TASK4;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class GenreFilterIterator implements Iterator<Song> {

    private List<Song> playlist;
    private String genre;
    int i = 0;

    public GenreFilterIterator(List<Song> playlist, String genre){
        this.playlist = playlist;
        this.genre = genre;
    }



    @Override
    public boolean hasNext() {

        while (i < playlist.size() && !playlist.get(i).getGenre().equals(genre)){
            i++;
        }
        return i < playlist.size();
    }

    @Override
    public Song next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        return playlist.get(i++);
    }
}
